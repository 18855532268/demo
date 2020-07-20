package com.example.manage.vo.rawMaterialsStore;

import com.example.manage.domain.Purchaserecord;
import com.example.manage.domain.Rawmaterialsstore;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Data
@Builder
public class PurchaseRecordPageVo {

    private Long id;
    //    private Long rawmaterialsid;
    private Long rawMaterialsId;
    private String num;
    private String name;
    private String imgurl;
    private String color;
    private String weight;
    /**
     * 缸号
     */
    private String vatnum;
    private String larghezza;
    private String reelnum;
    // 库存
    private Integer Inventory;
    private String remark;

    private float unitprice;
    private float taxpoint;
    private Integer count;
    private String taxsubtotal;
    private String totalmoney;

    public static PurchaseRecordPageVo of(Purchaserecord purchaserecord, Rawmaterialsstore rawmaterialsstore){
        return PurchaseRecordPageVo.builder()
                .id(purchaserecord.getId())
                .rawMaterialsId(rawmaterialsstore.getId())
                .num(rawmaterialsstore.getNum())
                .name(rawmaterialsstore.getName())
                .imgurl(rawmaterialsstore.getImgurl())
                .color(rawmaterialsstore.getColor())
                .weight(rawmaterialsstore.getWeight())
                .vatnum(rawmaterialsstore.getVatnum())
                .larghezza(rawmaterialsstore.getLarghezza())
                .reelnum(rawmaterialsstore.getReelnum())
                .Inventory(rawmaterialsstore.getCount())
                .remark(rawmaterialsstore.getRemark())
                .unitprice(Float.parseFloat(purchaserecord.getUnitprice()))
                .taxpoint(Float.parseFloat(purchaserecord.getTaxpoint()))
                .count(purchaserecord.getCount())
                .taxsubtotal(purchaserecord.getTaxsubtotal())
                .taxsubtotal(purchaserecord.getTaxsubtotal())
                .build();
    }
}
