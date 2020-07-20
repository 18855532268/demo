package com.example.manage.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * backflow
 * @author 
 */
public class Backflow implements Serializable {
    private Long id;

    private Long payorderid;

    private String money;

    private Date date;

    private String type;

    private String remark;

    private Integer isinvoice;

    private String invoiceimgurl;

    private String invoicetype;

    private String invoicetitle;

    private String invoicemoney;

    private Integer status;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPayorderid() {
        return payorderid;
    }

    public void setPayorderid(Long payorderid) {
        this.payorderid = payorderid;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getIsinvoice() {
        return isinvoice;
    }

    public void setIsinvoice(Integer isinvoice) {
        this.isinvoice = isinvoice;
    }

    public String getInvoiceimgurl() {
        return invoiceimgurl;
    }

    public void setInvoiceimgurl(String invoiceimgurl) {
        this.invoiceimgurl = invoiceimgurl;
    }

    public String getInvoicetype() {
        return invoicetype;
    }

    public void setInvoicetype(String invoicetype) {
        this.invoicetype = invoicetype;
    }

    public String getInvoicetitle() {
        return invoicetitle;
    }

    public void setInvoicetitle(String invoicetitle) {
        this.invoicetitle = invoicetitle;
    }

    public String getInvoicemoney() {
        return invoicemoney;
    }

    public void setInvoicemoney(String invoicemoney) {
        this.invoicemoney = invoicemoney;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}