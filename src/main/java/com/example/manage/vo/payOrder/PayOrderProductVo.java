package com.example.manage.vo.payOrder;

import com.example.manage.constant.Constants;
import com.example.manage.domain.Payorderrecord;
import com.example.manage.domain.Product;
import com.example.manage.vo.product.ProductVo;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PayOrderProductVo {
    private Long payorderid;

    private ProductVo productVo;

    private float unitprice;

    private Double taxpoint;

    private Integer count;

    private float discount;

    public static PayOrderProductVo of(Payorderrecord record, ProductVo productVo){
        return PayOrderProductVo.builder()
                .payorderid(Long.valueOf(record.getPayorderid()))
                .productVo(productVo)
                .unitprice(Float.valueOf(record.getUnitprice()))
                .taxpoint(Double.valueOf(record.getTaxpoint()))
                .count(record.getCount())
                .discount(Float.valueOf(record.getDiscount()))
                .build();
    }
}
