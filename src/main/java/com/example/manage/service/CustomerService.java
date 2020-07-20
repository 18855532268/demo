package com.example.manage.service;


import com.alibaba.fastjson.JSONObject;
import com.example.manage.constant.ConstantsForDomain;
import com.example.manage.domain.Customer;
import com.example.manage.domain.Customertype;
import com.example.manage.exception.ErrorRollbackException;
import com.example.manage.mapper.CustomerMapper;
import com.example.manage.mapper.CustomertypeMapper;
import com.example.manage.util.CommonUtil;
import com.example.manage.util.Page;
import com.example.manage.util.PageRequest;
import com.example.manage.vo.customer.CustomerVo;
import com.example.manage.vo.customer.CustomertypeVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class CustomerService {
    @Autowired
    private CustomerMapper customerMapper;
    @Autowired
    private CustomertypeMapper customertypeMapper;

    /**
     * 获取用户分页信息
     *
     * @param page
     * @param pageSize
     * @return
     */
    public Page<CustomerVo> getPage(Integer page, Integer pageSize) {
        PageRequest pageRequest = new PageRequest(page, pageSize);
        List<CustomerVo> vos = new ArrayList<>();
        Long count = customerMapper.findCountByStatus();
        if (count > 0) {
            List<Customer> list = customerMapper.findPage(pageRequest);
            for (Customer customer : list) {
                Customertype customertype = customertypeMapper.selectByPrimaryKey(customer.getCustomerTypeId());
//                log.info("返回:{}",customertype);
                vos.add(CustomerVo.of(customer, customertype.getType()));
            }
        }
        return new Page<>(pageRequest, vos, count);
    }

    /**
     * 添加用户
     *
     * @param customerVo
     */
    public void addCustomer(CustomerVo customerVo) {
        Customer customer = new Customer();
//        customer.setId(CommonUtil.getUUID());
        customer.setCustomerNum(customerVo.getCustomerNum());
        customer.setName(customerVo.getName());
        customer.setProvince(customerVo.getProvince());
        customer.setCountry(customerVo.getCountry());
        customer.setCustomerTypeId(Long.valueOf(customerVo.getCustomerTypeId()));
        customer.setLinkmanName(customerVo.getLinkmanName());
        customer.setLinkmanCellphone(customerVo.getLinkmanCellphone());
        customer.setWechat(customerVo.getWeChat());
        customer.setPostalCode(customerVo.getPostalCode());
        customer.setAddress(customerVo.getAddress());
        customer.setRemark(customerVo.getRemark());
        customer.setStatus(ConstantsForDomain.CUSTOMER_STATUS_NORMAL);
//        Customertype customertype = customertypeMapper.selectByType(customerVo.getCustomerType());
//        if (customertype != null) {
//            customer.setCustomerTypeId(customertype.getId());
//        }
        log.info("添加顾客:{}", JSONObject.toJSONString(customer));
        customerMapper.insert(customer);
    }

    /**
     * 修改顾客信息
     *
     * @param customerVo
     */
    public void modifiedCustomer(CustomerVo customerVo) {
        Customer customer = customerMapper.selectByIdAndStatus(String.valueOf(customerVo.getId()));
        if (customer == null) {
            throw new ErrorRollbackException("该顾客不存在");
        } else {
            customer.setCustomerNum(customerVo.getCustomerNum());
            customer.setName(customerVo.getName());
            customer.setProvince(customerVo.getProvince());
            customer.setCountry(customerVo.getCountry());
            customer.setCustomerTypeId(Long.valueOf(customerVo.getCustomerTypeId()));
            customer.setLinkmanName(customerVo.getLinkmanName());
            customer.setLinkmanCellphone(customerVo.getLinkmanCellphone());
            customer.setWechat(customerVo.getWeChat());
            customer.setPostalCode(customerVo.getPostalCode());
            customer.setAddress(customerVo.getAddress());
            customer.setRemark(customerVo.getRemark());
            customer.setStatus(ConstantsForDomain.CUSTOMER_STATUS_NORMAL);
            log.info("修改顾客:{}", JSONObject.toJSONString(customer));
            customerMapper.updateByPrimaryKey(customer);
        }
    }

    /**
     * 删除顾客 假删
     *
     * @param id
     */
    public void deleteCustomer(String id) {
        Customer customer = customerMapper.selectByIdAndStatus(id);
        if (customer == null) {
            throw new ErrorRollbackException("该顾客不存在");
        } else {
            customer.setStatus(ConstantsForDomain.CUSTOMER_STATUS_DELETE);
            customerMapper.updateByPrimaryKey(customer);
        }
    }


    /**
     * 获取用户类型
     *
     * @param page
     * @param pageSize
     * @return
     */
    public Page<CustomertypeVo> getTypePage(Integer page, Integer pageSize) {
        PageRequest pageRequest = new PageRequest(page, pageSize);
        List<CustomertypeVo> vos = new ArrayList<>();
        Long count = customertypeMapper.findCount();
        if (count > 0) {
            List<Customertype> list = customertypeMapper.findPage(pageRequest);
            for (Customertype customertype : list) {
                vos.add(CustomertypeVo.of(customertype));
            }
        }
        return new Page<>(pageRequest, vos, count);
    }

    /**
     * 添加type
     *
     * @param type
     */
    public void addCustomerType(String type) {
        Customertype customertype = new Customertype();
//        customertype.setId(CommonUtil.getUUID());
        customertype.setType(type);
        customertypeMapper.insert(customertype);
    }

    /**
     * 修改Type
     *
     * @param
     */
    public void modifiedType(String id, String type) {
        CommonUtil.checkParameters(id, type);
        Customertype customertype = customertypeMapper.selectByPrimaryKey(id);
        if (customertype == null){
            throw new ErrorRollbackException("该type不存在");
        }
        customertype.setType(type);
        customertypeMapper.insert(customertype);
    }

    /**
     * 删除type
     *
     * @param id
     */
    public void deleteType(String id) {
        customertypeMapper.deleteByPrimaryKey(id);
    }

    public Customer getCustomerById(Long id) {
        Customer customer = customerMapper.selectByPrimaryKey(id);

        return customer;
    }
}
