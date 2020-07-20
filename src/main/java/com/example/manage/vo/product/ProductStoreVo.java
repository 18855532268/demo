package com.example.manage.vo.product;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * productstore
 * @author 
 */
@Data
public class ProductStoreVo implements Serializable {

    private Long productid;

    private String vatnum;

//    private Date storedate;

    private String weight;

    private Integer count;

    private String larghezza;

    private String payordertype;

    private String reelnum;

    private Long producttypeid;

//    private Integer status;

    private static final long serialVersionUID = 1L;
}