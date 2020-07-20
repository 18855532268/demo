package com.example.manage.vo.backFlow;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.util.Date;
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@Builder
public class BackFlowVo {

    private Long payorderid;

    private String money;

    private String date;

    private String type;

    private String remark;
    private Integer isinvoice;

    private String invoiceimgurl;

    private String invoicetype;

    private String invoicetitle;

    private String invoicemoney;
}
