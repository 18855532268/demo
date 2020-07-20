package com.example.manage.vo.payOrder;

import com.example.manage.vo.product.ProductVo;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PayOrderVo {
    private String orderNum;
    private String orderDate;
    private String manageUserId;
    private String customerId;
    private String payType;
    private String payDate;
    /**
     * 预计发货日
     */
    private String deliveryDate;
//    private float tax;
    /**
     * 定金单号
     */
    private String depositNum;
    /**
     * 定金比率
     */
    private float depositRate;
    private String logistics;
    private String logisticsNum;
    private String logisticsRemark;
    private Integer type;
    private String remark;
    private List<PayOrderRecordVo> payOrderRecordVos;

}
