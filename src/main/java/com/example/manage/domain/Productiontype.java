package com.example.manage.domain;

import java.io.Serializable;
import lombok.Data;

/**
 * productiontype
 * @author 
 */
@Data
public class Productiontype implements Serializable {
    private Long id;

    private String productiontype;

    private static final long serialVersionUID = 1L;
}