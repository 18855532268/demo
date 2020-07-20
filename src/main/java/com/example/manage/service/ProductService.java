package com.example.manage.service;

import com.alibaba.fastjson.JSONObject;
import com.example.manage.constant.ConstantsForDomain;
import com.example.manage.domain.Manageuser;
import com.example.manage.domain.Product;
import com.example.manage.domain.Productstore;
import com.example.manage.domain.Producttype;
import com.example.manage.mapper.*;
import com.example.manage.util.CommonUtil;
import com.example.manage.util.Page;
import com.example.manage.util.PageRequest;
import com.example.manage.vo.manage.ManageUserVo;
import com.example.manage.vo.product.ProductStorePageVo;
import com.example.manage.vo.product.ProductStoreVo;
import com.example.manage.vo.product.ProductVo;
import com.example.manage.vo.production.ProductionPageVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Slf4j
@Service
public class ProductService {
    @Autowired
    private ProductMapper productMapper;
    @Autowired
    private ProducttypeMapper producttypeMapper;
    @Autowired
    private ProductstoreMapper productstoreMapper;
    @Autowired
    private ProductionMapper productionMapper;
    @Autowired
    private PayorderrecordMapper payorderrecordMapper;
    @Autowired
    private PayorderMapper payorderMapper;

    /**
     * 添加产品
     *
     * @param productVo
     */
    public void addProduct(ProductVo productVo) {
        Product product = new Product();
//        product.setId(CommonUtil.getUUID());
        product.setProductnum(productVo.getProductNum());
        product.setUrl(productVo.getImageUrl());
        product.setProductname(productVo.getProductName());
        product.setProductspecification(productVo.getProductSpecification());
        product.setProductcolor(productVo.getProductColor());
        product.setProductingredient(productVo.getProductIngredient());
        product.setProductunit(productVo.getProductUnit());
        product.setProductdefaultstore(productVo.getProductDefaultStore());
        product.setProductdefaultsupplier(productVo.getProductDefaultSupplier());
        product.setProductsell(new BigDecimal(productVo.getProductSell()));
        product.setProductpurchasing(new BigDecimal(productVo.getProductPurchasing()));
        product.setProductcostprice(new BigDecimal(productVo.getProductCostPrice()));
        product.setTypeid(Long.valueOf(productVo.getTypeId()));
        product.setStatus(ConstantsForDomain.PRODUCT_STATUS_NORMAL);
        productMapper.insert(product);
    }

    public Page<ProductVo> getProductPage(Integer page, Integer pageSize) {
        PageRequest pageRequest = new PageRequest(page, pageSize);
        List<ProductVo> vos = new ArrayList<>();
        Long count = productMapper.findCountByStatus();
        if (count > 0) {
            List<Product> list = productMapper.findPage(pageRequest);
            for (Product product : list) {
                Producttype type = producttypeMapper.selectByPrimaryKey(product.getTypeid());
                vos.add(ProductVo.of(product, type));
            }
        }
        return new Page<>(pageRequest, vos, count);
    }

    /**
     * 添加产品类型
     *
     * @param type
     */
    public void addProductType(String type) {
        Producttype producttype = new Producttype();
//        producttype.setId(CommonUtil.getUUID());
        producttype.setProducttype(type);
        producttypeMapper.insert(producttype);
    }

    public Page<Producttype> getProductType(Integer page, Integer pageSize) {
        PageRequest pageRequest = new PageRequest(page, pageSize);
        List<Producttype> vos = new ArrayList<>();
        Long count = producttypeMapper.countByExample(null);
        if (count > 0) {
            List<Producttype> list = producttypeMapper.findPage(pageRequest);
            for (Producttype producttype : list) {
                vos.add(producttype);
            }
        }
        return new Page<>(pageRequest, vos, count);
    }

    public void addProduct(ProductStoreVo productstoreVo) {
            Productstore productstore = new Productstore();
            productstore.setProductid(productstoreVo.getProductid());
            productstore.setVatnum(productstoreVo.getVatnum());
            productstore.setStoredate(new Date());
            productstore.setWeight(productstoreVo.getWeight());
            productstore.setCount(productstoreVo.getCount());
            productstore.setLarghezza(productstoreVo.getLarghezza());
            productstore.setPayordertype(productstoreVo.getPayordertype());
            productstore.setReelnum(productstoreVo.getReelnum());
            productstore.setProducttypeid(productstoreVo.getProducttypeid());
            log.info("仓库产品添加：{}", JSONObject.toJSONString(productstore));

            productstoreMapper.insert(productstore);

    }

    public Page<ProductStorePageVo> getProductStorePage(Integer page, Integer pageSize) {
        PageRequest pageRequest = new PageRequest(page, pageSize);
        List<ProductStorePageVo> vos = new ArrayList<>();
        Long count = productstoreMapper.countByExample(null);
        if (count > 0) {
            List<Productstore> list = productstoreMapper.findPage(pageRequest);
            for (Productstore productstore : list) {
                Product product = productMapper.selectByPrimaryKey(productstore.getProductid());
                Producttype producttype = producttypeMapper.selectByPrimaryKey(product.getTypeid());
                vos.add(ProductStorePageVo.of(product, producttype, productstore));
            }
        }
        return new Page<>(pageRequest, vos, count);
    }

}
