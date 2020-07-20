package com.example.manage.vo.payOrder;

import com.example.manage.domain.other.OrderFuzzyQuery;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class OrderFuzzyQueryVo {
    private Long id;
    private String orderNum;
    private String customerName;
    private String customerTellphone;
    private String saleName;

    public static OrderFuzzyQueryVo of(OrderFuzzyQuery orderFuzzyQuery){
        return OrderFuzzyQueryVo.builder()
                .id(orderFuzzyQuery.getId())
                .orderNum(orderFuzzyQuery.getOrderNum())
                .customerName(orderFuzzyQuery.getCustomerName())
                .customerTellphone(orderFuzzyQuery.getCustomerTellphone())
                .saleName(orderFuzzyQuery.getSaleName())
                .build();
    }
}
