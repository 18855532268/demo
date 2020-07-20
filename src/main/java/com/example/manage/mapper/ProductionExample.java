package com.example.manage.mapper;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductionExample() {
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

        public Criteria andCargotypeidIsNull() {
            addCriterion("cargoTypeId is null");
            return (Criteria) this;
        }

        public Criteria andCargotypeidIsNotNull() {
            addCriterion("cargoTypeId is not null");
            return (Criteria) this;
        }

        public Criteria andCargotypeidEqualTo(Long value) {
            addCriterion("cargoTypeId =", value, "cargotypeid");
            return (Criteria) this;
        }

        public Criteria andCargotypeidNotEqualTo(Long value) {
            addCriterion("cargoTypeId <>", value, "cargotypeid");
            return (Criteria) this;
        }

        public Criteria andCargotypeidGreaterThan(Long value) {
            addCriterion("cargoTypeId >", value, "cargotypeid");
            return (Criteria) this;
        }

        public Criteria andCargotypeidGreaterThanOrEqualTo(Long value) {
            addCriterion("cargoTypeId >=", value, "cargotypeid");
            return (Criteria) this;
        }

        public Criteria andCargotypeidLessThan(Long value) {
            addCriterion("cargoTypeId <", value, "cargotypeid");
            return (Criteria) this;
        }

        public Criteria andCargotypeidLessThanOrEqualTo(Long value) {
            addCriterion("cargoTypeId <=", value, "cargotypeid");
            return (Criteria) this;
        }

        public Criteria andCargotypeidIn(List<Long> values) {
            addCriterion("cargoTypeId in", values, "cargotypeid");
            return (Criteria) this;
        }

        public Criteria andCargotypeidNotIn(List<Long> values) {
            addCriterion("cargoTypeId not in", values, "cargotypeid");
            return (Criteria) this;
        }

        public Criteria andCargotypeidBetween(Long value1, Long value2) {
            addCriterion("cargoTypeId between", value1, value2, "cargotypeid");
            return (Criteria) this;
        }

        public Criteria andCargotypeidNotBetween(Long value1, Long value2) {
            addCriterion("cargoTypeId not between", value1, value2, "cargotypeid");
            return (Criteria) this;
        }

        public Criteria andProductiontypeidIsNull() {
            addCriterion("productionTypeId is null");
            return (Criteria) this;
        }

        public Criteria andProductiontypeidIsNotNull() {
            addCriterion("productionTypeId is not null");
            return (Criteria) this;
        }

        public Criteria andProductiontypeidEqualTo(Long value) {
            addCriterion("productionTypeId =", value, "productiontypeid");
            return (Criteria) this;
        }

        public Criteria andProductiontypeidNotEqualTo(Long value) {
            addCriterion("productionTypeId <>", value, "productiontypeid");
            return (Criteria) this;
        }

        public Criteria andProductiontypeidGreaterThan(Long value) {
            addCriterion("productionTypeId >", value, "productiontypeid");
            return (Criteria) this;
        }

        public Criteria andProductiontypeidGreaterThanOrEqualTo(Long value) {
            addCriterion("productionTypeId >=", value, "productiontypeid");
            return (Criteria) this;
        }

        public Criteria andProductiontypeidLessThan(Long value) {
            addCriterion("productionTypeId <", value, "productiontypeid");
            return (Criteria) this;
        }

        public Criteria andProductiontypeidLessThanOrEqualTo(Long value) {
            addCriterion("productionTypeId <=", value, "productiontypeid");
            return (Criteria) this;
        }

        public Criteria andProductiontypeidIn(List<Long> values) {
            addCriterion("productionTypeId in", values, "productiontypeid");
            return (Criteria) this;
        }

        public Criteria andProductiontypeidNotIn(List<Long> values) {
            addCriterion("productionTypeId not in", values, "productiontypeid");
            return (Criteria) this;
        }

        public Criteria andProductiontypeidBetween(Long value1, Long value2) {
            addCriterion("productionTypeId between", value1, value2, "productiontypeid");
            return (Criteria) this;
        }

        public Criteria andProductiontypeidNotBetween(Long value1, Long value2) {
            addCriterion("productionTypeId not between", value1, value2, "productiontypeid");
            return (Criteria) this;
        }

        public Criteria andFlowidIsNull() {
            addCriterion("flowId is null");
            return (Criteria) this;
        }

        public Criteria andFlowidIsNotNull() {
            addCriterion("flowId is not null");
            return (Criteria) this;
        }

        public Criteria andFlowidEqualTo(Long value) {
            addCriterion("flowId =", value, "flowid");
            return (Criteria) this;
        }

        public Criteria andFlowidNotEqualTo(Long value) {
            addCriterion("flowId <>", value, "flowid");
            return (Criteria) this;
        }

        public Criteria andFlowidGreaterThan(Long value) {
            addCriterion("flowId >", value, "flowid");
            return (Criteria) this;
        }

        public Criteria andFlowidGreaterThanOrEqualTo(Long value) {
            addCriterion("flowId >=", value, "flowid");
            return (Criteria) this;
        }

        public Criteria andFlowidLessThan(Long value) {
            addCriterion("flowId <", value, "flowid");
            return (Criteria) this;
        }

        public Criteria andFlowidLessThanOrEqualTo(Long value) {
            addCriterion("flowId <=", value, "flowid");
            return (Criteria) this;
        }

        public Criteria andFlowidIn(List<Long> values) {
            addCriterion("flowId in", values, "flowid");
            return (Criteria) this;
        }

        public Criteria andFlowidNotIn(List<Long> values) {
            addCriterion("flowId not in", values, "flowid");
            return (Criteria) this;
        }

        public Criteria andFlowidBetween(Long value1, Long value2) {
            addCriterion("flowId between", value1, value2, "flowid");
            return (Criteria) this;
        }

        public Criteria andFlowidNotBetween(Long value1, Long value2) {
            addCriterion("flowId not between", value1, value2, "flowid");
            return (Criteria) this;
        }

        public Criteria andFactoryidIsNull() {
            addCriterion("factoryId is null");
            return (Criteria) this;
        }

        public Criteria andFactoryidIsNotNull() {
            addCriterion("factoryId is not null");
            return (Criteria) this;
        }

        public Criteria andFactoryidEqualTo(Long value) {
            addCriterion("factoryId =", value, "factoryid");
            return (Criteria) this;
        }

        public Criteria andFactoryidNotEqualTo(Long value) {
            addCriterion("factoryId <>", value, "factoryid");
            return (Criteria) this;
        }

        public Criteria andFactoryidGreaterThan(Long value) {
            addCriterion("factoryId >", value, "factoryid");
            return (Criteria) this;
        }

        public Criteria andFactoryidGreaterThanOrEqualTo(Long value) {
            addCriterion("factoryId >=", value, "factoryid");
            return (Criteria) this;
        }

        public Criteria andFactoryidLessThan(Long value) {
            addCriterion("factoryId <", value, "factoryid");
            return (Criteria) this;
        }

        public Criteria andFactoryidLessThanOrEqualTo(Long value) {
            addCriterion("factoryId <=", value, "factoryid");
            return (Criteria) this;
        }

        public Criteria andFactoryidIn(List<Long> values) {
            addCriterion("factoryId in", values, "factoryid");
            return (Criteria) this;
        }

        public Criteria andFactoryidNotIn(List<Long> values) {
            addCriterion("factoryId not in", values, "factoryid");
            return (Criteria) this;
        }

        public Criteria andFactoryidBetween(Long value1, Long value2) {
            addCriterion("factoryId between", value1, value2, "factoryid");
            return (Criteria) this;
        }

        public Criteria andFactoryidNotBetween(Long value1, Long value2) {
            addCriterion("factoryId not between", value1, value2, "factoryid");
            return (Criteria) this;
        }

        public Criteria andProductionmanageidIsNull() {
            addCriterion("productionManageId is null");
            return (Criteria) this;
        }

        public Criteria andProductionmanageidIsNotNull() {
            addCriterion("productionManageId is not null");
            return (Criteria) this;
        }

        public Criteria andProductionmanageidEqualTo(Long value) {
            addCriterion("productionManageId =", value, "productionmanageid");
            return (Criteria) this;
        }

        public Criteria andProductionmanageidNotEqualTo(Long value) {
            addCriterion("productionManageId <>", value, "productionmanageid");
            return (Criteria) this;
        }

        public Criteria andProductionmanageidGreaterThan(Long value) {
            addCriterion("productionManageId >", value, "productionmanageid");
            return (Criteria) this;
        }

        public Criteria andProductionmanageidGreaterThanOrEqualTo(Long value) {
            addCriterion("productionManageId >=", value, "productionmanageid");
            return (Criteria) this;
        }

        public Criteria andProductionmanageidLessThan(Long value) {
            addCriterion("productionManageId <", value, "productionmanageid");
            return (Criteria) this;
        }

        public Criteria andProductionmanageidLessThanOrEqualTo(Long value) {
            addCriterion("productionManageId <=", value, "productionmanageid");
            return (Criteria) this;
        }

        public Criteria andProductionmanageidIn(List<Long> values) {
            addCriterion("productionManageId in", values, "productionmanageid");
            return (Criteria) this;
        }

        public Criteria andProductionmanageidNotIn(List<Long> values) {
            addCriterion("productionManageId not in", values, "productionmanageid");
            return (Criteria) this;
        }

        public Criteria andProductionmanageidBetween(Long value1, Long value2) {
            addCriterion("productionManageId between", value1, value2, "productionmanageid");
            return (Criteria) this;
        }

        public Criteria andProductionmanageidNotBetween(Long value1, Long value2) {
            addCriterion("productionManageId not between", value1, value2, "productionmanageid");
            return (Criteria) this;
        }

        public Criteria andEnterstoremanageidIsNull() {
            addCriterion("enterStoreManageId is null");
            return (Criteria) this;
        }

        public Criteria andEnterstoremanageidIsNotNull() {
            addCriterion("enterStoreManageId is not null");
            return (Criteria) this;
        }

        public Criteria andEnterstoremanageidEqualTo(Long value) {
            addCriterion("enterStoreManageId =", value, "enterstoremanageid");
            return (Criteria) this;
        }

        public Criteria andEnterstoremanageidNotEqualTo(Long value) {
            addCriterion("enterStoreManageId <>", value, "enterstoremanageid");
            return (Criteria) this;
        }

        public Criteria andEnterstoremanageidGreaterThan(Long value) {
            addCriterion("enterStoreManageId >", value, "enterstoremanageid");
            return (Criteria) this;
        }

        public Criteria andEnterstoremanageidGreaterThanOrEqualTo(Long value) {
            addCriterion("enterStoreManageId >=", value, "enterstoremanageid");
            return (Criteria) this;
        }

        public Criteria andEnterstoremanageidLessThan(Long value) {
            addCriterion("enterStoreManageId <", value, "enterstoremanageid");
            return (Criteria) this;
        }

        public Criteria andEnterstoremanageidLessThanOrEqualTo(Long value) {
            addCriterion("enterStoreManageId <=", value, "enterstoremanageid");
            return (Criteria) this;
        }

        public Criteria andEnterstoremanageidIn(List<Long> values) {
            addCriterion("enterStoreManageId in", values, "enterstoremanageid");
            return (Criteria) this;
        }

        public Criteria andEnterstoremanageidNotIn(List<Long> values) {
            addCriterion("enterStoreManageId not in", values, "enterstoremanageid");
            return (Criteria) this;
        }

        public Criteria andEnterstoremanageidBetween(Long value1, Long value2) {
            addCriterion("enterStoreManageId between", value1, value2, "enterstoremanageid");
            return (Criteria) this;
        }

        public Criteria andEnterstoremanageidNotBetween(Long value1, Long value2) {
            addCriterion("enterStoreManageId not between", value1, value2, "enterstoremanageid");
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

        public Criteria andPronumIsNull() {
            addCriterion("proNum is null");
            return (Criteria) this;
        }

        public Criteria andPronumIsNotNull() {
            addCriterion("proNum is not null");
            return (Criteria) this;
        }

        public Criteria andPronumEqualTo(Integer value) {
            addCriterion("proNum =", value, "pronum");
            return (Criteria) this;
        }

        public Criteria andPronumNotEqualTo(Integer value) {
            addCriterion("proNum <>", value, "pronum");
            return (Criteria) this;
        }

        public Criteria andPronumGreaterThan(Integer value) {
            addCriterion("proNum >", value, "pronum");
            return (Criteria) this;
        }

        public Criteria andPronumGreaterThanOrEqualTo(Integer value) {
            addCriterion("proNum >=", value, "pronum");
            return (Criteria) this;
        }

        public Criteria andPronumLessThan(Integer value) {
            addCriterion("proNum <", value, "pronum");
            return (Criteria) this;
        }

        public Criteria andPronumLessThanOrEqualTo(Integer value) {
            addCriterion("proNum <=", value, "pronum");
            return (Criteria) this;
        }

        public Criteria andPronumIn(List<Integer> values) {
            addCriterion("proNum in", values, "pronum");
            return (Criteria) this;
        }

        public Criteria andPronumNotIn(List<Integer> values) {
            addCriterion("proNum not in", values, "pronum");
            return (Criteria) this;
        }

        public Criteria andPronumBetween(Integer value1, Integer value2) {
            addCriterion("proNum between", value1, value2, "pronum");
            return (Criteria) this;
        }

        public Criteria andPronumNotBetween(Integer value1, Integer value2) {
            addCriterion("proNum not between", value1, value2, "pronum");
            return (Criteria) this;
        }

        public Criteria andProdeliverydateIsNull() {
            addCriterion("proDeliveryDate is null");
            return (Criteria) this;
        }

        public Criteria andProdeliverydateIsNotNull() {
            addCriterion("proDeliveryDate is not null");
            return (Criteria) this;
        }

        public Criteria andProdeliverydateEqualTo(Date value) {
            addCriterion("proDeliveryDate =", value, "prodeliverydate");
            return (Criteria) this;
        }

        public Criteria andProdeliverydateNotEqualTo(Date value) {
            addCriterion("proDeliveryDate <>", value, "prodeliverydate");
            return (Criteria) this;
        }

        public Criteria andProdeliverydateGreaterThan(Date value) {
            addCriterion("proDeliveryDate >", value, "prodeliverydate");
            return (Criteria) this;
        }

        public Criteria andProdeliverydateGreaterThanOrEqualTo(Date value) {
            addCriterion("proDeliveryDate >=", value, "prodeliverydate");
            return (Criteria) this;
        }

        public Criteria andProdeliverydateLessThan(Date value) {
            addCriterion("proDeliveryDate <", value, "prodeliverydate");
            return (Criteria) this;
        }

        public Criteria andProdeliverydateLessThanOrEqualTo(Date value) {
            addCriterion("proDeliveryDate <=", value, "prodeliverydate");
            return (Criteria) this;
        }

        public Criteria andProdeliverydateIn(List<Date> values) {
            addCriterion("proDeliveryDate in", values, "prodeliverydate");
            return (Criteria) this;
        }

        public Criteria andProdeliverydateNotIn(List<Date> values) {
            addCriterion("proDeliveryDate not in", values, "prodeliverydate");
            return (Criteria) this;
        }

        public Criteria andProdeliverydateBetween(Date value1, Date value2) {
            addCriterion("proDeliveryDate between", value1, value2, "prodeliverydate");
            return (Criteria) this;
        }

        public Criteria andProdeliverydateNotBetween(Date value1, Date value2) {
            addCriterion("proDeliveryDate not between", value1, value2, "prodeliverydate");
            return (Criteria) this;
        }

        public Criteria andStatecovIsNull() {
            addCriterion("stateCov is null");
            return (Criteria) this;
        }

        public Criteria andStatecovIsNotNull() {
            addCriterion("stateCov is not null");
            return (Criteria) this;
        }

        public Criteria andStatecovEqualTo(String value) {
            addCriterion("stateCov =", value, "statecov");
            return (Criteria) this;
        }

        public Criteria andStatecovNotEqualTo(String value) {
            addCriterion("stateCov <>", value, "statecov");
            return (Criteria) this;
        }

        public Criteria andStatecovGreaterThan(String value) {
            addCriterion("stateCov >", value, "statecov");
            return (Criteria) this;
        }

        public Criteria andStatecovGreaterThanOrEqualTo(String value) {
            addCriterion("stateCov >=", value, "statecov");
            return (Criteria) this;
        }

        public Criteria andStatecovLessThan(String value) {
            addCriterion("stateCov <", value, "statecov");
            return (Criteria) this;
        }

        public Criteria andStatecovLessThanOrEqualTo(String value) {
            addCriterion("stateCov <=", value, "statecov");
            return (Criteria) this;
        }

        public Criteria andStatecovLike(String value) {
            addCriterion("stateCov like", value, "statecov");
            return (Criteria) this;
        }

        public Criteria andStatecovNotLike(String value) {
            addCriterion("stateCov not like", value, "statecov");
            return (Criteria) this;
        }

        public Criteria andStatecovIn(List<String> values) {
            addCriterion("stateCov in", values, "statecov");
            return (Criteria) this;
        }

        public Criteria andStatecovNotIn(List<String> values) {
            addCriterion("stateCov not in", values, "statecov");
            return (Criteria) this;
        }

        public Criteria andStatecovBetween(String value1, String value2) {
            addCriterion("stateCov between", value1, value2, "statecov");
            return (Criteria) this;
        }

        public Criteria andStatecovNotBetween(String value1, String value2) {
            addCriterion("stateCov not between", value1, value2, "statecov");
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

        public Criteria andLossrateIsNull() {
            addCriterion("lossRate is null");
            return (Criteria) this;
        }

        public Criteria andLossrateIsNotNull() {
            addCriterion("lossRate is not null");
            return (Criteria) this;
        }

        public Criteria andLossrateEqualTo(String value) {
            addCriterion("lossRate =", value, "lossrate");
            return (Criteria) this;
        }

        public Criteria andLossrateNotEqualTo(String value) {
            addCriterion("lossRate <>", value, "lossrate");
            return (Criteria) this;
        }

        public Criteria andLossrateGreaterThan(String value) {
            addCriterion("lossRate >", value, "lossrate");
            return (Criteria) this;
        }

        public Criteria andLossrateGreaterThanOrEqualTo(String value) {
            addCriterion("lossRate >=", value, "lossrate");
            return (Criteria) this;
        }

        public Criteria andLossrateLessThan(String value) {
            addCriterion("lossRate <", value, "lossrate");
            return (Criteria) this;
        }

        public Criteria andLossrateLessThanOrEqualTo(String value) {
            addCriterion("lossRate <=", value, "lossrate");
            return (Criteria) this;
        }

        public Criteria andLossrateLike(String value) {
            addCriterion("lossRate like", value, "lossrate");
            return (Criteria) this;
        }

        public Criteria andLossrateNotLike(String value) {
            addCriterion("lossRate not like", value, "lossrate");
            return (Criteria) this;
        }

        public Criteria andLossrateIn(List<String> values) {
            addCriterion("lossRate in", values, "lossrate");
            return (Criteria) this;
        }

        public Criteria andLossrateNotIn(List<String> values) {
            addCriterion("lossRate not in", values, "lossrate");
            return (Criteria) this;
        }

        public Criteria andLossrateBetween(String value1, String value2) {
            addCriterion("lossRate between", value1, value2, "lossrate");
            return (Criteria) this;
        }

        public Criteria andLossrateNotBetween(String value1, String value2) {
            addCriterion("lossRate not between", value1, value2, "lossrate");
            return (Criteria) this;
        }

        public Criteria andColorIsNull() {
            addCriterion("color is null");
            return (Criteria) this;
        }

        public Criteria andColorIsNotNull() {
            addCriterion("color is not null");
            return (Criteria) this;
        }

        public Criteria andColorEqualTo(String value) {
            addCriterion("color =", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotEqualTo(String value) {
            addCriterion("color <>", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorGreaterThan(String value) {
            addCriterion("color >", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorGreaterThanOrEqualTo(String value) {
            addCriterion("color >=", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLessThan(String value) {
            addCriterion("color <", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLessThanOrEqualTo(String value) {
            addCriterion("color <=", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLike(String value) {
            addCriterion("color like", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotLike(String value) {
            addCriterion("color not like", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorIn(List<String> values) {
            addCriterion("color in", values, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotIn(List<String> values) {
            addCriterion("color not in", values, "color");
            return (Criteria) this;
        }

        public Criteria andColorBetween(String value1, String value2) {
            addCriterion("color between", value1, value2, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotBetween(String value1, String value2) {
            addCriterion("color not between", value1, value2, "color");
            return (Criteria) this;
        }

        public Criteria andIsbatchchargeIsNull() {
            addCriterion("isBatchCharge is null");
            return (Criteria) this;
        }

        public Criteria andIsbatchchargeIsNotNull() {
            addCriterion("isBatchCharge is not null");
            return (Criteria) this;
        }

        public Criteria andIsbatchchargeEqualTo(String value) {
            addCriterion("isBatchCharge =", value, "isbatchcharge");
            return (Criteria) this;
        }

        public Criteria andIsbatchchargeNotEqualTo(String value) {
            addCriterion("isBatchCharge <>", value, "isbatchcharge");
            return (Criteria) this;
        }

        public Criteria andIsbatchchargeGreaterThan(String value) {
            addCriterion("isBatchCharge >", value, "isbatchcharge");
            return (Criteria) this;
        }

        public Criteria andIsbatchchargeGreaterThanOrEqualTo(String value) {
            addCriterion("isBatchCharge >=", value, "isbatchcharge");
            return (Criteria) this;
        }

        public Criteria andIsbatchchargeLessThan(String value) {
            addCriterion("isBatchCharge <", value, "isbatchcharge");
            return (Criteria) this;
        }

        public Criteria andIsbatchchargeLessThanOrEqualTo(String value) {
            addCriterion("isBatchCharge <=", value, "isbatchcharge");
            return (Criteria) this;
        }

        public Criteria andIsbatchchargeLike(String value) {
            addCriterion("isBatchCharge like", value, "isbatchcharge");
            return (Criteria) this;
        }

        public Criteria andIsbatchchargeNotLike(String value) {
            addCriterion("isBatchCharge not like", value, "isbatchcharge");
            return (Criteria) this;
        }

        public Criteria andIsbatchchargeIn(List<String> values) {
            addCriterion("isBatchCharge in", values, "isbatchcharge");
            return (Criteria) this;
        }

        public Criteria andIsbatchchargeNotIn(List<String> values) {
            addCriterion("isBatchCharge not in", values, "isbatchcharge");
            return (Criteria) this;
        }

        public Criteria andIsbatchchargeBetween(String value1, String value2) {
            addCriterion("isBatchCharge between", value1, value2, "isbatchcharge");
            return (Criteria) this;
        }

        public Criteria andIsbatchchargeNotBetween(String value1, String value2) {
            addCriterion("isBatchCharge not between", value1, value2, "isbatchcharge");
            return (Criteria) this;
        }

        public Criteria andAnnouncementsIsNull() {
            addCriterion("announcements is null");
            return (Criteria) this;
        }

        public Criteria andAnnouncementsIsNotNull() {
            addCriterion("announcements is not null");
            return (Criteria) this;
        }

        public Criteria andAnnouncementsEqualTo(String value) {
            addCriterion("announcements =", value, "announcements");
            return (Criteria) this;
        }

        public Criteria andAnnouncementsNotEqualTo(String value) {
            addCriterion("announcements <>", value, "announcements");
            return (Criteria) this;
        }

        public Criteria andAnnouncementsGreaterThan(String value) {
            addCriterion("announcements >", value, "announcements");
            return (Criteria) this;
        }

        public Criteria andAnnouncementsGreaterThanOrEqualTo(String value) {
            addCriterion("announcements >=", value, "announcements");
            return (Criteria) this;
        }

        public Criteria andAnnouncementsLessThan(String value) {
            addCriterion("announcements <", value, "announcements");
            return (Criteria) this;
        }

        public Criteria andAnnouncementsLessThanOrEqualTo(String value) {
            addCriterion("announcements <=", value, "announcements");
            return (Criteria) this;
        }

        public Criteria andAnnouncementsLike(String value) {
            addCriterion("announcements like", value, "announcements");
            return (Criteria) this;
        }

        public Criteria andAnnouncementsNotLike(String value) {
            addCriterion("announcements not like", value, "announcements");
            return (Criteria) this;
        }

        public Criteria andAnnouncementsIn(List<String> values) {
            addCriterion("announcements in", values, "announcements");
            return (Criteria) this;
        }

        public Criteria andAnnouncementsNotIn(List<String> values) {
            addCriterion("announcements not in", values, "announcements");
            return (Criteria) this;
        }

        public Criteria andAnnouncementsBetween(String value1, String value2) {
            addCriterion("announcements between", value1, value2, "announcements");
            return (Criteria) this;
        }

        public Criteria andAnnouncementsNotBetween(String value1, String value2) {
            addCriterion("announcements not between", value1, value2, "announcements");
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

        public Criteria andGraynumIsNull() {
            addCriterion("grayNum is null");
            return (Criteria) this;
        }

        public Criteria andGraynumIsNotNull() {
            addCriterion("grayNum is not null");
            return (Criteria) this;
        }

        public Criteria andGraynumEqualTo(Integer value) {
            addCriterion("grayNum =", value, "graynum");
            return (Criteria) this;
        }

        public Criteria andGraynumNotEqualTo(Integer value) {
            addCriterion("grayNum <>", value, "graynum");
            return (Criteria) this;
        }

        public Criteria andGraynumGreaterThan(Integer value) {
            addCriterion("grayNum >", value, "graynum");
            return (Criteria) this;
        }

        public Criteria andGraynumGreaterThanOrEqualTo(Integer value) {
            addCriterion("grayNum >=", value, "graynum");
            return (Criteria) this;
        }

        public Criteria andGraynumLessThan(Integer value) {
            addCriterion("grayNum <", value, "graynum");
            return (Criteria) this;
        }

        public Criteria andGraynumLessThanOrEqualTo(Integer value) {
            addCriterion("grayNum <=", value, "graynum");
            return (Criteria) this;
        }

        public Criteria andGraynumIn(List<Integer> values) {
            addCriterion("grayNum in", values, "graynum");
            return (Criteria) this;
        }

        public Criteria andGraynumNotIn(List<Integer> values) {
            addCriterion("grayNum not in", values, "graynum");
            return (Criteria) this;
        }

        public Criteria andGraynumBetween(Integer value1, Integer value2) {
            addCriterion("grayNum between", value1, value2, "graynum");
            return (Criteria) this;
        }

        public Criteria andGraynumNotBetween(Integer value1, Integer value2) {
            addCriterion("grayNum not between", value1, value2, "graynum");
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