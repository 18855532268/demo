package com.example.manage.domain;

import java.io.Serializable;
import lombok.Data;

/**
 * productionprocess
 * @author 
 */
@Data
public class Productionprocess implements Serializable {
    private Long id;

    private Long productionid;

    private String process;

    private static final long serialVersionUID = 1L;
}