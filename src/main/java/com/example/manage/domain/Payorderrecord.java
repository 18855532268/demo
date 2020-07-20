package com.example.manage.domain;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * payorderrecord
 * @author 
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Payorderrecord implements Serializable {
    private Long id;

    private Long payorderid;

    private Long productid;

    private String modelno;

    private String unitprice;

    private String taxpoint;

    private Integer count;

    private String discount;

    private String taxsubtotal;

    private String totalmoney;

    private String weighttolerance;

    private String changecolor;

    private String larghezza;

    private String weight;

    private static final long serialVersionUID = 1L;
}