package com.example.manage.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * production
 * @author 
 */
public class Production implements Serializable {
    private Long id;

    private Long payorderid;

    private Long customerid;

    private Long productid;

    private Long cargotypeid;

    private Long productiontypeid;

    private Long flowid;

    private Long factoryid;

    private Long productionmanageid;

    private Long enterstoremanageid;

    private Integer count;

    private Integer pronum;

    private Date prodeliverydate;

    private String statecov;

    private String weight;

    private String larghezza;

    private String weighttolerance;

    private String lossrate;

    private String color;

    private String isbatchcharge;

    private String announcements;

    private String remark;

    private Integer graynum;

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

    public Long getCustomerid() {
        return customerid;
    }

    public void setCustomerid(Long customerid) {
        this.customerid = customerid;
    }

    public Long getProductid() {
        return productid;
    }

    public void setProductid(Long productid) {
        this.productid = productid;
    }

    public Long getCargotypeid() {
        return cargotypeid;
    }

    public void setCargotypeid(Long cargotypeid) {
        this.cargotypeid = cargotypeid;
    }

    public Long getProductiontypeid() {
        return productiontypeid;
    }

    public void setProductiontypeid(Long productiontypeid) {
        this.productiontypeid = productiontypeid;
    }

    public Long getFlowid() {
        return flowid;
    }

    public void setFlowid(Long flowid) {
        this.flowid = flowid;
    }

    public Long getFactoryid() {
        return factoryid;
    }

    public void setFactoryid(Long factoryid) {
        this.factoryid = factoryid;
    }

    public Long getProductionmanageid() {
        return productionmanageid;
    }

    public void setProductionmanageid(Long productionmanageid) {
        this.productionmanageid = productionmanageid;
    }

    public Long getEnterstoremanageid() {
        return enterstoremanageid;
    }

    public void setEnterstoremanageid(Long enterstoremanageid) {
        this.enterstoremanageid = enterstoremanageid;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getPronum() {
        return pronum;
    }

    public void setPronum(Integer pronum) {
        this.pronum = pronum;
    }

    public Date getProdeliverydate() {
        return prodeliverydate;
    }

    public void setProdeliverydate(Date prodeliverydate) {
        this.prodeliverydate = prodeliverydate;
    }

    public String getStatecov() {
        return statecov;
    }

    public void setStatecov(String statecov) {
        this.statecov = statecov;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getLarghezza() {
        return larghezza;
    }

    public void setLarghezza(String larghezza) {
        this.larghezza = larghezza;
    }

    public String getWeighttolerance() {
        return weighttolerance;
    }

    public void setWeighttolerance(String weighttolerance) {
        this.weighttolerance = weighttolerance;
    }

    public String getLossrate() {
        return lossrate;
    }

    public void setLossrate(String lossrate) {
        this.lossrate = lossrate;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getIsbatchcharge() {
        return isbatchcharge;
    }

    public void setIsbatchcharge(String isbatchcharge) {
        this.isbatchcharge = isbatchcharge;
    }

    public String getAnnouncements() {
        return announcements;
    }

    public void setAnnouncements(String announcements) {
        this.announcements = announcements;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getGraynum() {
        return graynum;
    }

    public void setGraynum(Integer graynum) {
        this.graynum = graynum;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}