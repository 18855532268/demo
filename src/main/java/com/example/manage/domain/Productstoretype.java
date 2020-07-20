package com.example.manage.domain;

import java.io.Serializable;
import lombok.Data;

/**
 * productstoretype
 * @author 
 */
@Data
public class Productstoretype implements Serializable {
    private Integer id;

    private String producttype;

    private static final long serialVersionUID = 1L;
}