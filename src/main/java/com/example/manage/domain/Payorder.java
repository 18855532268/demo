package com.example.manage.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * payorder
 * @author 
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Payorder implements Serializable {
    private Long id;

    private String ordernum;

    private Date orderdate;

    private Long manageuserid;

    private Long customerid;

    private String paytype;

    private Date paydate;

    private Date deliverydate;

    private String tax;

    private String depositnum;

    private String depositrate;

    private String deposit;

    private String rental;

    private String remark;

    private String logistics;

    private String logisticsnum;

    private String logisticsremark;

    private String detection;

    private Integer type;

    private Integer status;

    private static final long serialVersionUID = 1L;
}