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
public class SpecimenService {
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
    @Autowired
    private PayOrderService payOrderService;

    // 添加订单
    public void addOrder(PayOrderVo payOrderVo) {
        payOrderService.addPayOrder(payOrderVo, ConstantsForDomain.ORDER_TYPE_SPECIMEN);
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
        List<PayOrderPageVo> vos = new ArrayList<>();
        List<Payorderrecord> payOrderRecordList;
        List<PayOrderRecordVo> orderRecordVos = new ArrayList<>();
        Long count = payorderMapper.findCountByStatus();
        if (count > 0) {
            // 获取订单列表
            List<Payorder> list = payorderMapper.findPageByType(pageRequest, ConstantsForDomain.ORDER_TYPE_SPECIMEN);
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
                for (Backflow backflow: flow){
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

        Payorder payorder = payorderMapper.findByIdAndType(id, ConstantsForDomain.ORDER_TYPE_SPECIMEN);
        return payOrderService.getPayOrderPageVo(payorder);
    }


    /**
     * 订单下拉模糊查询
     * @param key
     * @return
     */
    public List<OrderFuzzyQueryVo> findOrderFuzzyQuery(String key) {
        List<OrderFuzzyQuery> queryList = payorderMapper.findOrderFuzzyQuery(key, ConstantsForDomain.ORDER_TYPE_SPECIMEN);
        ArrayList<OrderFuzzyQueryVo> vos = new ArrayList<>();
        if (queryList != null) {
            for (OrderFuzzyQuery orderFuzzyQuery : queryList) {
                vos.add(OrderFuzzyQueryVo.of(orderFuzzyQuery));
            }
        }
        return vos;
    }
}
