package com.example.manage.vo.product;

import com.example.manage.domain.Product;
import com.example.manage.domain.Producttype;
import com.example.manage.util.CommonUtil;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductVo {
    private Long id;

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
    private String typeId;
    private String type;


    public static ProductVo of(Product product, Producttype type) {
        return ProductVo.builder()
                .id(product.getId())
                .productNum(product.getProductnum())
                .imageUrl(product.getUrl())
                .productName(product.getProductname())
                .productSpecification(product.getProductspecification())
                .productColor(product.getProductcolor())
                .productIngredient(product.getProductingredient())
                .productUnit(product.getProductunit())
                .productDefaultStore(product.getProductdefaultstore())
                .productDefaultSupplier(product.getProductdefaultsupplier())
                .productSell(product.getProductsell().intValue())
                .productPurchasing(product.getProductpurchasing().intValue())
                .productCostPrice(product.getProductcostprice().intValue())
                .remark(product.getProductremark())
                .type(type.getProducttype())
                .build();

    }
}
