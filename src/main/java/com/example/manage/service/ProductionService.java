package com.example.manage.service;

import com.alibaba.fastjson.JSONObject;
import com.example.manage.constant.ConstantsForDomain;
import com.example.manage.domain.*;
import com.example.manage.exception.ErrorRollbackException;
import com.example.manage.mapper.*;
import com.example.manage.util.CommonUtil;
import com.example.manage.util.Page;
import com.example.manage.util.PageRequest;
import com.example.manage.vo.customer.CustomerVo;
import com.example.manage.vo.production.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Slf4j
@Service
public class ProductionService {
    @Autowired
    private ProductionMapper productionMapper;
    @Autowired
    private ProductionprocessMapper productionprocessMapper;
    @Autowired
    private PayorderMapper payorderMapper;
    @Autowired
    private PayorderrecordMapper payorderrecordMapper;
    @Autowired
    private ProductstoreMapper productstoreMapper;
    @Autowired
    private DocumentaryMapper documentaryMapper;
    @Autowired
    private ManageuserMapper manageuserMapper;
    @Autowired
    private CureMapper cureMapper;
    @Autowired
    private CustomerMapper customerMapper;
    @Autowired
    private CustomertypeMapper customertypeMapper;

    public void addProduction(ProductionVo productionVo) {
        Production production = new Production();
        production.setPayorderid(productionVo.getPayOrderId());
        production.setCustomerid(productionVo.getCustomerId());
        production.setProductid(productionVo.getProductId());
        production.setCargotypeid(productionVo.getCargoTypeId());
        production.setProductiontypeid(productionVo.getProductionTypeId());
        production.setFlowid(productionVo.getFlowId());
        production.setFactoryid(productionVo.getFactoryId());
        production.setProductionmanageid(productionVo.getProductionmanageId());
        production.setCount(productionVo.getProCount());
        production.setPronum(productionVo.getProNum());
        production.setProdeliverydate(CommonUtil.stringToDate(productionVo.getProDeliveryDate()));
        production.setStatecov(productionVo.getStateCov());
        production.setWeight(productionVo.getWeight());
        production.setLarghezza(productionVo.getLarghezza());
        production.setWeighttolerance(productionVo.getWeightTolerance());
        production.setLossrate(productionVo.getLossRate());
        production.setColor(productionVo.getColor());
        production.setIsbatchcharge(productionVo.getIsBatchCharge());
        production.setAnnouncements(productionVo.getAnnouncements());
        production.setRemark(productionVo.getRemark());
        production.setGraynum(productionVo.getGrayNum());
        production.setStatus(ConstantsForDomain.PRODUCTION_STATUS_RANK);

        productionMapper.insert(production);
        for (String st : productionVo.getProductionProcesss()) {
            Productionprocess productionprocess = new Productionprocess();
            productionprocess.setProductionid(production.getId());
            productionprocess.setProcess(st);
            productionprocessMapper.insert(productionprocess);
        }
    }

    public Page<ProductionPageVo> getProductionPage(Integer page, Integer pageSize, Integer status) {
        PageRequest pageRequest = new PageRequest(page, pageSize);
        List<ProductionPageVo> vos = new ArrayList<>();
        Long count = productionMapper.findCountByStatus(status);
        if (count > 0) {
            List<Production> list = productionMapper.findPageByStatus(status, pageRequest);
            for (Production production : list) {
                Payorder payorder = payorderMapper.selectByPrimaryKey(production.getPayorderid());
                log.info("订单返回：{}", JSONObject.toJSONString(payorder));
                if (payorder != null) {
                    List<Payorderrecord> payorderrecords = payorderrecordMapper.findListByPayOrderId(payorder.getId());
                    for (Payorderrecord payorderrecord : payorderrecords) {
                        vos.add(ProductionPageVo.of(production, payorder, payorderrecord));
                    }
                }
            }
        }

        return new Page<>(pageRequest, vos, count);
    }

