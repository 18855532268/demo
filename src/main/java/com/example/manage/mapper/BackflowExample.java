package com.example.manage.mapper;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BackflowExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BackflowExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andPayorderidIsNull() {
            addCriterion("payOrderId is null");
            return (Criteria) this;
        }

        public Criteria andPayorderidIsNotNull() {
            addCriterion("payOrderId is not null");
            return (Criteria) this;
        }

        public Criteria andPayorderidEqualTo(Long value) {
            addCriterion("payOrderId =", value, "payorderid");
            return (Criteria) this;
        }

        public Criteria andPayorderidNotEqualTo(Long value) {
            addCriterion("payOrderId <>", value, "payorderid");
            return (Criteria) this;
        }

        public Criteria andPayorderidGreaterThan(Long value) {
            addCriterion("payOrderId >", value, "payorderid");
            return (Criteria) this;
        }

        public Criteria andPayorderidGreaterThanOrEqualTo(Long value) {
            addCriterion("payOrderId >=", value, "payorderid");
            return (Criteria) this;
        }

        public Criteria andPayorderidLessThan(Long value) {
            addCriterion("payOrderId <", value, "payorderid");
            return (Criteria) this;
        }

        public Criteria andPayorderidLessThanOrEqualTo(Long value) {
            addCriterion("payOrderId <=", value, "payorderid");
            return (Criteria) this;
        }

        public Criteria andPayorderidIn(List<Long> values) {
            addCriterion("payOrderId in", values, "payorderid");
            return (Criteria) this;
        }

        public Criteria andPayorderidNotIn(List<Long> values) {
            addCriterion("payOrderId not in", values, "payorderid");
            return (Criteria) this;
        }

        public Criteria andPayorderidBetween(Long value1, Long value2) {
            addCriterion("payOrderId between", value1, value2, "payorderid");
            return (Criteria) this;
        }

        public Criteria andPayorderidNotBetween(Long value1, Long value2) {
            addCriterion("payOrderId not between", value1, value2, "payorderid");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNull() {
            addCriterion("money is null");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNotNull() {
            addCriterion("money is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyEqualTo(String value) {
            addCriterion("money =", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotEqualTo(String value) {
            addCriterion("money <>", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThan(String value) {
            addCriterion("money >", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThanOrEqualTo(String value) {
            addCriterion("money >=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThan(String value) {
            addCriterion("money <", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThanOrEqualTo(String value) {
            addCriterion("money <=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLike(String value) {
            addCriterion("money like", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotLike(String value) {
            addCriterion("money not like", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyIn(List<String> values) {
            addCriterion("money in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotIn(List<String> values) {
            addCriterion("money not in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyBetween(String value1, String value2) {
            addCriterion("money between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotBetween(String value1, String value2) {
            addCriterion("money not between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andDateIsNull() {
            addCriterion("`date` is null");
            return (Criteria) this;
        }

        public Criteria andDateIsNotNull() {
            addCriterion("`date` is not null");
            return (Criteria) this;
        }

        public Criteria andDateEqualTo(Date value) {
            addCriterion("`date` =", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotEqualTo(Date value) {
            addCriterion("`date` <>", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThan(Date value) {
            addCriterion("`date` >", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThanOrEqualTo(Date value) {
            addCriterion("`date` >=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThan(Date value) {
            addCriterion("`date` <", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThanOrEqualTo(Date value) {
            addCriterion("`date` <=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateIn(List<Date> values) {
            addCriterion("`date` in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotIn(List<Date> values) {
            addCriterion("`date` not in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateBetween(Date value1, Date value2) {
            addCriterion("`date` between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotBetween(Date value1, Date value2) {
            addCriterion("`date` not between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("`type` is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("`type` is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("`type` =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("`type` <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("`type` >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("`type` >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("`type` <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("`type` <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("`type` like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("`type` not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("`type` in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("`type` not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("`type` between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("`type` not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andIsinvoiceIsNull() {
            addCriterion("isInvoice is null");
            return (Criteria) this;
        }

        public Criteria andIsinvoiceIsNotNull() {
            addCriterion("isInvoice is not null");
            return (Criteria) this;
        }

        public Criteria andIsinvoiceEqualTo(Integer value) {
            addCriterion("isInvoice =", value, "isinvoice");
            return (Criteria) this;
        }

        public Criteria andIsinvoiceNotEqualTo(Integer value) {
            addCriterion("isInvoice <>", value, "isinvoice");
            return (Criteria) this;
        }

        public Criteria andIsinvoiceGreaterThan(Integer value) {
            addCriterion("isInvoice >", value, "isinvoice");
            return (Criteria) this;
        }

        public Criteria andIsinvoiceGreaterThanOrEqualTo(Integer value) {
            addCriterion("isInvoice >=", value, "isinvoice");
            return (Criteria) this;
        }

        public Criteria andIsinvoiceLessThan(Integer value) {
            addCriterion("isInvoice <", value, "isinvoice");
            return (Criteria) this;
        }

        public Criteria andIsinvoiceLessThanOrEqualTo(Integer value) {
            addCriterion("isInvoice <=", value, "isinvoice");
            return (Criteria) this;
        }

        public Criteria andIsinvoiceIn(List<Integer> values) {
            addCriterion("isInvoice in", values, "isinvoice");
            return (Criteria) this;
        }

        public Criteria andIsinvoiceNotIn(List<Integer> values) {
            addCriterion("isInvoice not in", values, "isinvoice");
            return (Criteria) this;
        }

        public Criteria andIsinvoiceBetween(Integer value1, Integer value2) {
            addCriterion("isInvoice between", value1, value2, "isinvoice");
            return (Criteria) this;
        }

        public Criteria andIsinvoiceNotBetween(Integer value1, Integer value2) {
            addCriterion("isInvoice not between", value1, value2, "isinvoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceimgurlIsNull() {
            addCriterion("invoiceImgUrl is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceimgurlIsNotNull() {
            addCriterion("invoiceImgUrl is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceimgurlEqualTo(String value) {
            addCriterion("invoiceImgUrl =", value, "invoiceimgurl");
            return (Criteria) this;
        }

        public Criteria andInvoiceimgurlNotEqualTo(String value) {
            addCriterion("invoiceImgUrl <>", value, "invoiceimgurl");
            return (Criteria) this;
        }

        public Criteria andInvoiceimgurlGreaterThan(String value) {
            addCriterion("invoiceImgUrl >", value, "invoiceimgurl");
            return (Criteria) this;
        }

        public Criteria andInvoiceimgurlGreaterThanOrEqualTo(String value) {
            addCriterion("invoiceImgUrl >=", value, "invoiceimgurl");
            return (Criteria) this;
        }

        public Criteria andInvoiceimgurlLessThan(String value) {
            addCriterion("invoiceImgUrl <", value, "invoiceimgurl");
            return (Criteria) this;
        }

        public Criteria andInvoiceimgurlLessThanOrEqualTo(String value) {
            addCriterion("invoiceImgUrl <=", value, "invoiceimgurl");
            return (Criteria) this;
        }

        public Criteria andInvoiceimgurlLike(String value) {
            addCriterion("invoiceImgUrl like", value, "invoiceimgurl");
            return (Criteria) this;
        }

        public Criteria andInvoiceimgurlNotLike(String value) {
            addCriterion("invoiceImgUrl not like", value, "invoiceimgurl");
            return (Criteria) this;
        }

        public Criteria andInvoiceimgurlIn(List<String> values) {
            addCriterion("invoiceImgUrl in", values, "invoiceimgurl");
            return (Criteria) this;
        }

        public Criteria andInvoiceimgurlNotIn(List<String> values) {
            addCriterion("invoiceImgUrl not in", values, "invoiceimgurl");
            return (Criteria) this;
        }

        public Criteria andInvoiceimgurlBetween(String value1, String value2) {
            addCriterion("invoiceImgUrl between", value1, value2, "invoiceimgurl");
            return (Criteria) this;
        }

        public Criteria andInvoiceimgurlNotBetween(String value1, String value2) {
            addCriterion("invoiceImgUrl not between", value1, value2, "invoiceimgurl");
            return (Criteria) this;
        }

        public Criteria andInvoicetypeIsNull() {
            addCriterion("invoiceType is null");
            return (Criteria) this;
        }

        public Criteria andInvoicetypeIsNotNull() {
            addCriterion("invoiceType is not null");
            return (Criteria) this;
        }

        public Criteria andInvoicetypeEqualTo(String value) {
            addCriterion("invoiceType =", value, "invoicetype");
            return (Criteria) this;
        }

        public Criteria andInvoicetypeNotEqualTo(String value) {
            addCriterion("invoiceType <>", value, "invoicetype");
            return (Criteria) this;
        }

        public Criteria andInvoicetypeGreaterThan(String value) {
            addCriterion("invoiceType >", value, "invoicetype");
            return (Criteria) this;
        }

        public Criteria andInvoicetypeGreaterThanOrEqualTo(String value) {
            addCriterion("invoiceType >=", value, "invoicetype");
            return (Criteria) this;
        }

        public Criteria andInvoicetypeLessThan(String value) {
            addCriterion("invoiceType <", value, "invoicetype");
            return (Criteria) this;
        }

        public Criteria andInvoicetypeLessThanOrEqualTo(String value) {
            addCriterion("invoiceType <=", value, "invoicetype");
            return (Criteria) this;
        }

        public Criteria andInvoicetypeLike(String value) {
            addCriterion("invoiceType like", value, "invoicetype");
            return (Criteria) this;
        }

        public Criteria andInvoicetypeNotLike(String value) {
            addCriterion("invoiceType not like", value, "invoicetype");
            return (Criteria) this;
        }

        public Criteria andInvoicetypeIn(List<String> values) {
            addCriterion("invoiceType in", values, "invoicetype");
            return (Criteria) this;
        }

        public Criteria andInvoicetypeNotIn(List<String> values) {
            addCriterion("invoiceType not in", values, "invoicetype");
            return (Criteria) this;
        }

        public Criteria andInvoicetypeBetween(String value1, String value2) {
            addCriterion("invoiceType between", value1, value2, "invoicetype");
            return (Criteria) this;
        }

        public Criteria andInvoicetypeNotBetween(String value1, String value2) {
            addCriterion("invoiceType not between", value1, value2, "invoicetype");
            return (Criteria) this;
        }

        public Criteria andInvoicetitleIsNull() {
            addCriterion("invoiceTitle is null");
            return (Criteria) this;
        }

        public Criteria andInvoicetitleIsNotNull() {
            addCriterion("invoiceTitle is not null");
            return (Criteria) this;
        }

        public Criteria andInvoicetitleEqualTo(String value) {
            addCriterion("invoiceTitle =", value, "invoicetitle");
            return (Criteria) this;
        }

        public Criteria andInvoicetitleNotEqualTo(String value) {
            addCriterion("invoiceTitle <>", value, "invoicetitle");
            return (Criteria) this;
        }

        public Criteria andInvoicetitleGreaterThan(String value) {
            addCriterion("invoiceTitle >", value, "invoicetitle");
            return (Criteria) this;
        }

        public Criteria andInvoicetitleGreaterThanOrEqualTo(String value) {
            addCriterion("invoiceTitle >=", value, "invoicetitle");
            return (Criteria) this;
        }

        public Criteria andInvoicetitleLessThan(String value) {
            addCriterion("invoiceTitle <", value, "invoicetitle");
            return (Criteria) this;
        }

        public Criteria andInvoicetitleLessThanOrEqualTo(String value) {
            addCriterion("invoiceTitle <=", value, "invoicetitle");
            return (Criteria) this;
        }

        public Criteria andInvoicetitleLike(String value) {
            addCriterion("invoiceTitle like", value, "invoicetitle");
            return (Criteria) this;
        }

        public Criteria andInvoicetitleNotLike(String value) {
            addCriterion("invoiceTitle not like", value, "invoicetitle");
            return (Criteria) this;
        }

        public Criteria andInvoicetitleIn(List<String> values) {
            addCriterion("invoiceTitle in", values, "invoicetitle");
            return (Criteria) this;
        }

        public Criteria andInvoicetitleNotIn(List<String> values) {
            addCriterion("invoiceTitle not in", values, "invoicetitle");
            return (Criteria) this;
        }

        public Criteria andInvoicetitleBetween(String value1, String value2) {
            addCriterion("invoiceTitle between", value1, value2, "invoicetitle");
            return (Criteria) this;
        }

        public Criteria andInvoicetitleNotBetween(String value1, String value2) {
            addCriterion("invoiceTitle not between", value1, value2, "invoicetitle");
            return (Criteria) this;
        }

        public Criteria andInvoicemoneyIsNull() {
            addCriterion("invoiceMoney is null");
            return (Criteria) this;
        }

        public Criteria andInvoicemoneyIsNotNull() {
            addCriterion("invoiceMoney is not null");
            return (Criteria) this;
        }

        public Criteria andInvoicemoneyEqualTo(String value) {
            addCriterion("invoiceMoney =", value, "invoicemoney");
            return (Criteria) this;
        }

        public Criteria andInvoicemoneyNotEqualTo(String value) {
            addCriterion("invoiceMoney <>", value, "invoicemoney");
            return (Criteria) this;
        }

        public Criteria andInvoicemoneyGreaterThan(String value) {
            addCriterion("invoiceMoney >", value, "invoicemoney");
            return (Criteria) this;
        }

        public Criteria andInvoicemoneyGreaterThanOrEqualTo(String value) {
            addCriterion("invoiceMoney >=", value, "invoicemoney");
            return (Criteria) this;
        }

        public Criteria andInvoicemoneyLessThan(String value) {
            addCriterion("invoiceMoney <", value, "invoicemoney");
            return (Criteria) this;
        }

        public Criteria andInvoicemoneyLessThanOrEqualTo(String value) {
            addCriterion("invoiceMoney <=", value, "invoicemoney");
            return (Criteria) this;
        }

        public Criteria andInvoicemoneyLike(String value) {
            addCriterion("invoiceMoney like", value, "invoicemoney");
            return (Criteria) this;
        }

        public Criteria andInvoicemoneyNotLike(String value) {
            addCriterion("invoiceMoney not like", value, "invoicemoney");
            return (Criteria) this;
        }

        public Criteria andInvoicemoneyIn(List<String> values) {
            addCriterion("invoiceMoney in", values, "invoicemoney");
            return (Criteria) this;
        }

        public Criteria andInvoicemoneyNotIn(List<String> values) {
            addCriterion("invoiceMoney not in", values, "invoicemoney");
            return (Criteria) this;
        }

        public Criteria andInvoicemoneyBetween(String value1, String value2) {
            addCriterion("invoiceMoney between", value1, value2, "invoicemoney");
            return (Criteria) this;
        }

        public Criteria andInvoicemoneyNotBetween(String value1, String value2) {
            addCriterion("invoiceMoney not between", value1, value2, "invoicemoney");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("`status` is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("`status` is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("`status` =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("`status` <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("`status` >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("`status` >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("`status` <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("`status` <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("`status` in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("`status` not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("`status` between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("`status` not between", value1, value2, "status");
            return (Criteria) this;
        }
    }

    /**
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}