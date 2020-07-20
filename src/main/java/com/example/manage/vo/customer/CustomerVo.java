package com.example.manage.vo.customer;

import com.example.manage.domain.Customer;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;



@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@Builder
public class CustomerVo {
    private Long id;
    private String customerNum;

    private String name;

    private String province;

    private String country;

    private String customerTypeId;
    private String customerType;

    private String linkmanName;

    private String linkmanCellphone;

    private String weChat;

    private String postalCode;

    private String address;

    private String remark;

    public static CustomerVo of(Customer customer, String type){
        return CustomerVo.builder()
                .id(customer.getId())
                .customerNum(customer.getCustomerNum())
                .name(customer.getName())
                .province(customer.getProvince())
                .country(customer.getCountry())
                .customerTypeId(String.valueOf(customer.getCustomerTypeId()))
                .customerType(type)
                .linkmanName(customer.getLinkmanName())
                .linkmanCellphone(customer.getLinkmanCellphone())
                .weChat(customer.getWechat())
                .postalCode(customer.getPostalCode())
                .address(customer.getAddress())
                .remark(customer.getRemark())
                .build();
    }


}