    public void addDocumentary(DocumentaryVo documentaryVo) {
        Documentary documentary = new Documentary();
        documentary.setCureid(documentaryVo.getCureid());
        documentary.setMerchanerid(documentaryVo.getMerchanerid());
        documentary.setProductionid(documentaryVo.getProductionid());
        documentary.setMerdate(CommonUtil.stringToDate(documentaryVo.getMerdate()));
        documentary.setRemark(documentaryVo.getRemark());
        documentary.setImgurl(documentaryVo.getImgurl());
        documentaryMapper.insert(documentary);
    }

    public DocumentaryInfo getDocumentaryPage(Integer page, Integer pageSize, Long productionId) {
        PageRequest pageRequest = new PageRequest(page, pageSize);
        ArrayList<DocumentaryPageVo> vos = new ArrayList<>();
        DocumentaryInfo info;
        ProductionPageVo productionPageVo = null;
        CustomerVo customerVo = null;
        Production production = productionMapper.selectByPrimaryKey(productionId);
        Long count = documentaryMapper.findCount(productionId);
        log.info(String.valueOf(count));
        if (count > 0) {
            // 订单信息
            Payorder payorder = payorderMapper.selectByPrimaryKey(production.getPayorderid());
            log.info("订单返回：{}", JSONObject.toJSONString(payorder));
            if (payorder != null) {
                List<Payorderrecord> payorderrecords = payorderrecordMapper.findListByPayOrderId(payorder.getId());
                for (Payorderrecord payorderrecord : payorderrecords) {
                    productionPageVo = ProductionPageVo.of(payorder, payorderrecord);
                }
            }
            Customer customer = customerMapper.selectByPrimaryKey(payorder.getCustomerid());
            Customertype customertype = customertypeMapper.selectByPrimaryKey(customer.getCustomerTypeId());
            customerVo = CustomerVo.of(customer, customertype.getType());

            List<Documentary> documentaries = documentaryMapper.selectByPayOrderId(pageRequest, productionId);
            log.info("返回：{}", documentaries);
            for (Documentary documentary : documentaries) {
                Manageuser manageuser = manageuserMapper.selectByPrimaryKey(documentary.getMerchanerid());
                Cure cure = cureMapper.selectByPrimaryKey(documentary.getCureid());
                vos.add(DocumentaryPageVo.of(documentary, manageuser, cure));
            }
        }
        Page pageVos = new Page(pageRequest, vos, count);
        return DocumentaryInfo.of(productionPageVo, customerVo, pageVos);
    }

    public void modifiStatus(Integer status, Long id) {
        log.info("修改状态：{}", status);
        log.info("修改id：{}", id);
        Production production = productionMapper.selectByPrimaryKey(id);
        if (production == null) {
            throw new ErrorRollbackException("无法找到该生产单");
        }
        production.setStatus(status);
        productionMapper.updateByPrimaryKey(production);
    }

    // 跟单没有处理
    public void enterStore(Long id, Long manageUserId, Long productStoreId) {
        Production production = productionMapper.selectByPrimaryKey(id);
        if (production == null || production.getStatus() != ConstantsForDomain.PRODUCTION_STATUS_FINISHED) {
            throw new ErrorRollbackException("无法找到该生产单或该生产单不是已完成");
        }
        production.setStatus(ConstantsForDomain.PRODUCTION_STATUS_AUDIT);
        production.setEnterstoremanageid(manageUserId);
        productionMapper.updateByPrimaryKey(production);

        Productstore productstore = productstoreMapper.selectByPrimaryKey(productStoreId);
        if(productstore == null){
            throw new ErrorRollbackException("无法找到该仓库产品");
        }

        productstore.setCount( productstore.getCount()+ production.getCount());
        productstore.setStoredate(new Date());
        productstoreMapper.updateByPrimaryKey(productstore);

    }
}
