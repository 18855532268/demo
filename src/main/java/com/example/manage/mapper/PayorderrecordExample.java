package com.example.manage.mapper;

import java.util.ArrayList;
import java.util.List;

public class PayorderrecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PayorderrecordExample() {
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

        public Criteria andProductidIsNull() {
            addCriterion("productId is null");
            return (Criteria) this;
        }

        public Criteria andProductidIsNotNull() {
            addCriterion("productId is not null");
            return (Criteria) this;
        }

        public Criteria andProductidEqualTo(Long value) {
            addCriterion("productId =", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotEqualTo(Long value) {
            addCriterion("productId <>", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidGreaterThan(Long value) {
            addCriterion("productId >", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidGreaterThanOrEqualTo(Long value) {
            addCriterion("productId >=", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidLessThan(Long value) {
            addCriterion("productId <", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidLessThanOrEqualTo(Long value) {
            addCriterion("productId <=", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidIn(List<Long> values) {
            addCriterion("productId in", values, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotIn(List<Long> values) {
            addCriterion("productId not in", values, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidBetween(Long value1, Long value2) {
            addCriterion("productId between", value1, value2, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotBetween(Long value1, Long value2) {
            addCriterion("productId not between", value1, value2, "productid");
            return (Criteria) this;
        }

        public Criteria andModelnoIsNull() {
            addCriterion("modelNo is null");
            return (Criteria) this;
        }

        public Criteria andModelnoIsNotNull() {
            addCriterion("modelNo is not null");
            return (Criteria) this;
        }

        public Criteria andModelnoEqualTo(String value) {
            addCriterion("modelNo =", value, "modelno");
            return (Criteria) this;
        }

        public Criteria andModelnoNotEqualTo(String value) {
            addCriterion("modelNo <>", value, "modelno");
            return (Criteria) this;
        }

        public Criteria andModelnoGreaterThan(String value) {
            addCriterion("modelNo >", value, "modelno");
            return (Criteria) this;
        }

        public Criteria andModelnoGreaterThanOrEqualTo(String value) {
            addCriterion("modelNo >=", value, "modelno");
            return (Criteria) this;
        }

        public Criteria andModelnoLessThan(String value) {
            addCriterion("modelNo <", value, "modelno");
            return (Criteria) this;
        }

        public Criteria andModelnoLessThanOrEqualTo(String value) {
            addCriterion("modelNo <=", value, "modelno");
            return (Criteria) this;
        }

        public Criteria andModelnoLike(String value) {
            addCriterion("modelNo like", value, "modelno");
            return (Criteria) this;
        }

        public Criteria andModelnoNotLike(String value) {
            addCriterion("modelNo not like", value, "modelno");
            return (Criteria) this;
        }

        public Criteria andModelnoIn(List<String> values) {
            addCriterion("modelNo in", values, "modelno");
            return (Criteria) this;
        }

        public Criteria andModelnoNotIn(List<String> values) {
            addCriterion("modelNo not in", values, "modelno");
            return (Criteria) this;
        }

        public Criteria andModelnoBetween(String value1, String value2) {
            addCriterion("modelNo between", value1, value2, "modelno");
            return (Criteria) this;
        }

        public Criteria andModelnoNotBetween(String value1, String value2) {
            addCriterion("modelNo not between", value1, value2, "modelno");
            return (Criteria) this;
        }

        public Criteria andUnitpriceIsNull() {
            addCriterion("unitPrice is null");
            return (Criteria) this;
        }

        public Criteria andUnitpriceIsNotNull() {
            addCriterion("unitPrice is not null");
            return (Criteria) this;
        }

        public Criteria andUnitpriceEqualTo(String value) {
            addCriterion("unitPrice =", value, "unitprice");
            return (Criteria) this;
        }

        public Criteria andUnitpriceNotEqualTo(String value) {
            addCriterion("unitPrice <>", value, "unitprice");
            return (Criteria) this;
        }

        public Criteria andUnitpriceGreaterThan(String value) {
            addCriterion("unitPrice >", value, "unitprice");
            return (Criteria) this;
        }

        public Criteria andUnitpriceGreaterThanOrEqualTo(String value) {
            addCriterion("unitPrice >=", value, "unitprice");
            return (Criteria) this;
        }

        public Criteria andUnitpriceLessThan(String value) {
            addCriterion("unitPrice <", value, "unitprice");
            return (Criteria) this;
        }

        public Criteria andUnitpriceLessThanOrEqualTo(String value) {
            addCriterion("unitPrice <=", value, "unitprice");
            return (Criteria) this;
        }

        public Criteria andUnitpriceLike(String value) {
            addCriterion("unitPrice like", value, "unitprice");
            return (Criteria) this;
        }

        public Criteria andUnitpriceNotLike(String value) {
            addCriterion("unitPrice not like", value, "unitprice");
            return (Criteria) this;
        }

        public Criteria andUnitpriceIn(List<String> values) {
            addCriterion("unitPrice in", values, "unitprice");
            return (Criteria) this;
        }

        public Criteria andUnitpriceNotIn(List<String> values) {
            addCriterion("unitPrice not in", values, "unitprice");
            return (Criteria) this;
        }

        public Criteria andUnitpriceBetween(String value1, String value2) {
            addCriterion("unitPrice between", value1, value2, "unitprice");
            return (Criteria) this;
        }

        public Criteria andUnitpriceNotBetween(String value1, String value2) {
            addCriterion("unitPrice not between", value1, value2, "unitprice");
            return (Criteria) this;
        }

        public Criteria andTaxpointIsNull() {
            addCriterion("taxPoint is null");
            return (Criteria) this;
        }

        public Criteria andTaxpointIsNotNull() {
            addCriterion("taxPoint is not null");
            return (Criteria) this;
        }

        public Criteria andTaxpointEqualTo(String value) {
            addCriterion("taxPoint =", value, "taxpoint");
            return (Criteria) this;
        }

        public Criteria andTaxpointNotEqualTo(String value) {
            addCriterion("taxPoint <>", value, "taxpoint");
            return (Criteria) this;
        }

        public Criteria andTaxpointGreaterThan(String value) {
            addCriterion("taxPoint >", value, "taxpoint");
            return (Criteria) this;
        }

        public Criteria andTaxpointGreaterThanOrEqualTo(String value) {
            addCriterion("taxPoint >=", value, "taxpoint");
            return (Criteria) this;
        }

        public Criteria andTaxpointLessThan(String value) {
            addCriterion("taxPoint <", value, "taxpoint");
            return (Criteria) this;
        }

        public Criteria andTaxpointLessThanOrEqualTo(String value) {
            addCriterion("taxPoint <=", value, "taxpoint");
            return (Criteria) this;
        }

        public Criteria andTaxpointLike(String value) {
            addCriterion("taxPoint like", value, "taxpoint");
            return (Criteria) this;
        }

        public Criteria andTaxpointNotLike(String value) {
            addCriterion("taxPoint not like", value, "taxpoint");
            return (Criteria) this;
        }

        public Criteria andTaxpointIn(List<String> values) {
            addCriterion("taxPoint in", values, "taxpoint");
            return (Criteria) this;
        }

        public Criteria andTaxpointNotIn(List<String> values) {
            addCriterion("taxPoint not in", values, "taxpoint");
            return (Criteria) this;
        }

        public Criteria andTaxpointBetween(String value1, String value2) {
            addCriterion("taxPoint between", value1, value2, "taxpoint");
            return (Criteria) this;
        }

        public Criteria andTaxpointNotBetween(String value1, String value2) {
            addCriterion("taxPoint not between", value1, value2, "taxpoint");
            return (Criteria) this;
        }

        public Criteria andCountIsNull() {
            addCriterion("`count` is null");
            return (Criteria) this;
        }

        public Criteria andCountIsNotNull() {
            addCriterion("`count` is not null");
            return (Criteria) this;
        }

        public Criteria andCountEqualTo(Integer value) {
            addCriterion("`count` =", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotEqualTo(Integer value) {
            addCriterion("`count` <>", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountGreaterThan(Integer value) {
            addCriterion("`count` >", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("`count` >=", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountLessThan(Integer value) {
            addCriterion("`count` <", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountLessThanOrEqualTo(Integer value) {
            addCriterion("`count` <=", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountIn(List<Integer> values) {
            addCriterion("`count` in", values, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotIn(List<Integer> values) {
            addCriterion("`count` not in", values, "count");
            return (Criteria) this;
        }

        public Criteria andCountBetween(Integer value1, Integer value2) {
            addCriterion("`count` between", value1, value2, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotBetween(Integer value1, Integer value2) {
            addCriterion("`count` not between", value1, value2, "count");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNull() {
            addCriterion("discount is null");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNotNull() {
            addCriterion("discount is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountEqualTo(String value) {
            addCriterion("discount =", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotEqualTo(String value) {
            addCriterion("discount <>", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThan(String value) {
            addCriterion("discount >", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThanOrEqualTo(String value) {
            addCriterion("discount >=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThan(String value) {
            addCriterion("discount <", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThanOrEqualTo(String value) {
            addCriterion("discount <=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLike(String value) {
            addCriterion("discount like", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotLike(String value) {
            addCriterion("discount not like", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountIn(List<String> values) {
            addCriterion("discount in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotIn(List<String> values) {
            addCriterion("discount not in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountBetween(String value1, String value2) {
            addCriterion("discount between", value1, value2, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotBetween(String value1, String value2) {
            addCriterion("discount not between", value1, value2, "discount");
            return (Criteria) this;
        }

        public Criteria andTaxsubtotalIsNull() {
            addCriterion("taxSubtotal is null");
            return (Criteria) this;
        }

        public Criteria andTaxsubtotalIsNotNull() {
            addCriterion("taxSubtotal is not null");
            return (Criteria) this;
        }

        public Criteria andTaxsubtotalEqualTo(String value) {
            addCriterion("taxSubtotal =", value, "taxsubtotal");
            return (Criteria) this;
        }

        public Criteria andTaxsubtotalNotEqualTo(String value) {
            addCriterion("taxSubtotal <>", value, "taxsubtotal");
            return (Criteria) this;
        }

        public Criteria andTaxsubtotalGreaterThan(String value) {
            addCriterion("taxSubtotal >", value, "taxsubtotal");
            return (Criteria) this;
        }

        public Criteria andTaxsubtotalGreaterThanOrEqualTo(String value) {
            addCriterion("taxSubtotal >=", value, "taxsubtotal");
            return (Criteria) this;
        }

        public Criteria andTaxsubtotalLessThan(String value) {
            addCriterion("taxSubtotal <", value, "taxsubtotal");
            return (Criteria) this;
        }

        public Criteria andTaxsubtotalLessThanOrEqualTo(String value) {
            addCriterion("taxSubtotal <=", value, "taxsubtotal");
            return (Criteria) this;
        }

        public Criteria andTaxsubtotalLike(String value) {
            addCriterion("taxSubtotal like", value, "taxsubtotal");
            return (Criteria) this;
        }

        public Criteria andTaxsubtotalNotLike(String value) {
            addCriterion("taxSubtotal not like", value, "taxsubtotal");
            return (Criteria) this;
        }

        public Criteria andTaxsubtotalIn(List<String> values) {
            addCriterion("taxSubtotal in", values, "taxsubtotal");
            return (Criteria) this;
        }

        public Criteria andTaxsubtotalNotIn(List<String> values) {
            addCriterion("taxSubtotal not in", values, "taxsubtotal");
            return (Criteria) this;
        }

        public Criteria andTaxsubtotalBetween(String value1, String value2) {
            addCriterion("taxSubtotal between", value1, value2, "taxsubtotal");
            return (Criteria) this;
        }

        public Criteria andTaxsubtotalNotBetween(String value1, String value2) {
            addCriterion("taxSubtotal not between", value1, value2, "taxsubtotal");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyIsNull() {
            addCriterion("totalMoney is null");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyIsNotNull() {
            addCriterion("totalMoney is not null");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyEqualTo(String value) {
            addCriterion("totalMoney =", value, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyNotEqualTo(String value) {
            addCriterion("totalMoney <>", value, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyGreaterThan(String value) {
            addCriterion("totalMoney >", value, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyGreaterThanOrEqualTo(String value) {
            addCriterion("totalMoney >=", value, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyLessThan(String value) {
            addCriterion("totalMoney <", value, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyLessThanOrEqualTo(String value) {
            addCriterion("totalMoney <=", value, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyLike(String value) {
            addCriterion("totalMoney like", value, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyNotLike(String value) {
            addCriterion("totalMoney not like", value, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyIn(List<String> values) {
            addCriterion("totalMoney in", values, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyNotIn(List<String> values) {
            addCriterion("totalMoney not in", values, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyBetween(String value1, String value2) {
            addCriterion("totalMoney between", value1, value2, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyNotBetween(String value1, String value2) {
            addCriterion("totalMoney not between", value1, value2, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andWeighttoleranceIsNull() {
            addCriterion("weightTolerance is null");
            return (Criteria) this;
        }

        public Criteria andWeighttoleranceIsNotNull() {
            addCriterion("weightTolerance is not null");
            return (Criteria) this;
        }

        public Criteria andWeighttoleranceEqualTo(String value) {
            addCriterion("weightTolerance =", value, "weighttolerance");
            return (Criteria) this;
        }

        public Criteria andWeighttoleranceNotEqualTo(String value) {
            addCriterion("weightTolerance <>", value, "weighttolerance");
            return (Criteria) this;
        }

        public Criteria andWeighttoleranceGreaterThan(String value) {
            addCriterion("weightTolerance >", value, "weighttolerance");
            return (Criteria) this;
        }

        public Criteria andWeighttoleranceGreaterThanOrEqualTo(String value) {
            addCriterion("weightTolerance >=", value, "weighttolerance");
            return (Criteria) this;
        }

        public Criteria andWeighttoleranceLessThan(String value) {
            addCriterion("weightTolerance <", value, "weighttolerance");
            return (Criteria) this;
        }

        public Criteria andWeighttoleranceLessThanOrEqualTo(String value) {
            addCriterion("weightTolerance <=", value, "weighttolerance");
            return (Criteria) this;
        }

        public Criteria andWeighttoleranceLike(String value) {
            addCriterion("weightTolerance like", value, "weighttolerance");
            return (Criteria) this;
        }

        public Criteria andWeighttoleranceNotLike(String value) {
            addCriterion("weightTolerance not like", value, "weighttolerance");
            return (Criteria) this;
        }

        public Criteria andWeighttoleranceIn(List<String> values) {
            addCriterion("weightTolerance in", values, "weighttolerance");
            return (Criteria) this;
        }

        public Criteria andWeighttoleranceNotIn(List<String> values) {
            addCriterion("weightTolerance not in", values, "weighttolerance");
            return (Criteria) this;
        }

        public Criteria andWeighttoleranceBetween(String value1, String value2) {
            addCriterion("weightTolerance between", value1, value2, "weighttolerance");
            return (Criteria) this;
        }

        public Criteria andWeighttoleranceNotBetween(String value1, String value2) {
            addCriterion("weightTolerance not between", value1, value2, "weighttolerance");
            return (Criteria) this;
        }

        public Criteria andChangecolorIsNull() {
            addCriterion("changeColor is null");
            return (Criteria) this;
        }

        public Criteria andChangecolorIsNotNull() {
            addCriterion("changeColor is not null");
            return (Criteria) this;
        }

        public Criteria andChangecolorEqualTo(String value) {
            addCriterion("changeColor =", value, "changecolor");
            return (Criteria) this;
        }

        public Criteria andChangecolorNotEqualTo(String value) {
            addCriterion("changeColor <>", value, "changecolor");
            return (Criteria) this;
        }

        public Criteria andChangecolorGreaterThan(String value) {
            addCriterion("changeColor >", value, "changecolor");
            return (Criteria) this;
        }

        public Criteria andChangecolorGreaterThanOrEqualTo(String value) {
            addCriterion("changeColor >=", value, "changecolor");
            return (Criteria) this;
        }

        public Criteria andChangecolorLessThan(String value) {
            addCriterion("changeColor <", value, "changecolor");
            return (Criteria) this;
        }

        public Criteria andChangecolorLessThanOrEqualTo(String value) {
            addCriterion("changeColor <=", value, "changecolor");
            return (Criteria) this;
        }

        public Criteria andChangecolorLike(String value) {
            addCriterion("changeColor like", value, "changecolor");
            return (Criteria) this;
        }

        public Criteria andChangecolorNotLike(String value) {
            addCriterion("changeColor not like", value, "changecolor");
            return (Criteria) this;
        }

        public Criteria andChangecolorIn(List<String> values) {
            addCriterion("changeColor in", values, "changecolor");
            return (Criteria) this;
        }

        public Criteria andChangecolorNotIn(List<String> values) {
            addCriterion("changeColor not in", values, "changecolor");
            return (Criteria) this;
        }

        public Criteria andChangecolorBetween(String value1, String value2) {
            addCriterion("changeColor between", value1, value2, "changecolor");
            return (Criteria) this;
        }

        public Criteria andChangecolorNotBetween(String value1, String value2) {
            addCriterion("changeColor not between", value1, value2, "changecolor");
            return (Criteria) this;
        }

        public Criteria andLarghezzaIsNull() {
            addCriterion("larghezza is null");
            return (Criteria) this;
        }

        public Criteria andLarghezzaIsNotNull() {
            addCriterion("larghezza is not null");
            return (Criteria) this;
        }

        public Criteria andLarghezzaEqualTo(String value) {
            addCriterion("larghezza =", value, "larghezza");
            return (Criteria) this;
        }

        public Criteria andLarghezzaNotEqualTo(String value) {
            addCriterion("larghezza <>", value, "larghezza");
            return (Criteria) this;
        }

        public Criteria andLarghezzaGreaterThan(String value) {
            addCriterion("larghezza >", value, "larghezza");
            return (Criteria) this;
        }

        public Criteria andLarghezzaGreaterThanOrEqualTo(String value) {
            addCriterion("larghezza >=", value, "larghezza");
            return (Criteria) this;
        }

        public Criteria andLarghezzaLessThan(String value) {
            addCriterion("larghezza <", value, "larghezza");
            return (Criteria) this;
        }

        public Criteria andLarghezzaLessThanOrEqualTo(String value) {
            addCriterion("larghezza <=", value, "larghezza");
            return (Criteria) this;
        }

        public Criteria andLarghezzaLike(String value) {
            addCriterion("larghezza like", value, "larghezza");
            return (Criteria) this;
        }

        public Criteria andLarghezzaNotLike(String value) {
            addCriterion("larghezza not like", value, "larghezza");
            return (Criteria) this;
        }

        public Criteria andLarghezzaIn(List<String> values) {
            addCriterion("larghezza in", values, "larghezza");
            return (Criteria) this;
        }

        public Criteria andLarghezzaNotIn(List<String> values) {
            addCriterion("larghezza not in", values, "larghezza");
            return (Criteria) this;
        }

        public Criteria andLarghezzaBetween(String value1, String value2) {
            addCriterion("larghezza between", value1, value2, "larghezza");
            return (Criteria) this;
        }

        public Criteria andLarghezzaNotBetween(String value1, String value2) {
            addCriterion("larghezza not between", value1, value2, "larghezza");
            return (Criteria) this;
        }

        public Criteria andWeightIsNull() {
            addCriterion("weight is null");
            return (Criteria) this;
        }

        public Criteria andWeightIsNotNull() {
            addCriterion("weight is not null");
            return (Criteria) this;
        }

        public Criteria andWeightEqualTo(String value) {
            addCriterion("weight =", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotEqualTo(String value) {
            addCriterion("weight <>", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThan(String value) {
            addCriterion("weight >", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThanOrEqualTo(String value) {
            addCriterion("weight >=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThan(String value) {
            addCriterion("weight <", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThanOrEqualTo(String value) {
            addCriterion("weight <=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLike(String value) {
            addCriterion("weight like", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotLike(String value) {
            addCriterion("weight not like", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightIn(List<String> values) {
            addCriterion("weight in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotIn(List<String> values) {
            addCriterion("weight not in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightBetween(String value1, String value2) {
            addCriterion("weight between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotBetween(String value1, String value2) {
            addCriterion("weight not between", value1, value2, "weight");
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