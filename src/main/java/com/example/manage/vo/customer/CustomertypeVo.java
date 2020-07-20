package com.example.manage.vo.customer;

import com.example.manage.domain.Customertype;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@Builder
public class CustomertypeVo {
    private Long id;
    private String type;

    public static CustomertypeVo of(Customertype customertype) {
        return CustomertypeVo.builder()
                .id(customertype.getId())
                .type(customertype.getType())
                .build();
    }

    public static List<CustomertypeVo> of(List<Customertype> list){
        List<CustomertypeVo> vos = new ArrayList<>();
        if (list != null){
            for (Customertype customertype:list){
                vos.add(CustomertypeVo.of(customertype));
            }
        }
        return vos;
    }
}
