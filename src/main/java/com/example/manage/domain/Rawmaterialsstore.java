package com.example.manage.domain;

import java.io.Serializable;

/**
 * rawmaterialsstore
 * @author 
 */
public class Rawmaterialsstore implements Serializable {
    private Long id;

    private String num;

    private String name;

    private String imgurl;

    private String color;

    private String weight;

    private String vatnum;

    private String larghezza;

    private String reelnum;

    private Integer count;

    private String remark;

    private Integer status;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getVatnum() {
        return vatnum;
    }

    public void setVatnum(String vatnum) {
        this.vatnum = vatnum;
    }

    public String getLarghezza() {
        return larghezza;
    }

    public void setLarghezza(String larghezza) {
        this.larghezza = larghezza;
    }

    public String getReelnum() {
        return reelnum;
    }

    public void setReelnum(String reelnum) {
        this.reelnum = reelnum;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}