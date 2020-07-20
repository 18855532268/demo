package com.example.manage.vo.rawMaterialsStore;

import com.example.manage.domain.Rawmaterialsstore;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Data
@Builder
public class RawMaterialsStoreVo {

    private Long id;
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

    private Integer count;

    private String remark;

    public static RawMaterialsStoreVo of(Rawmaterialsstore rawmaterialsstore){
        return RawMaterialsStoreVo.builder()
                .id(rawmaterialsstore.getId())
                .num(rawmaterialsstore.getNum())
                .name(rawmaterialsstore.getName())
                .imgurl(rawmaterialsstore.getImgurl())
                .color(rawmaterialsstore.getColor())
                .weight(rawmaterialsstore.getWeight())
                .vatnum(rawmaterialsstore.getVatnum())
                .larghezza(rawmaterialsstore.getLarghezza())
                .reelnum(rawmaterialsstore.getReelnum())
                .count(rawmaterialsstore.getCount())
                .remark(rawmaterialsstore.getRemark())
                .build();
    }
}
