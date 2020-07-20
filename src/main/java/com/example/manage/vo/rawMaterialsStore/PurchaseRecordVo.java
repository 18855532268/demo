package com.example.manage.vo.rawMaterialsStore;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Data
@Builder
public class PurchaseRecordVo {

    private Long rawmaterialsid;

    private float unitprice;

    private float taxpoint;

    private Integer count;

//    private String taxsubtotal;
//
//    private String totalmoney;
}
