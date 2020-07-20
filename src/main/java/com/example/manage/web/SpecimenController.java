package com.example.manage.web;

import com.example.manage.constant.Constants;
import com.example.manage.service.SpecimenService;
import com.example.manage.util.Page;
import com.example.manage.vo.ReturnVO;
import com.example.manage.vo.payOrder.PayOrderPageVo;
import com.example.manage.vo.payOrder.PayOrderVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 样品仓库
 */
@RestController
@Slf4j
@RequestMapping("/specimen")
public class SpecimenController {
    @Autowired
    private SpecimenService specimenService;

    /**
     * 添加产品订单
     *
     * @param payOrderVo
     * @return
     */
    @PostMapping("/addOrder")
    public ReturnVO addOrder(@RequestBody PayOrderVo payOrderVo) {
        specimenService.addOrder(payOrderVo);
        return ReturnVO.getSuccess();
    }

    /**
     * 获取订单分页
     *
     * @param page
     * @param pageSize
     * @return
     */
    @GetMapping("/getPayOrderPage")
    public ReturnVO getPayOrderPage(Long id, String key, @RequestParam(defaultValue = Constants.PAGE_DEFAULT_START) Integer page,
                                    @RequestParam(defaultValue = Constants.PAGE_DEFAULT_SIZE) Integer pageSize) {
        if (id == null) {
            if (key != null) {
                return ReturnVO.getSuccess(specimenService.findOrderFuzzyQuery(key));
            } else {
                Page<PayOrderPageVo> pageVo = specimenService.getPayOrderPage(page, pageSize);
                log.info("id为空");
                return ReturnVO.getSuccess(pageVo);
            }

        } else {
            PayOrderPageVo order = specimenService.getPayOrder(id);
            log.info("id不为空");
            return ReturnVO.getSuccess(order);
        }
    }

}
