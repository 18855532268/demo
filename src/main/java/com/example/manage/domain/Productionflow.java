package com.example.manage.domain;

import java.io.Serializable;
import lombok.Data;

/**
 * productionflow
 * @author 
 */
@Data
public class Productionflow implements Serializable {
    private Long id;

    private String flow;

    private static final long serialVersionUID = 1L;
}