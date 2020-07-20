package com.example.manage.vo.payMent;

import lombok.*;

import java.util.Date;
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Data
@Builder
public class PaymentRecordVo {

//    private Long id;

    private Long purchaseid;

    private String payeename;
    private String payeetype;
    private String payeecard;
    private String payeeremark;
    private String paydate;
    private String payaccount;

    private String items;

    private String imgurl;

    private float paymoney;
    private String remark;
}
