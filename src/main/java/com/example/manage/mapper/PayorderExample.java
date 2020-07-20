package com.example.manage.mapper;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PayorderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PayorderExample() {
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

        public Criteria andOrdernumIsNull() {
            addCriterion("orderNum is null");
            return (Criteria) this;
        }

        public Criteria andOrdernumIsNotNull() {
            addCriterion("orderNum is not null");
            return (Criteria) this;
        }

        public Criteria andOrdernumEqualTo(String value) {
            addCriterion("orderNum =", value, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumNotEqualTo(String value) {
            addCriterion("orderNum <>", value, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumGreaterThan(String value) {
            addCriterion("orderNum >", value, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumGreaterThanOrEqualTo(String value) {
            addCriterion("orderNum >=", value, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumLessThan(String value) {
            addCriterion("orderNum <", value, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumLessThanOrEqualTo(String value) {
            addCriterion("orderNum <=", value, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumLike(String value) {
            addCriterion("orderNum like", value, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumNotLike(String value) {
            addCriterion("orderNum not like", value, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumIn(List<String> values) {
            addCriterion("orderNum in", values, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumNotIn(List<String> values) {
            addCriterion("orderNum not in", values, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumBetween(String value1, String value2) {
            addCriterion("orderNum between", value1, value2, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumNotBetween(String value1, String value2) {
            addCriterion("orderNum not between", value1, value2, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrderdateIsNull() {
            addCriterion("orderDate is null");
            return (Criteria) this;
        }

        public Criteria andOrderdateIsNotNull() {
            addCriterion("orderDate is not null");
            return (Criteria) this;
        }

        public Criteria andOrderdateEqualTo(Date value) {
            addCriterion("orderDate =", value, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateNotEqualTo(Date value) {
            addCriterion("orderDate <>", value, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateGreaterThan(Date value) {
            addCriterion("orderDate >", value, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateGreaterThanOrEqualTo(Date value) {
            addCriterion("orderDate >=", value, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateLessThan(Date value) {
            addCriterion("orderDate <", value, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateLessThanOrEqualTo(Date value) {
            addCriterion("orderDate <=", value, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateIn(List<Date> values) {
            addCriterion("orderDate in", values, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateNotIn(List<Date> values) {
            addCriterion("orderDate not in", values, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateBetween(Date value1, Date value2) {
            addCriterion("orderDate between", value1, value2, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateNotBetween(Date value1, Date value2) {
            addCriterion("orderDate not between", value1, value2, "orderdate");
            return (Criteria) this;
        }

        public Criteria andManageuseridIsNull() {
            addCriterion("manageUserId is null");
            return (Criteria) this;
        }

        public Criteria andManageuseridIsNotNull() {
            addCriterion("manageUserId is not null");
            return (Criteria) this;
        }

        public Criteria andManageuseridEqualTo(Long value) {
            addCriterion("manageUserId =", value, "manageuserid");
            return (Criteria) this;
        }

        public Criteria andManageuseridNotEqualTo(Long value) {
            addCriterion("manageUserId <>", value, "manageuserid");
            return (Criteria) this;
        }

        public Criteria andManageuseridGreaterThan(Long value) {
            addCriterion("manageUserId >", value, "manageuserid");
            return (Criteria) this;
        }

        public Criteria andManageuseridGreaterThanOrEqualTo(Long value) {
            addCriterion("manageUserId >=", value, "manageuserid");
            return (Criteria) this;
        }

        public Criteria andManageuseridLessThan(Long value) {
            addCriterion("manageUserId <", value, "manageuserid");
            return (Criteria) this;
        }

        public Criteria andManageuseridLessThanOrEqualTo(Long value) {
            addCriterion("manageUserId <=", value, "manageuserid");
            return (Criteria) this;
        }

        public Criteria andManageuseridIn(List<Long> values) {
            addCriterion("manageUserId in", values, "manageuserid");
            return (Criteria) this;
        }

        public Criteria andManageuseridNotIn(List<Long> values) {
            addCriterion("manageUserId not in", values, "manageuserid");
            return (Criteria) this;
        }

        public Criteria andManageuseridBetween(Long value1, Long value2) {
            addCriterion("manageUserId between", value1, value2, "manageuserid");
            return (Criteria) this;
        }

        public Criteria andManageuseridNotBetween(Long value1, Long value2) {
            addCriterion("manageUserId not between", value1, value2, "manageuserid");
            return (Criteria) this;
        }

        public Criteria andCustomeridIsNull() {
            addCriterion("customerId is null");
            return (Criteria) this;
        }

        public Criteria andCustomeridIsNotNull() {
            addCriterion("customerId is not null");
            return (Criteria) this;
        }

        public Criteria andCustomeridEqualTo(Long value) {
            addCriterion("customerId =", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotEqualTo(Long value) {
            addCriterion("customerId <>", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridGreaterThan(Long value) {
            addCriterion("customerId >", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridGreaterThanOrEqualTo(Long value) {
            addCriterion("customerId >=", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridLessThan(Long value) {
            addCriterion("customerId <", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridLessThanOrEqualTo(Long value) {
            addCriterion("customerId <=", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridIn(List<Long> values) {
            addCriterion("customerId in", values, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotIn(List<Long> values) {
            addCriterion("customerId not in", values, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridBetween(Long value1, Long value2) {
            addCriterion("customerId between", value1, value2, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotBetween(Long value1, Long value2) {
            addCriterion("customerId not between", value1, value2, "customerid");
            return (Criteria) this;
        }

        public Criteria andPaytypeIsNull() {
            addCriterion("payType is null");
            return (Criteria) this;
        }

        public Criteria andPaytypeIsNotNull() {
            addCriterion("payType is not null");
            return (Criteria) this;
        }

        public Criteria andPaytypeEqualTo(String value) {
            addCriterion("payType =", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeNotEqualTo(String value) {
            addCriterion("payType <>", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeGreaterThan(String value) {
            addCriterion("payType >", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeGreaterThanOrEqualTo(String value) {
            addCriterion("payType >=", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeLessThan(String value) {
            addCriterion("payType <", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeLessThanOrEqualTo(String value) {
            addCriterion("payType <=", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeLike(String value) {
            addCriterion("payType like", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeNotLike(String value) {
            addCriterion("payType not like", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeIn(List<String> values) {
            addCriterion("payType in", values, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeNotIn(List<String> values) {
            addCriterion("payType not in", values, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeBetween(String value1, String value2) {
            addCriterion("payType between", value1, value2, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeNotBetween(String value1, String value2) {
            addCriterion("payType not between", value1, value2, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaydateIsNull() {
            addCriterion("payDate is null");
            return (Criteria) this;
        }

        public Criteria andPaydateIsNotNull() {
            addCriterion("payDate is not null");
            return (Criteria) this;
        }

        public Criteria andPaydateEqualTo(Date value) {
            addCriterion("payDate =", value, "paydate");
            return (Criteria) this;
        }

        public Criteria andPaydateNotEqualTo(Date value) {
            addCriterion("payDate <>", value, "paydate");
            return (Criteria) this;
        }

        public Criteria andPaydateGreaterThan(Date value) {
            addCriterion("payDate >", value, "paydate");
            return (Criteria) this;
        }

        public Criteria andPaydateGreaterThanOrEqualTo(Date value) {
            addCriterion("payDate >=", value, "paydate");
            return (Criteria) this;
        }

        public Criteria andPaydateLessThan(Date value) {
            addCriterion("payDate <", value, "paydate");
            return (Criteria) this;
        }

        public Criteria andPaydateLessThanOrEqualTo(Date value) {
            addCriterion("payDate <=", value, "paydate");
            return (Criteria) this;
        }

        public Criteria andPaydateIn(List<Date> values) {
            addCriterion("payDate in", values, "paydate");
            return (Criteria) this;
        }

        public Criteria andPaydateNotIn(List<Date> values) {
            addCriterion("payDate not in", values, "paydate");
            return (Criteria) this;
        }

        public Criteria andPaydateBetween(Date value1, Date value2) {
            addCriterion("payDate between", value1, value2, "paydate");
            return (Criteria) this;
        }

        public Criteria andPaydateNotBetween(Date value1, Date value2) {
            addCriterion("payDate not between", value1, value2, "paydate");
            return (Criteria) this;
        }

        public Criteria andDeliverydateIsNull() {
            addCriterion("deliveryDate is null");
            return (Criteria) this;
        }

        public Criteria andDeliverydateIsNotNull() {
            addCriterion("deliveryDate is not null");
            return (Criteria) this;
        }

        public Criteria andDeliverydateEqualTo(Date value) {
            addCriterion("deliveryDate =", value, "deliverydate");
            return (Criteria) this;
        }

        public Criteria andDeliverydateNotEqualTo(Date value) {
            addCriterion("deliveryDate <>", value, "deliverydate");
            return (Criteria) this;
        }

        public Criteria andDeliverydateGreaterThan(Date value) {
            addCriterion("deliveryDate >", value, "deliverydate");
            return (Criteria) this;
        }

        public Criteria andDeliverydateGreaterThanOrEqualTo(Date value) {
            addCriterion("deliveryDate >=", value, "deliverydate");
            return (Criteria) this;
        }

        public Criteria andDeliverydateLessThan(Date value) {
            addCriterion("deliveryDate <", value, "deliverydate");
            return (Criteria) this;
        }

        public Criteria andDeliverydateLessThanOrEqualTo(Date value) {
            addCriterion("deliveryDate <=", value, "deliverydate");
            return (Criteria) this;
        }

        public Criteria andDeliverydateIn(List<Date> values) {
            addCriterion("deliveryDate in", values, "deliverydate");
            return (Criteria) this;
        }

        public Criteria andDeliverydateNotIn(List<Date> values) {
            addCriterion("deliveryDate not in", values, "deliverydate");
            return (Criteria) this;
        }

        public Criteria andDeliverydateBetween(Date value1, Date value2) {
            addCriterion("deliveryDate between", value1, value2, "deliverydate");
            return (Criteria) this;
        }

        public Criteria andDeliverydateNotBetween(Date value1, Date value2) {
            addCriterion("deliveryDate not between", value1, value2, "deliverydate");
            return (Criteria) this;
        }

        public Criteria andTaxIsNull() {
            addCriterion("tax is null");
            return (Criteria) this;
        }

        public Criteria andTaxIsNotNull() {
            addCriterion("tax is not null");
            return (Criteria) this;
        }

        public Criteria andTaxEqualTo(String value) {
            addCriterion("tax =", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxNotEqualTo(String value) {
            addCriterion("tax <>", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxGreaterThan(String value) {
            addCriterion("tax >", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxGreaterThanOrEqualTo(String value) {
            addCriterion("tax >=", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxLessThan(String value) {
            addCriterion("tax <", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxLessThanOrEqualTo(String value) {
            addCriterion("tax <=", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxLike(String value) {
            addCriterion("tax like", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxNotLike(String value) {
            addCriterion("tax not like", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxIn(List<String> values) {
            addCriterion("tax in", values, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxNotIn(List<String> values) {
            addCriterion("tax not in", values, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxBetween(String value1, String value2) {
            addCriterion("tax between", value1, value2, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxNotBetween(String value1, String value2) {
            addCriterion("tax not between", value1, value2, "tax");
            return (Criteria) this;
        }

        public Criteria andDepositnumIsNull() {
            addCriterion("depositNum is null");
            return (Criteria) this;
        }

        public Criteria andDepositnumIsNotNull() {
            addCriterion("depositNum is not null");
            return (Criteria) this;
        }

        public Criteria andDepositnumEqualTo(String value) {
            addCriterion("depositNum =", value, "depositnum");
            return (Criteria) this;
        }

        public Criteria andDepositnumNotEqualTo(String value) {
            addCriterion("depositNum <>", value, "depositnum");
            return (Criteria) this;
        }

        public Criteria andDepositnumGreaterThan(String value) {
            addCriterion("depositNum >", value, "depositnum");
            return (Criteria) this;
        }

        public Criteria andDepositnumGreaterThanOrEqualTo(String value) {
            addCriterion("depositNum >=", value, "depositnum");
            return (Criteria) this;
        }

        public Criteria andDepositnumLessThan(String value) {
            addCriterion("depositNum <", value, "depositnum");
            return (Criteria) this;
        }

        public Criteria andDepositnumLessThanOrEqualTo(String value) {
            addCriterion("depositNum <=", value, "depositnum");
            return (Criteria) this;
        }

        public Criteria andDepositnumLike(String value) {
            addCriterion("depositNum like", value, "depositnum");
            return (Criteria) this;
        }

        public Criteria andDepositnumNotLike(String value) {
            addCriterion("depositNum not like", value, "depositnum");
            return (Criteria) this;
        }

        public Criteria andDepositnumIn(List<String> values) {
            addCriterion("depositNum in", values, "depositnum");
            return (Criteria) this;
        }

        public Criteria andDepositnumNotIn(List<String> values) {
            addCriterion("depositNum not in", values, "depositnum");
            return (Criteria) this;
        }

        public Criteria andDepositnumBetween(String value1, String value2) {
            addCriterion("depositNum between", value1, value2, "depositnum");
            return (Criteria) this;
        }

        public Criteria andDepositnumNotBetween(String value1, String value2) {
            addCriterion("depositNum not between", value1, value2, "depositnum");
            return (Criteria) this;
        }

        public Criteria andDepositrateIsNull() {
            addCriterion("depositRate is null");
            return (Criteria) this;
        }

        public Criteria andDepositrateIsNotNull() {
            addCriterion("depositRate is not null");
            return (Criteria) this;
        }

        public Criteria andDepositrateEqualTo(String value) {
            addCriterion("depositRate =", value, "depositrate");
            return (Criteria) this;
        }

        public Criteria andDepositrateNotEqualTo(String value) {
            addCriterion("depositRate <>", value, "depositrate");
            return (Criteria) this;
        }

        public Criteria andDepositrateGreaterThan(String value) {
            addCriterion("depositRate >", value, "depositrate");
            return (Criteria) this;
        }

        public Criteria andDepositrateGreaterThanOrEqualTo(String value) {
            addCriterion("depositRate >=", value, "depositrate");
            return (Criteria) this;
        }

        public Criteria andDepositrateLessThan(String value) {
            addCriterion("depositRate <", value, "depositrate");
            return (Criteria) this;
        }

        public Criteria andDepositrateLessThanOrEqualTo(String value) {
            addCriterion("depositRate <=", value, "depositrate");
            return (Criteria) this;
        }

        public Criteria andDepositrateLike(String value) {
            addCriterion("depositRate like", value, "depositrate");
            return (Criteria) this;
        }

        public Criteria andDepositrateNotLike(String value) {
            addCriterion("depositRate not like", value, "depositrate");
            return (Criteria) this;
        }

        public Criteria andDepositrateIn(List<String> values) {
            addCriterion("depositRate in", values, "depositrate");
            return (Criteria) this;
        }

        public Criteria andDepositrateNotIn(List<String> values) {
            addCriterion("depositRate not in", values, "depositrate");
            return (Criteria) this;
        }

        public Criteria andDepositrateBetween(String value1, String value2) {
            addCriterion("depositRate between", value1, value2, "depositrate");
            return (Criteria) this;
        }

        public Criteria andDepositrateNotBetween(String value1, String value2) {
            addCriterion("depositRate not between", value1, value2, "depositrate");
            return (Criteria) this;
        }

        public Criteria andDepositIsNull() {
            addCriterion("deposit is null");
            return (Criteria) this;
        }

        public Criteria andDepositIsNotNull() {
            addCriterion("deposit is not null");
            return (Criteria) this;
        }

        public Criteria andDepositEqualTo(String value) {
            addCriterion("deposit =", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositNotEqualTo(String value) {
            addCriterion("deposit <>", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositGreaterThan(String value) {
            addCriterion("deposit >", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositGreaterThanOrEqualTo(String value) {
            addCriterion("deposit >=", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositLessThan(String value) {
            addCriterion("deposit <", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositLessThanOrEqualTo(String value) {
            addCriterion("deposit <=", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositLike(String value) {
            addCriterion("deposit like", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositNotLike(String value) {
            addCriterion("deposit not like", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositIn(List<String> values) {
            addCriterion("deposit in", values, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositNotIn(List<String> values) {
            addCriterion("deposit not in", values, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositBetween(String value1, String value2) {
            addCriterion("deposit between", value1, value2, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositNotBetween(String value1, String value2) {
            addCriterion("deposit not between", value1, value2, "deposit");
            return (Criteria) this;
        }

        public Criteria andRentalIsNull() {
            addCriterion("rental is null");
            return (Criteria) this;
        }

        public Criteria andRentalIsNotNull() {
            addCriterion("rental is not null");
            return (Criteria) this;
        }

        public Criteria andRentalEqualTo(String value) {
            addCriterion("rental =", value, "rental");
            return (Criteria) this;
        }

        public Criteria andRentalNotEqualTo(String value) {
            addCriterion("rental <>", value, "rental");
            return (Criteria) this;
        }

        public Criteria andRentalGreaterThan(String value) {
            addCriterion("rental >", value, "rental");
            return (Criteria) this;
        }

        public Criteria andRentalGreaterThanOrEqualTo(String value) {
            addCriterion("rental >=", value, "rental");
            return (Criteria) this;
        }

        public Criteria andRentalLessThan(String value) {
            addCriterion("rental <", value, "rental");
            return (Criteria) this;
        }

        public Criteria andRentalLessThanOrEqualTo(String value) {
            addCriterion("rental <=", value, "rental");
            return (Criteria) this;
        }

        public Criteria andRentalLike(String value) {
            addCriterion("rental like", value, "rental");
            return (Criteria) this;
        }

        public Criteria andRentalNotLike(String value) {
            addCriterion("rental not like", value, "rental");
            return (Criteria) this;
        }

        public Criteria andRentalIn(List<String> values) {
            addCriterion("rental in", values, "rental");
            return (Criteria) this;
        }

        public Criteria andRentalNotIn(List<String> values) {
            addCriterion("rental not in", values, "rental");
            return (Criteria) this;
        }

        public Criteria andRentalBetween(String value1, String value2) {
            addCriterion("rental between", value1, value2, "rental");
            return (Criteria) this;
        }

        public Criteria andRentalNotBetween(String value1, String value2) {
            addCriterion("rental not between", value1, value2, "rental");
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

        public Criteria andLogisticsIsNull() {
            addCriterion("logistics is null");
            return (Criteria) this;
        }

        public Criteria andLogisticsIsNotNull() {
            addCriterion("logistics is not null");
            return (Criteria) this;
        }

        public Criteria andLogisticsEqualTo(String value) {
            addCriterion("logistics =", value, "logistics");
            return (Criteria) this;
        }

        public Criteria andLogisticsNotEqualTo(String value) {
            addCriterion("logistics <>", value, "logistics");
            return (Criteria) this;
        }

        public Criteria andLogisticsGreaterThan(String value) {
            addCriterion("logistics >", value, "logistics");
            return (Criteria) this;
        }

        public Criteria andLogisticsGreaterThanOrEqualTo(String value) {
            addCriterion("logistics >=", value, "logistics");
            return (Criteria) this;
        }

        public Criteria andLogisticsLessThan(String value) {
            addCriterion("logistics <", value, "logistics");
            return (Criteria) this;
        }

        public Criteria andLogisticsLessThanOrEqualTo(String value) {
            addCriterion("logistics <=", value, "logistics");
            return (Criteria) this;
        }

        public Criteria andLogisticsLike(String value) {
            addCriterion("logistics like", value, "logistics");
            return (Criteria) this;
        }

        public Criteria andLogisticsNotLike(String value) {
            addCriterion("logistics not like", value, "logistics");
            return (Criteria) this;
        }

        public Criteria andLogisticsIn(List<String> values) {
            addCriterion("logistics in", values, "logistics");
            return (Criteria) this;
        }

        public Criteria andLogisticsNotIn(List<String> values) {
            addCriterion("logistics not in", values, "logistics");
            return (Criteria) this;
        }

        public Criteria andLogisticsBetween(String value1, String value2) {
            addCriterion("logistics between", value1, value2, "logistics");
            return (Criteria) this;
        }

        public Criteria andLogisticsNotBetween(String value1, String value2) {
            addCriterion("logistics not between", value1, value2, "logistics");
            return (Criteria) this;
        }

        public Criteria andLogisticsnumIsNull() {
            addCriterion("logisticsNum is null");
            return (Criteria) this;
        }

        public Criteria andLogisticsnumIsNotNull() {
            addCriterion("logisticsNum is not null");
            return (Criteria) this;
        }

        public Criteria andLogisticsnumEqualTo(String value) {
            addCriterion("logisticsNum =", value, "logisticsnum");
            return (Criteria) this;
        }

        public Criteria andLogisticsnumNotEqualTo(String value) {
            addCriterion("logisticsNum <>", value, "logisticsnum");
            return (Criteria) this;
        }

        public Criteria andLogisticsnumGreaterThan(String value) {
            addCriterion("logisticsNum >", value, "logisticsnum");
            return (Criteria) this;
        }

        public Criteria andLogisticsnumGreaterThanOrEqualTo(String value) {
            addCriterion("logisticsNum >=", value, "logisticsnum");
            return (Criteria) this;
        }

        public Criteria andLogisticsnumLessThan(String value) {
            addCriterion("logisticsNum <", value, "logisticsnum");
            return (Criteria) this;
        }

        public Criteria andLogisticsnumLessThanOrEqualTo(String value) {
            addCriterion("logisticsNum <=", value, "logisticsnum");
            return (Criteria) this;
        }

        public Criteria andLogisticsnumLike(String value) {
            addCriterion("logisticsNum like", value, "logisticsnum");
            return (Criteria) this;
        }

        public Criteria andLogisticsnumNotLike(String value) {
            addCriterion("logisticsNum not like", value, "logisticsnum");
            return (Criteria) this;
        }

        public Criteria andLogisticsnumIn(List<String> values) {
            addCriterion("logisticsNum in", values, "logisticsnum");
            return (Criteria) this;
        }

        public Criteria andLogisticsnumNotIn(List<String> values) {
            addCriterion("logisticsNum not in", values, "logisticsnum");
            return (Criteria) this;
        }

        public Criteria andLogisticsnumBetween(String value1, String value2) {
            addCriterion("logisticsNum between", value1, value2, "logisticsnum");
            return (Criteria) this;
        }

        public Criteria andLogisticsnumNotBetween(String value1, String value2) {
            addCriterion("logisticsNum not between", value1, value2, "logisticsnum");
            return (Criteria) this;
        }

        public Criteria andLogisticsremarkIsNull() {
            addCriterion("logisticsRemark is null");
            return (Criteria) this;
        }

        public Criteria andLogisticsremarkIsNotNull() {
            addCriterion("logisticsRemark is not null");
            return (Criteria) this;
        }

        public Criteria andLogisticsremarkEqualTo(String value) {
            addCriterion("logisticsRemark =", value, "logisticsremark");
            return (Criteria) this;
        }

        public Criteria andLogisticsremarkNotEqualTo(String value) {
            addCriterion("logisticsRemark <>", value, "logisticsremark");
            return (Criteria) this;
        }

        public Criteria andLogisticsremarkGreaterThan(String value) {
            addCriterion("logisticsRemark >", value, "logisticsremark");
            return (Criteria) this;
        }

        public Criteria andLogisticsremarkGreaterThanOrEqualTo(String value) {
            addCriterion("logisticsRemark >=", value, "logisticsremark");
            return (Criteria) this;
        }

        public Criteria andLogisticsremarkLessThan(String value) {
            addCriterion("logisticsRemark <", value, "logisticsremark");
            return (Criteria) this;
        }

        public Criteria andLogisticsremarkLessThanOrEqualTo(String value) {
            addCriterion("logisticsRemark <=", value, "logisticsremark");
            return (Criteria) this;
        }

        public Criteria andLogisticsremarkLike(String value) {
            addCriterion("logisticsRemark like", value, "logisticsremark");
            return (Criteria) this;
        }

        public Criteria andLogisticsremarkNotLike(String value) {
            addCriterion("logisticsRemark not like", value, "logisticsremark");
            return (Criteria) this;
        }

        public Criteria andLogisticsremarkIn(List<String> values) {
            addCriterion("logisticsRemark in", values, "logisticsremark");
            return (Criteria) this;
        }

        public Criteria andLogisticsremarkNotIn(List<String> values) {
            addCriterion("logisticsRemark not in", values, "logisticsremark");
            return (Criteria) this;
        }

        public Criteria andLogisticsremarkBetween(String value1, String value2) {
            addCriterion("logisticsRemark between", value1, value2, "logisticsremark");
            return (Criteria) this;
        }

        public Criteria andLogisticsremarkNotBetween(String value1, String value2) {
            addCriterion("logisticsRemark not between", value1, value2, "logisticsremark");
            return (Criteria) this;
        }

        public Criteria andDetectionIsNull() {
            addCriterion("detection is null");
            return (Criteria) this;
        }

        public Criteria andDetectionIsNotNull() {
            addCriterion("detection is not null");
            return (Criteria) this;
        }

        public Criteria andDetectionEqualTo(String value) {
            addCriterion("detection =", value, "detection");
            return (Criteria) this;
        }

        public Criteria andDetectionNotEqualTo(String value) {
            addCriterion("detection <>", value, "detection");
            return (Criteria) this;
        }

        public Criteria andDetectionGreaterThan(String value) {
            addCriterion("detection >", value, "detection");
            return (Criteria) this;
        }

        public Criteria andDetectionGreaterThanOrEqualTo(String value) {
            addCriterion("detection >=", value, "detection");
            return (Criteria) this;
        }

        public Criteria andDetectionLessThan(String value) {
            addCriterion("detection <", value, "detection");
            return (Criteria) this;
        }

        public Criteria andDetectionLessThanOrEqualTo(String value) {
            addCriterion("detection <=", value, "detection");
            return (Criteria) this;
        }

        public Criteria andDetectionLike(String value) {
            addCriterion("detection like", value, "detection");
            return (Criteria) this;
        }

        public Criteria andDetectionNotLike(String value) {
            addCriterion("detection not like", value, "detection");
            return (Criteria) this;
        }

        public Criteria andDetectionIn(List<String> values) {
            addCriterion("detection in", values, "detection");
            return (Criteria) this;
        }

        public Criteria andDetectionNotIn(List<String> values) {
            addCriterion("detection not in", values, "detection");
            return (Criteria) this;
        }

        public Criteria andDetectionBetween(String value1, String value2) {
            addCriterion("detection between", value1, value2, "detection");
            return (Criteria) this;
        }

        public Criteria andDetectionNotBetween(String value1, String value2) {
            addCriterion("detection not between", value1, value2, "detection");
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

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("`type` =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("`type` <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("`type` >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("`type` >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("`type` <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("`type` <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("`type` in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("`type` not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("`type` between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("`type` not between", value1, value2, "type");
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