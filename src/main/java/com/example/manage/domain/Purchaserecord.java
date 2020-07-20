package com.example.manage.domain;

import java.io.Serializable;

/**
 * purchaserecord
 * @author 
 */
public class Purchaserecord implements Serializable {
    private Long id;

    private Long rawmaterialsid;

    private Long purchaseid;

    private String unitprice;

    private String taxpoint;

    private Integer count;

    private String taxsubtotal;

    private String totalmoney;

    private Integer status;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRawmaterialsid() {
        return rawmaterialsid;
    }

    public void setRawmaterialsid(Long rawmaterialsid) {
        this.rawmaterialsid = rawmaterialsid;
    }

    public Long getPurchaseid() {
        return purchaseid;
    }

    public void setPurchaseid(Long purchaseid) {
        this.purchaseid = purchaseid;
    }

    public String getUnitprice() {
        return unitprice;
    }

    public void setUnitprice(String unitprice) {
        this.unitprice = unitprice;
    }

    public String getTaxpoint() {
        return taxpoint;
    }

    public void setTaxpoint(String taxpoint) {
        this.taxpoint = taxpoint;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getTaxsubtotal() {
        return taxsubtotal;
    }

    public void setTaxsubtotal(String taxsubtotal) {
        this.taxsubtotal = taxsubtotal;
    }

    public String getTotalmoney() {
        return totalmoney;
    }

    public void setTotalmoney(String totalmoney) {
        this.totalmoney = totalmoney;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}