package com.example.manage.vo.payMent;

import com.example.manage.domain.Paymentrecord;
import com.example.manage.util.CommonUtil;
import lombok.*;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Data
@Builder
public class PaymentRecordPageVo {

    private Long purchaseid;
    // 采购总金额
    private float rental;
    private float paymoney;

    private float payrental;
    private float debt;
    private String payeename;
    private String payeetype;
    private String payeecard;
    private String payeeremark;
    private String paydate;
    private String payaccount;
    private String items;
    private String imgurl;
    private String remark;

    public static PaymentRecordPageVo of(Paymentrecord paymentrecord, Float rental){
        return PaymentRecordPageVo.builder()
                .purchaseid(paymentrecord.getPurchaseid())
                .rental(rental)
                .paymoney(Float.valueOf(paymentrecord.getPaymoney()))
                .payrental(Float.valueOf(paymentrecord.getPayrental()))
                .debt(Float.valueOf(paymentrecord.getDebt()))
                .payeename(paymentrecord.getPayeename())
                .payeetype(paymentrecord.getPayeetype())
                .payeeremark(paymentrecord.getPayeeremark())
                .paydate(CommonUtil.dateToStr(paymentrecord.getPaydate()))
                .payaccount(paymentrecord.getPayaccount())
                .items(paymentrecord.getItems())
                .imgurl(paymentrecord.getImgurl())
                .remark(paymentrecord.getRemark())
                .build();
    }
}
