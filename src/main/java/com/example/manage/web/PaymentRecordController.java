package com.example.manage.web;

import com.example.manage.constant.Constants;
import com.example.manage.service.PaymentRecordService;
import com.example.manage.vo.ReturnVO;
import com.example.manage.vo.manage.ManageUserVo;
import com.example.manage.vo.payMent.PaymentRecordVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/paymentRecord")
public class PaymentRecordController {
    @Autowired
    private PaymentRecordService paymentRecordService;

    /**
     * 添加付款记录
     *
     * @param paymentRecordVo
     * @return
     */
    @PostMapping("/addPaymentRecord")
    public ReturnVO addPaymentRecord(@RequestBody PaymentRecordVo paymentRecordVo) {
        paymentRecordService.addPaymentRecord(paymentRecordVo);
        return ReturnVO.getSuccess();
    }

    @GetMapping("/getPaymentRecordPage")
    public ReturnVO getPaymentRecordPage(@RequestParam(defaultValue = Constants.PAGE_DEFAULT_START) Integer page,
                                         @RequestParam(defaultValue = Constants.PAGE_DEFAULT_SIZE) Integer pageSize) {
        return ReturnVO.getSuccess(paymentRecordService.getPaymentRecordPage(page, pageSize));
    }

}
