package com.example.manage.vo.payOrder;

import com.example.manage.constant.Constants;
import com.example.manage.domain.Payorder;
import com.example.manage.vo.customer.CustomerVo;
import com.example.manage.vo.manage.ManageUserVo;
import com.example.manage.vo.product.ProductVo;
import lombok.Builder;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@Builder
public class PayOrderPageVo {
    private Long id;
    private String ordernum;
    private Date orderdate;
    //    private ManageUserVo manageUserVo;
    private String username;
    //    private String password;
    private String name;
    private String tellphone;
    private String email;
    private String manageUserWeChat;
    //    private List<Role> roles;
    private Date createtime;

    //    private CustomerVo customerVo;
    private String customerNum;
    private String customerName;
    private String province;
    private String country;
    private String customerType;
    private String linkmanName;
    private String linkmanCellphone;
    private String customerWeChat;
    private String postalCode;
    private String address;
    private String customerRemark;

    private String paytype;
    private Date paydate;
    private Date deliverydate;
    private float tax;
    private String depositnum;
    private float depositrate;
    private float deposit;
    private float rental;
    /**
     * 已回款金额
     */
    private float isBackMoney;
    /**
     *欠款
     */
    private float debt;
    // 物流信息
    private String logistics;
    private String logisticsNum;
    private String logisticsRemark;
    private String orderRemark;
    private List<PayOrderRecordVo> payOrderRecordVos;

    public static PayOrderPageVo of(Payorder payorder, ManageUserVo manageUserVo, CustomerVo customerVo,List<PayOrderRecordVo> payOrderRecordVos, float isBackMoney) {

        return PayOrderPageVo.builder()
                .id(payorder.getId())
                .ordernum(payorder.getOrdernum())
                .orderdate(payorder.getOrderdate())
//                .manageUserVo(manageUserVo)
                .username(manageUserVo.getUsername())
//                .password(manageUserVo.getPassword())
                .name(manageUserVo.getName())
                .tellphone(manageUserVo.getTellphone())
                .email(manageUserVo.getEmail())
                .manageUserWeChat(manageUserVo.getWechat())
                .createtime(manageUserVo.getCreatetime())
//                .roles(manageUserVo.getRoles())

//                .customerVo(customerVo)
                .customerNum(customerVo.getCustomerNum())
                .customerName(customerVo.getName())
                .province(customerVo.getProvince())
                .country(customerVo.getCountry())
                .customerType(customerVo.getCustomerType())
                .linkmanName(customerVo.getLinkmanName())
                .linkmanCellphone(customerVo.getLinkmanCellphone())
                .customerWeChat(customerVo.getWeChat())
                .postalCode(customerVo.getPostalCode())
                .address(customerVo.getAddress())
                .customerRemark(customerVo.getRemark())

                .paytype(payorder.getPaytype())
                .paydate(payorder.getPaydate())
                .deliverydate(payorder.getDeliverydate())
                .tax(Float.valueOf(payorder.getTax()))
                .depositnum(payorder.getDepositnum())
                .depositrate(Float.valueOf(payorder.getDepositrate()))
                .deposit(Float.valueOf(payorder.getDeposit()))
                .rental(Float.valueOf(payorder.getRental()))
                .isBackMoney(isBackMoney)
                .debt(Float.valueOf(payorder.getRental()) - isBackMoney)
                .logistics(payorder.getLogistics())
                .logisticsNum(payorder.getLogisticsnum())
                .logisticsRemark(payorder.getLogisticsremark())
                .orderRemark(payorder.getRemark())
                .payOrderRecordVos(payOrderRecordVos)
                .build();
    }
}
