package com.example.manage.domain;

import java.io.Serializable;
import lombok.Data;

/**
 * productioncargotype
 * @author 
 */
@Data
public class Productioncargotype implements Serializable {
    private Long id;

    private String cargotype;

    private static final long serialVersionUID = 1L;
}