package com.example.manage.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * purchase
 * @author 
 */
@Data
public class Purchase implements Serializable {
    private Long id;

    private String procuretype;

    private Long buyerid;

    private String suppliername;

    private String supplierlinkman;

    private String suppliertellphone;

    private String supperlierpaytype;

    private String supperliercard;

    private Long payid;

    private String settletype;

    private Date planpaydate;

    private Date plandeliverydate;

    private Date buydate;

    private String tax;

    private String rental;

    private String payrental;

    private String remark;

    private static final long serialVersionUID = 1L;
}