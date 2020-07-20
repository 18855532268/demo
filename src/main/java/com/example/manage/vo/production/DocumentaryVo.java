package com.example.manage.vo.production;

import lombok.*;

import java.io.Serializable;
import java.util.Date;

/**
 * documentary
 * @author 
 */
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Data
@Builder
public class DocumentaryVo implements Serializable {

    private String merdate;

    private Long productionid;

    private Long cureid;

    private Long merchanerid;

    private String remark;

    private String imgurl;

    private static final long serialVersionUID = 1L;


}