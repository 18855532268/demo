package com.example.manage.web;

import com.example.manage.config.myinterface.RequestJson;
import com.example.manage.constant.Constants;
import com.example.manage.service.RawMaterialsService;
import com.example.manage.vo.ReturnVO;
import com.example.manage.vo.rawMaterialsStore.PurchaseVo;
import com.example.manage.vo.rawMaterialsStore.RawMaterialsStoreVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 原材料仓库
 */
@RestController
@Slf4j
@RequestMapping("/rawMaterialsStore")
public class RawMaterialsStoreController {

    @Autowired
    private RawMaterialsService rawMaterialsService;

    // 新增原材料
    @PostMapping("/addRawMaterialsStore")
    public ReturnVO addRawMaterials(@RequestBody RawMaterialsStoreVo rawMaterialsStoreVo) {
        rawMaterialsService.addRawMaterial(rawMaterialsStoreVo);
        return ReturnVO.getSuccess();
    }

    @GetMapping("/getRawMaterialsPage")
    public ReturnVO getRawMaterialsPage(@RequestParam(defaultValue = Constants.PAGE_DEFAULT_START) Integer page,
                                        @RequestParam(defaultValue = Constants.PAGE_DEFAULT_SIZE) Integer pageSize , Integer status) {
        return ReturnVO.getSuccess(rawMaterialsService.getRawMaterialsPage(page, pageSize, status));
    }

    /**
     * 添加采购记录
     *
     * @param purchaseVo
     * @return
     */
    @PostMapping("/addPurchaseRecord")
    public ReturnVO addPurchaseRecord(@RequestBody PurchaseVo purchaseVo) {
        rawMaterialsService.addPurchaseRecord(purchaseVo);
        return ReturnVO.getSuccess();
    }

    /**
     * 获取采购记录分页
     *
     * @param page
     * @param pageSize
     * @return
     */
    @GetMapping("/getPurchaseRecordPage")
    public ReturnVO getPurchaseRecordPage(@RequestParam(defaultValue = Constants.PAGE_DEFAULT_START) Integer page,
                                          @RequestParam(defaultValue = Constants.PAGE_DEFAULT_SIZE) Integer pageSize) {
        return ReturnVO.getSuccess(rawMaterialsService.getPurchaseRecordPage(page, pageSize));

    }
    /**
     * 原材料仓库管理员审核, 增加库存
     */
    @PostMapping("/addInventory")
    public ReturnVO addInventory(@RequestJson Long rawMaterialsId,@RequestJson Integer count){
        rawMaterialsService.addInventory(rawMaterialsId, count);
        return ReturnVO.getSuccess();
    }

    /**
     * 根据采购记录添加原材料
     */
    @PostMapping("/addRawMaterial")
    public ReturnVO addRawMaterial(@RequestJson Long purchaseRecordId){
        rawMaterialsService.addRawMaterial(purchaseRecordId);
        return ReturnVO.getSuccess();
    }

    /**
     * 根据采购单添加原材料
     */
    @PostMapping("/addRawMaterials")
    public ReturnVO addRawMaterials(@RequestJson Long purchaseId){
        rawMaterialsService.addRawMaterials(purchaseId);
        return ReturnVO.getSuccess();
    }
}
