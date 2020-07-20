package com.example.manage.vo.product;

import com.example.manage.domain.Product;
import com.example.manage.domain.Productstore;
import com.example.manage.domain.Producttype;
import com.example.manage.util.CommonUtil;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * productstore
 *
 * @author
 */
@Data
@Builder
public class ProductStorePageVo implements Serializable {

    //    private Long productid;
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
    private String type;

    private String vatnum;
    private String storedate;
    private String weight;
    private Integer count;
    private String larghezza;
    private String payordertype;
    private String reelnum;
    private Long producttypeid;
    public static ProductStorePageVo of(Product product, Producttype type, Productstore productstore) {
        return ProductStorePageVo.builder()
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
                .vatnum(productstore.getVatnum())
                .storedate(CommonUtil.dateToStr(productstore.getStoredate()))
                .weight(productstore.getWeight())
                .count(productstore.getCount())
                .larghezza(productstore.getLarghezza())
                .payordertype(productstore.getPayordertype())
                .reelnum(productstore.getReelnum())
                .producttypeid(productstore.getProducttypeid())
                .build();
    }
}