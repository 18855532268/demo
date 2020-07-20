package com.example.manage.vo.payOrder;

import com.example.manage.domain.Payorderrecord;
import com.example.manage.vo.product.ProductVo;
import lombok.*;
import lombok.experimental.Accessors;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PayOrderRecordVo {
//    private String id;

    private Long payorderid;

    private Long productid;

//    private ProductVo productVo;
    private String productNum;
    private String imageUrl;
    private String productName;
    /**
     * 产品规格
     */
    private String productSpecification;
    private String productColor;
    /**
     * 成分
     */
    private String productIngredient;
    private String productUnit;
    private String productDefaultStore;
    private String productDefaultSupplier;
    private float productSell;
    private float productPurchasing;
    private float productCostPrice;
    private String remark;
    private String type;
    /**
     * 客户款号
     */
    private String modelNo;

    private float unitprice;

    private float taxpoint;

    private Integer count;
    /**
     * 折扣
     */
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

    public static PayOrderRecordVo of(Payorderrecord payorderrecord, ProductVo productVo){
        return PayOrderRecordVo.builder()
                .productNum(productVo.getProductNum())
                .imageUrl(productVo.getImageUrl())
                .productName(productVo.getProductName())
                .productSpecification(productVo.getProductSpecification())
                .productColor(productVo.getProductColor())
                .productIngredient(productVo.getProductIngredient())
                .productUnit(productVo.getProductUnit())
                .productDefaultStore(productVo.getProductDefaultStore())
                .productDefaultSupplier(productVo.getProductDefaultSupplier())
                .productSell(productVo.getProductSell())
                .productPurchasing(productVo.getProductPurchasing())
                .productCostPrice(productVo.getProductCostPrice())
                .remark(productVo.getRemark())
                .type(productVo.getType())
                .modelNo(payorderrecord.getModelno())
                .unitprice(Float.parseFloat(payorderrecord.getUnitprice()))
                .taxpoint(Float.parseFloat(payorderrecord.getTaxpoint()))
                .count(payorderrecord.getCount())
                .discount(Float.parseFloat(payorderrecord.getDiscount()))
                .weightTolerance(payorderrecord.getWeighttolerance())
                .changeColor(payorderrecord.getChangecolor())
                .larghezza(payorderrecord.getLarghezza())
                .weight(payorderrecord.getWeight())
                .build();
    }
}
