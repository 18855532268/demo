package com.example.manage.domain;

import java.io.Serializable;
import java.math.BigDecimal;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * product
 * @author 
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Product implements Serializable {
    @TableId(value = "id",type = IdType.AUTO)
    @TableField("id")
    private Long id;

    private String productnum;

    private String productname;

    private String productspecification;

    private String productcolor;

    private String productmaterials;

    private String productingredient;

    private String productunit;

    private String productdefaultstore;

    private String productdefaultsupplier;

    private BigDecimal productsell;

    private BigDecimal productpurchasing;

    private BigDecimal productcostprice;

    private String productremark;

    private String producttaxrate;

    private Long typeid;

    private Integer status;

    private String url;

    private static final long serialVersionUID = 1L;
}