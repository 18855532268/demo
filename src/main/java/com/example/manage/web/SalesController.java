package com.example.manage.web;

import com.example.manage.config.myinterface.RequestJson;
import com.example.manage.constant.Constants;
import com.example.manage.service.PayOrderService;
import com.example.manage.util.Page;
import com.example.manage.vo.ReturnVO;
import com.example.manage.vo.payOrder.PayOrderPageVo;
import com.example.manage.vo.payOrder.PayOrderVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/sales")
public class SalesController {
    @Autowired
    private PayOrderService payOrderService;

    /**
     * 添加产品订单
     *
     * @param payOrderVo
     * @return
     */
    @PostMapping("/addOrder")
    public ReturnVO addOrder(@RequestBody PayOrderVo payOrderVo) {
        payOrderService.addOrder(payOrderVo);
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
                return ReturnVO.getSuccess(payOrderService.findOrderFuzzyQuery(key));
            } else {
                Page<PayOrderPageVo> pageVo = payOrderService.getPayOrderPage(page, pageSize);
                log.info("id为空");
                return ReturnVO.getSuccess(pageVo);
            }

        } else {
            PayOrderPageVo order = payOrderService.getPayOrder(id);
            log.info("id不为空");
            return ReturnVO.getSuccess(order);
        }
    }

    @GetMapping("/getOrderFuzzyQuery")
    public ReturnVO findOrderFuzzyQuery(String key) {
        return ReturnVO.getSuccess(payOrderService.findOrderFuzzyQuery(key));
    }

    @PostMapping("/addDetection")
    public ReturnVO addDetection(@RequestJson String id, @RequestJson String detection){
        payOrderService.addDetection(id, detection);
        return ReturnVO.getSuccess();
    }
}
