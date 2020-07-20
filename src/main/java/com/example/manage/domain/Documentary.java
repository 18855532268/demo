package com.example.manage.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * documentary
 * @author 
 */
public class Documentary implements Serializable {
    private Long id;

    private Date merdate;

    private Long productionid;

    private Long cureid;

    private Long merchanerid;

    private String remark;

    private String imgurl;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getMerdate() {
        return merdate;
    }

    public void setMerdate(Date merdate) {
        this.merdate = merdate;
    }

    public Long getProductionid() {
        return productionid;
    }

    public void setProductionid(Long productionid) {
        this.productionid = productionid;
    }

    public Long getCureid() {
        return cureid;
    }

    public void setCureid(Long cureid) {
        this.cureid = cureid;
    }

    public Long getMerchanerid() {
        return merchanerid;
    }

    public void setMerchanerid(Long merchanerid) {
        this.merchanerid = merchanerid;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }
}