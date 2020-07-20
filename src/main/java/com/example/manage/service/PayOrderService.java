package com.example.manage.service;

import com.alibaba.fastjson.JSONObject;
import com.example.manage.constant.Constants;
import com.example.manage.constant.ConstantsForDomain;
import com.example.manage.domain.*;
import com.example.manage.domain.other.OrderFuzzyQuery;
import com.example.manage.exception.ErrorRollbackException;
import com.example.manage.mapper.*;
import com.example.manage.util.CommonUtil;
import com.example.manage.util.Page;
import com.example.manage.util.PageRequest;
import com.example.manage.vo.customer.CustomerVo;
import com.example.manage.vo.manage.ManageUserVo;
import com.example.manage.vo.payOrder.OrderFuzzyQueryVo;
import com.example.manage.vo.payOrder.PayOrderPageVo;
import com.example.manage.vo.payOrder.PayOrderRecordVo;
import com.example.manage.vo.payOrder.PayOrderVo;
import com.example.manage.vo.product.ProductVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class PayOrderService {
    @Autowired
    private PayorderrecordMapper payorderrecordMapper;
    @Autowired
    private PayorderMapper payorderMapper;
    @Autowired
    private ProductMapper productMapper;
    @Autowired
    private ProducttypeMapper producttypeMapper;
    @Autowired
    private ManageuserMapper manageuserMapper;
    @Autowired
    private RoleMapper roleMapper;
    @Autowired
    private CustomerMapper customerMapper;
    @Autowired
    private CustomertypeMapper customertypeMapper;
    @Autowired
    private BackflowMapper backflowMapper;

    // 添加订单
    public void addOrder(PayOrderVo payOrderVo) {
        addPayOrder(payOrderVo, ConstantsForDomain.ORDER_TYPE_BUY);
    }

    public void addPayOrder(PayOrderVo payOrderVo, Integer type) {
        // 税金
        double tax = 0;
        // 单据总额
        double rental = 0;
        for (PayOrderRecordVo payOrderRecordVo : payOrderVo.getPayOrderRecordVos()) {
            double taxSubTotal = payOrderRecordVo.getUnitprice()
                    * payOrderRecordVo.getTaxpoint() * Constants.PERCENTAGE
                    * payOrderRecordVo.getCount()
                    * payOrderRecordVo.getDiscount() * Constants.PERCENTAGE;
            double totalMoney = payOrderRecordVo.getUnitprice()
                    * payOrderRecordVo.getCount()
                    * payOrderRecordVo.getDiscount() * Constants.PERCENTAGE
                    + taxSubTotal;
            tax += taxSubTotal;
            rental += totalMoney;
        }
        Payorder payorder = new Payorder();
        payorder.setOrdernum(payOrderVo.getOrderNum());
        payorder.setOrderdate(CommonUtil.stringToDate(payOrderVo.getOrderDate()));
        payorder.setManageuserid(Long.valueOf(payOrderVo.getManageUserId()));
        payorder.setCustomerid(Long.valueOf(payOrderVo.getCustomerId()));
        payorder.setPaytype(payOrderVo.getPayType());
        payorder.setPaydate(CommonUtil.stringToDate(payOrderVo.getPayDate()));
        payorder.setDeliverydate(CommonUtil.stringToDate(payOrderVo.getDeliveryDate()));
        payorder.setTax(Double.toString(tax));
        payorder.setDepositnum(payOrderVo.getDepositNum());
        payorder.setDepositrate(Float.toString(payOrderVo.getDepositRate()));
        log.info("定金比率：{}", payOrderVo.getDepositRate());
        payorder.setDeposit(Double.toString(rental * payOrderVo.getDepositRate() / Constants.DATABASE_NUMBER_STORE_UNIT));
        payorder.setRental(Double.toString(rental));
        payorder.setRemark(payOrderVo.getRemark());
        payorder.setLogistics(payOrderVo.getLogistics());
        payorder.setLogisticsnum(payOrderVo.getLogisticsNum());
        payorder.setLogisticsremark(payOrderVo.getLogisticsRemark());
        payorder.setType(type);
        payorder.setStatus(ConstantsForDomain.ORDER_STATUS_NORMAL);
        log.info("订单：{}", payorder);
        payorderMapper.insert(payorder);

        for (PayOrderRecordVo payOrderRecordVo : payOrderVo.getPayOrderRecordVos()) {
            Payorderrecord payor = new Payorderrecord();
            payor.setPayorderid(Long.valueOf(String.valueOf(payorder.getId())));
            payor.setProductid(Long.valueOf(payOrderRecordVo.getProductid()));
            payor.setModelno(payOrderRecordVo.getModelNo());
            payor.setUnitprice(Float.toString(payOrderRecordVo.getUnitprice()));
            payor.setTaxpoint(Float.toString(payOrderRecordVo.getTaxpoint()));
            payor.setCount(payOrderRecordVo.getCount());
            payor.setDiscount(Float.toString(payOrderRecordVo.getDiscount()));
            // 税额小计
            double taxSubTotal = payOrderRecordVo.getUnitprice()
                    * payOrderRecordVo.getTaxpoint() * Constants.PERCENTAGE
                    * payOrderRecordVo.getCount()
                    * payOrderRecordVo.getDiscount() * Constants.PERCENTAGE;
            payor.setTaxsubtotal(Double.toString(taxSubTotal));
            log.info("单价：{}", payOrderRecordVo.getUnitprice());
            log.info("税额小计：{}", taxSubTotal);
            // 价格合计
            double totalMoney = payOrderRecordVo.getUnitprice()
                    * payOrderRecordVo.getCount()
                    * payOrderRecordVo.getDiscount() * Constants.PERCENTAGE
                    + taxSubTotal;
            payor.setTotalmoney(Double.toString(totalMoney));
            log.info("价格合计：{}", totalMoney);
            payor.setWeighttolerance(payOrderRecordVo.getWeightTolerance());
            payor.setChangecolor(payOrderRecordVo.getChangeColor());
            payor.setLarghezza(payOrderRecordVo.getLarghezza());
            payor.setWeight(payOrderRecordVo.getWeight());
            payorderrecordMapper.insert(payor);

        }
    }

    /**
     * 订单分页
     *
     * @param page
     * @param pageSize
     * @return
     */
    public Page<PayOrderPageVo> getPayOrderPage(Integer page, Integer pageSize) {
        PageRequest pageRequest = new PageRequest(page, pageSize);
        List<Payorderrecord> payOrderRecordList;
        List<PayOrderRecordVo> orderRecordVos = new ArrayList<>();
        Long count = payorderMapper.findCountByStatus();
        List<PayOrderPageVo> vos = new ArrayList<>();
        if (count > 0) {
            // 获取订单列表
            List<Payorder> list = payorderMapper.findPageByType(pageRequest, ConstantsForDomain.ORDER_TYPE_BUY);
            for (Payorder payorder : list) {
                // 订单销售人员
                Manageuser manageuser = manageuserMapper.selectByPrimaryKey(payorder.getManageuserid());
                List<Role> roles = roleMapper.findRoleByManageUserId(String.valueOf(manageuser.getId()));
                ManageUserVo manageUserVo = ManageUserVo.of(manageuser, roles);
                // 订单客户
                Customer customer = customerMapper.selectByPrimaryKey(payorder.getCustomerid());
                Customertype customertype = customertypeMapper.selectByPrimaryKey(customer.getCustomerTypeId());
                CustomerVo customerVo = CustomerVo.of(customer, customertype.getType());
                // 订单
                payOrderRecordList = payorderrecordMapper.findListByPayOrderId(payorder.getId());
                for (Payorderrecord payorderrecord : payOrderRecordList) {
                    Product product = productMapper.selectByPrimaryKey(Long.valueOf(payorderrecord.getProductid()));
                    Producttype producttype = producttypeMapper.selectByPrimaryKey(product.getTypeid());
                    ProductVo productVo = ProductVo.of(product, producttype);
                    orderRecordVos.add(PayOrderRecordVo.of(payorderrecord, productVo));
                }
                List<Backflow> flow = backflowMapper.findBackFlowByPayOrderId(payorder.getId());
                float isBackMoney = 0;
                for (Backflow backflow : flow) {
                    isBackMoney += Float.valueOf(backflow.getMoney());
                }
                log.info("已回款金额：{}", isBackMoney);
                vos.add(PayOrderPageVo.of(payorder, manageUserVo, customerVo, orderRecordVos, isBackMoney));
            }
        }
        log.info("返回：{}", JSONObject.toJSONString(vos));
        return new Page<>(pageRequest, vos, count);
    }

    /**
     * 根据id查询
     *
     * @param id
     * @return
     */
    public PayOrderPageVo getPayOrder(Long id) {
        Payorder payorder = payorderMapper.selectByPrimaryKey(id);
        return getPayOrderPageVo(payorder);
    }

    public PayOrderPageVo getPayOrderPageVo(Payorder payorder) {
        if (payorder == null) {
            throw new ErrorRollbackException("无法找到指定订单");
        }
        List<Payorderrecord> payOrderRecordList;
        List<ProductVo> productVos = new ArrayList<>();
        List<PayOrderRecordVo> orderRecordVos = new ArrayList<>();
        // 订单销售人员
        Manageuser manageuser = manageuserMapper.selectByPrimaryKey(payorder.getManageuserid());
        List<Role> roles = roleMapper.findRoleByManageUserId(String.valueOf(manageuser.getId()));
        ManageUserVo manageUserVo = ManageUserVo.of(manageuser, roles);
        // 订单客户
        Customer customer = customerMapper.selectByPrimaryKey(payorder.getCustomerid());
        Customertype customertype = customertypeMapper.selectByPrimaryKey(customer.getCustomerTypeId());
        CustomerVo customerVo = CustomerVo.of(customer, customertype.getType());
        // 产品
        payOrderRecordList = payorderrecordMapper.findListByPayOrderId(payorder.getId());
        for (Payorderrecord payorderrecord : payOrderRecordList) {
            Product product = productMapper.selectByPrimaryKey(Long.valueOf(payorderrecord.getProductid()));
            Producttype producttype = producttypeMapper.selectByPrimaryKey(product.getTypeid());
            ProductVo productVo = ProductVo.of(product, producttype);
            orderRecordVos.add(PayOrderRecordVo.of(payorderrecord, productVo));
        }
        List<Backflow> flow = backflowMapper.findBackFlowByPayOrderId(payorder.getId());
        float isBackMoney = 0;
        for (Backflow backflow : flow) {
            isBackMoney += Float.valueOf(backflow.getMoney());
        }
        log.info("已回款金额：{}", isBackMoney);
        PayOrderPageVo payOrderPageVo = PayOrderPageVo.of(payorder, manageUserVo, customerVo, orderRecordVos, isBackMoney);

        return payOrderPageVo;
    }

    /**
     * 订单下拉模糊查询
     *
     * @param key
     * @return
     */
    public List<OrderFuzzyQueryVo> findOrderFuzzyQuery(String key) {
        List<OrderFuzzyQuery> queryList = payorderMapper.findOrderFuzzyQuery(key, ConstantsForDomain.ORDER_TYPE_BUY);
        List<OrderFuzzyQueryVo> vos = new ArrayList<>();
        if (queryList != null) {
            for (OrderFuzzyQuery orderFuzzyQuery : queryList) {
                vos.add(OrderFuzzyQueryVo.of(orderFuzzyQuery));
            }
        }
        return vos;
    }

    // 添加检测备注
    public void addDetection(String id, String detection) {
        Payorder payorder = payorderMapper.selectByPrimaryKey(id);
        payorder.setDetection(detection);
        payorderMapper.updateByPrimaryKey(payorder);
    }
}
