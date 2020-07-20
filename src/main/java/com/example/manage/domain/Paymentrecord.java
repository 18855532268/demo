package com.example.manage.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * paymentrecord
 * @author 
 */
@Data
public class Paymentrecord implements Serializable {
    private Long id;

    private Long purchaseid;

    private String paymoney;

    private String payrental;

    private String debt;

    private String payeename;

    private String payeetype;

    private String payeecard;

    private String payeeremark;

    private Date paydate;

    private String payaccount;

    private String items;

    private String imgurl;

    private String remark;

    private static final long serialVersionUID = 1L;
}