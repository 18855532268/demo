package com.example.manage.vo.production;

import com.example.manage.domain.Payorder;
import com.example.manage.domain.Payorderrecord;
import com.example.manage.domain.Production;
import com.example.manage.util.CommonUtil;
import lombok.*;

import java.util.List;
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Data
@Builder
public class ProductionPageVo {
    private Long id;
    private Long orderId;
    // 订单单号
    private String orderNum;
    // 订单日期
    private String orderDate;
    // 客户款号
    private String modelNo;
    // 布品图片
    private String imgUrl;
    private float unitPrice;
    private float taxPoint;
    private Integer count;
     // 折扣
    private float discount;
    /**
     * 溢短装
     */
    private String weightTolerance;
    private String changeColor;
    /**
     * 门幅
     */
    private String larghezza;
    /**
     * 克重
     */
    private String weight;
    private float taxSubtotal;
    private float totalMoney;

    public static ProductionPageVo of(Production production, Payorder payorder, Payorderrecord payorderrecord){
        return ProductionPageVo.builder()
                .id(production.getId())
                .orderId(payorder.getId())
                .orderNum(payorder.getOrdernum())
                .orderDate(CommonUtil.dateToStr(payorder.getOrderdate()))
                .modelNo(payorderrecord.getModelno())
//                .imgUrl(payo)
                .unitPrice(Float.parseFloat(payorderrecord.getUnitprice()))
                .taxPoint(Float.parseFloat(payorderrecord.getTaxpoint()))
                .count(payorderrecord.getCount())
                .discount(Float.parseFloat(payorderrecord.getDiscount()))
                .weightTolerance(payorderrecord.getWeighttolerance())
                .changeColor(payorderrecord.getChangecolor())
                .larghezza(payorderrecord.getLarghezza())
                .weight(payorderrecord.getWeight())
                .taxSubtotal(Float.parseFloat(payorderrecord.getTaxsubtotal()))
                .taxSubtotal(Float.parseFloat(payorderrecord.getTaxsubtotal()))
                .build();
    }
    public static ProductionPageVo of( Payorder payorder, Payorderrecord payorderrecord){
        return ProductionPageVo.builder()
                .orderId(payorder.getId())
                .orderNum(payorder.getOrdernum())
                .orderDate(CommonUtil.dateToStr(payorder.getOrderdate()))
                .modelNo(payorderrecord.getModelno())
//                .imgUrl(payo)
                .unitPrice(Float.parseFloat(payorderrecord.getUnitprice()))
                .taxPoint(Float.parseFloat(payorderrecord.getTaxpoint()))
                .count(payorderrecord.getCount())
                .discount(Float.parseFloat(payorderrecord.getDiscount()))
                .weightTolerance(payorderrecord.getWeighttolerance())
                .changeColor(payorderrecord.getChangecolor())
                .larghezza(payorderrecord.getLarghezza())
                .weight(payorderrecord.getWeight())
                .taxSubtotal(Float.parseFloat(payorderrecord.getTaxsubtotal()))
                .taxSubtotal(Float.parseFloat(payorderrecord.getTaxsubtotal()))
                .build();
    }
}
