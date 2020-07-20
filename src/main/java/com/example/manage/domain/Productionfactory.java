package com.example.manage.domain;

import java.io.Serializable;
import lombok.Data;

/**
 * productionfactory
 * @author 
 */
@Data
public class Productionfactory implements Serializable {
    private Long id;

    private String factory;

    private static final long serialVersionUID = 1L;
}