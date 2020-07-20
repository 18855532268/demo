package com.example.manage.domain.other;

import lombok.Data;

@Data
public class OrderFuzzyQuery {
    private Long id;
    private String orderNum;
    private String customerName;
    private String customerTellphone;
    private String saleName;

}
