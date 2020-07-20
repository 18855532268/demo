package com.example.manage.service;

import com.alibaba.fastjson.JSONObject;
import com.example.manage.domain.Paymentrecord;
import com.example.manage.domain.Purchase;
import com.example.manage.exception.ErrorRollbackException;
import com.example.manage.mapper.PaymentrecordMapper;
import com.example.manage.mapper.PurchaseMapper;
import com.example.manage.util.CommonUtil;
import com.example.manage.util.Page;
import com.example.manage.util.PageRequest;
import com.example.manage.vo.payMent.PaymentRecordPageVo;
import com.example.manage.vo.payMent.PaymentRecordVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class PaymentRecordService {

    @Autowired
    private PaymentrecordMapper paymentrecordMapper;
    @Autowired
    private PurchaseMapper purchaseMapper;

    public void addPaymentRecord(PaymentRecordVo paymentRecordVo) {
        Paymentrecord paymentrecord = new Paymentrecord();
        paymentrecord.setPurchaseid(paymentRecordVo.getPurchaseid());
        Purchase purchase = purchaseMapper.selectByPrimaryKey(paymentRecordVo.getPurchaseid());
        if (purchase == null) {
            throw new ErrorRollbackException("该笔采购记录不存在");
        }
        // 已付款金额
        float payRental = getPayRental(paymentRecordVo.getPurchaseid()) + paymentRecordVo.getPaymoney();
        // 总付款金额
        paymentrecord.setPayrental(String.valueOf(payRental));
        // 欠款金额
        paymentrecord.setDebt(String.valueOf(Float.valueOf(purchase.getRental()) - payRental));
        paymentrecord.setPayeename(paymentRecordVo.getPayeename());
        paymentrecord.setPayeetype(paymentRecordVo.getPayeetype());
        paymentrecord.setPayeecard(paymentRecordVo.getPayeecard());
        paymentrecord.setPayeeremark(paymentRecordVo.getPayeeremark());
        paymentrecord.setPaydate(CommonUtil.stringToDate(paymentRecordVo.getPaydate()));
        paymentrecord.setPayaccount(paymentRecordVo.getPayaccount());
        paymentrecord.setItems(paymentRecordVo.getItems());
        paymentrecord.setImgurl(paymentRecordVo.getImgurl());
        paymentrecord.setPaymoney(String.valueOf(paymentRecordVo.getPaymoney()));
        paymentrecord.setRemark(paymentRecordVo.getRemark());
        log.info("添加付款记录：{}", JSONObject.toJSONString(paymentrecord));

        paymentrecordMapper.insert(paymentrecord);

        // 更新总付款金额
        purchase.setPayrental(String.valueOf(payRental));
        purchaseMapper.updateByPrimaryKey(purchase);
    }

    public Page<PaymentRecordPageVo> getPaymentRecordPage(Integer page, Integer pageSize) {
        PageRequest pageRequest = new PageRequest(page, pageSize);
        List<PaymentRecordPageVo> vos = new ArrayList<>();
        long count = paymentrecordMapper.countByExample(null);
        if (count > 0) {
            List<Paymentrecord> list = paymentrecordMapper.findPaymentRecordPage(pageRequest);
            for (Paymentrecord paymentrecord : list) {
                Purchase purchase = purchaseMapper.selectByPrimaryKey(paymentrecord.getPurchaseid());
                if (purchase == null || purchase.getRental() == null) {
                    throw new ErrorRollbackException("参数错误");
                }
                vos.add(PaymentRecordPageVo.of(paymentrecord,Float.parseFloat(purchase.getRental())));
            }
        }
        return new Page<>(pageRequest, vos, count);
    }


    /**
     * 获得该笔采购的总付款金额
     *
     * @param purchaseId
     * @return
     */
    private long getPayRental(Long purchaseId) {
        long payRentals = 0;
        List<Long> payRental = paymentrecordMapper.findPayRentalByPurchaseId(purchaseId);
        for (Long pay : payRental) {
            payRentals += pay;
        }
        return payRentals;
    }


}
