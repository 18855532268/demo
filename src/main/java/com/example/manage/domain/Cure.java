package com.example.manage.domain;

import java.io.Serializable;

/**
 * cure
 * @author 
 */
public class Cure implements Serializable {
    private Long id;

    private String curename;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCurename() {
        return curename;
    }

    public void setCurename(String curename) {
        this.curename = curename;
    }
}