package com.example.manage.vo.production;

import com.example.manage.domain.Cure;
import com.example.manage.domain.Documentary;
import com.example.manage.domain.Manageuser;
import com.example.manage.util.CommonUtil;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

/**
 * documentary
 *
 * @author
 */

@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Data
@Builder
public class DocumentaryPageVo implements Serializable {
    private Long id;
    private Long prodyctionId;
    // 跟单员
    private String merchanerName;
    // 加工商
    private String cureName;

    private String merdate;

    private String imgurl;

    private static final long serialVersionUID = 1L;

    public static DocumentaryPageVo of(Documentary documentary, Manageuser manageuser, Cure cure) {
        return DocumentaryPageVo.builder()
                .id(documentary.getId())
                .prodyctionId(documentary.getProductionid())
                .cureName(cure.getCurename())
                .merchanerName(manageuser.getUsername())
                .merdate(CommonUtil.dateToStr(documentary.getMerdate()))
                .imgurl(documentary.getImgurl())
                .build();
    }
}