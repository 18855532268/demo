package com.example.manage.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;

import java.io.Serializable;

/**
 * role
 * @author 
 */
public class Role implements Serializable {
    @TableId(value = "id",type = IdType.AUTO)
    @TableField("id")
    private Long id;

    private String manageuserid;

    private String role;

    private String url;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getManageuserid() {
        return manageuserid;
    }

    public void setManageuserid(String manageuserid) {
        this.manageuserid = manageuserid;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}