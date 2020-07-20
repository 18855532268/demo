package com.example.manage.vo.rawMaterialsStore;

import lombok.*;

import java.util.Date;
import java.util.List;
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Data
@Builder
public class PurchaseVo {

    private String procuretype;

    private Long buyerid;

    private String suppliername;

    private String supplierlinkman;

    private String suppliertellphone;

    private String supperlierpaytype;

    private String supperliercard;

    private Long payid;

    private String settletype;

    private String planpaydate;

    private String plandeliverydate;

    private String buydate;

//    private String tax;

//    private String rental;

    private String remark;

    private List<PurchaseRecordVo> purchaseRecordVos;
}
