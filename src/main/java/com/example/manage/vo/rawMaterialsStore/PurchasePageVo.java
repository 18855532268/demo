package com.example.manage.vo.rawMaterialsStore;

import com.example.manage.domain.Manageuser;
import com.example.manage.domain.Purchase;
import com.example.manage.util.CommonUtil;
import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Data
@Builder
public class PurchasePageVo {
    private Long id;
    private String procuretype;
    // 采购专员
    //    private Long buyerid;
    private String username;
//    private String password;
    private String name;
    private String tellphone;
    private String email;
    private String wechat;

    private String suppliername;
    private String supplierlinkman;
    private String suppliertellphone;
    private String supperlierpaytype;
    private String supperliercard;

    // 订单编号
    private String orderNum;

    private String settletype;
    private String planpaydate;
    private String plandeliverydate;
    private String buydate;
    private float tax;
    private float rental;
    private float payRental;
    private float debt;
    private String remark;
    private List<PurchaseRecordPageVo> purchaseRecordPageVos;

    public static PurchasePageVo of(Purchase purchase, Manageuser manageuser,
                                      String orderNum, List<PurchaseRecordPageVo> purchaseRecordPageVos){
        float rental = Float.parseFloat(purchase.getRental());

        float payRental = Float.parseFloat(purchase.getPayrental());
        return PurchasePageVo.builder()
                .id(purchase.getId())
                .procuretype(purchase.getProcuretype())
                .username(manageuser.getUsername())
                .name(manageuser.getName())
                .tellphone(manageuser.getTellphone())
                .email(manageuser.getEmail())
                .wechat(manageuser.getWechat())
                .suppliername(purchase.getSuppliername())
                .supplierlinkman(purchase.getSupplierlinkman())
                .suppliertellphone(purchase.getSuppliertellphone())
                .supperlierpaytype(purchase.getSupperlierpaytype())
                .supperliercard(purchase.getSupperliercard())
                .orderNum(orderNum)
                .settletype(purchase.getSettletype())
                .planpaydate(CommonUtil.dateToStr(purchase.getPlanpaydate()))
                .plandeliverydate(CommonUtil.dateToStr(purchase.getPlandeliverydate()))
                .buydate(CommonUtil.dateToStr(purchase.getBuydate()))
                .tax(Float.valueOf(purchase.getTax()))
                .rental(Float.valueOf(purchase.getRental()))
                .payRental(Float.valueOf(purchase.getPayrental()))
                .debt(rental - payRental)
                .remark(purchase.getRemark())
                .purchaseRecordPageVos(purchaseRecordPageVos)
                .build();
    }
}
