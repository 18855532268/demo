package com.example.manage.web;

import com.example.manage.config.myinterface.RequestJson;
import com.example.manage.constant.Constants;
import com.example.manage.service.ProductionService;
import com.example.manage.vo.ReturnVO;
import com.example.manage.vo.production.DocumentaryVo;
import com.example.manage.vo.production.ProductionVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 生产单
 */
@RestController
@Slf4j
@RequestMapping("/production")
public class ProductionController {
    @Autowired
    private ProductionService productionService;

    @GetMapping("/getProduction")
    public ReturnVO getType(@RequestParam(defaultValue = Constants.PAGE_DEFAULT_START) Integer page,
                            @RequestParam(defaultValue = Constants.PAGE_DEFAULT_SIZE) Integer pageSize,
                            Integer status) {
        return ReturnVO.getSuccess(productionService.getProductionPage(page, pageSize, status));
    }

    @PostMapping("/addProduction")
    public ReturnVO addCustomerType(@RequestBody ProductionVo productionVo) {
        productionService.addProduction(productionVo);
        return ReturnVO.getSuccess();
    }

    /**
     * 添加跟单
     *
     * @param documentaryVo
     * @return
     */
    @PostMapping("/addDocumentary")
    public ReturnVO addDocumentary(@RequestBody DocumentaryVo documentaryVo) {
        productionService.addDocumentary(documentaryVo);
        return ReturnVO.getSuccess();
    }

    /**
     * 查看跟单
     *
     * @param page
     * @param pageSize
     * @param payOrderRecordId
     * @return
     */
    @GetMapping("/getDocumentary")
    public ReturnVO getDocumentaryPage(@RequestParam(defaultValue = Constants.PAGE_DEFAULT_START) Integer page,
                                       @RequestParam(defaultValue = Constants.PAGE_DEFAULT_SIZE) Integer pageSize,
                                       Long payOrderRecordId) {
        return ReturnVO.getSuccess(productionService.getDocumentaryPage(page, pageSize, payOrderRecordId));
    }

    /**
     * 更改生产单状态 生产专员审核用
     */
    @PostMapping("/modifiStatus")
    public ReturnVO modifiStatus(@RequestJson("status")Integer status,@RequestJson("id")Long id) {
        productionService.modifiStatus(status, id);
        return ReturnVO.getSuccess();
    }

    /**
     * 入库审核  入库人员审核用
     * @param id
     * @param manageUserId
     * @param productStoreId
     * @return
     */
    @PostMapping("/enterStore")
    public ReturnVO enterStore(@RequestJson("id")Long id, @RequestJson("manageUserId")Long  manageUserId, @RequestJson("productStoreId") Long productStoreId){
        productionService.enterStore(id, manageUserId, productStoreId);
        return ReturnVO.getSuccess();
    }
}
