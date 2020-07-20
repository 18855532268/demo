package com.example.manage.domain;

import java.io.Serializable;

/**
 * customertype
 * @author 
 */
public class Customertype implements Serializable {
    private Long id;

    private String type;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}