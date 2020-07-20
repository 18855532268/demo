package com.example.manage.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * productstore
 * @author 
 */
@Data
public class Productstore implements Serializable {
    private Long id;

    private Long productid;

    private String vatnum;

    private Date storedate;

    private String weight;

    private Integer count;

    private String larghezza;

    private String payordertype;

    private String reelnum;

    private Long producttypeid;

    private Integer status;

    private static final long serialVersionUID = 1L;
}