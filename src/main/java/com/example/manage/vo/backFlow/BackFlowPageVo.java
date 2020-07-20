package com.example.manage.vo.backFlow;

import com.example.manage.domain.Backflow;
import com.example.manage.domain.other.OrderFuzzyQuery;
import com.example.manage.util.CommonUtil;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.util.Date;

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@Builder
public class BackFlowPageVo {

    private Long payorderid;
    private String orderNum;
    private String customerName;
    private String customerTellphone;
    private String saleName;

    private String money;
    private String date;
    private String type;
    private String remark;
    private Integer isinvoice;

    private String invoiceimgurl;
    private String invoicetype;
    private String invoicetitle;
    private String invoicemoney;

    public static BackFlowPageVo of(Backflow backflow, OrderFuzzyQuery orderFuzzyQuery) {
        return BackFlowPageVo.builder()
                .payorderid(orderFuzzyQuery.getId())
                .orderNum(orderFuzzyQuery.getOrderNum())
                .customerName(orderFuzzyQuery.getCustomerName())
                .customerTellphone(orderFuzzyQuery.getCustomerTellphone())
                .saleName(orderFuzzyQuery.getSaleName())
                .money(backflow.getMoney())
                .date(CommonUtil.dateToStr(backflow.getDate()))
                .type(backflow.getType())
                .remark(backflow.getRemark())
                .isinvoice(backflow.getIsinvoice())
                .invoiceimgurl(backflow.getInvoiceimgurl())
                .invoicetype(backflow.getInvoicetype())
                .invoicetitle(backflow.getInvoicetitle())
                .invoicemoney(backflow.getInvoicemoney())

                .build();
    }
}
