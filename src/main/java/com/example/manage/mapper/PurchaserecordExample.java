package com.example.manage.mapper;

import java.util.ArrayList;
import java.util.List;

public class PurchaserecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PurchaserecordExample() {
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

        public Criteria andRawmaterialsidIsNull() {
            addCriterion("rawMaterialsId is null");
            return (Criteria) this;
        }

        public Criteria andRawmaterialsidIsNotNull() {
            addCriterion("rawMaterialsId is not null");
            return (Criteria) this;
        }

        public Criteria andRawmaterialsidEqualTo(Long value) {
            addCriterion("rawMaterialsId =", value, "rawmaterialsid");
            return (Criteria) this;
        }

        public Criteria andRawmaterialsidNotEqualTo(Long value) {
            addCriterion("rawMaterialsId <>", value, "rawmaterialsid");
            return (Criteria) this;
        }

        public Criteria andRawmaterialsidGreaterThan(Long value) {
            addCriterion("rawMaterialsId >", value, "rawmaterialsid");
            return (Criteria) this;
        }

        public Criteria andRawmaterialsidGreaterThanOrEqualTo(Long value) {
            addCriterion("rawMaterialsId >=", value, "rawmaterialsid");
            return (Criteria) this;
        }

        public Criteria andRawmaterialsidLessThan(Long value) {
            addCriterion("rawMaterialsId <", value, "rawmaterialsid");
            return (Criteria) this;
        }

        public Criteria andRawmaterialsidLessThanOrEqualTo(Long value) {
            addCriterion("rawMaterialsId <=", value, "rawmaterialsid");
            return (Criteria) this;
        }

        public Criteria andRawmaterialsidIn(List<Long> values) {
            addCriterion("rawMaterialsId in", values, "rawmaterialsid");
            return (Criteria) this;
        }

        public Criteria andRawmaterialsidNotIn(List<Long> values) {
            addCriterion("rawMaterialsId not in", values, "rawmaterialsid");
            return (Criteria) this;
        }

        public Criteria andRawmaterialsidBetween(Long value1, Long value2) {
            addCriterion("rawMaterialsId between", value1, value2, "rawmaterialsid");
            return (Criteria) this;
        }

        public Criteria andRawmaterialsidNotBetween(Long value1, Long value2) {
            addCriterion("rawMaterialsId not between", value1, value2, "rawmaterialsid");
            return (Criteria) this;
        }

        public Criteria andPurchaseidIsNull() {
            addCriterion("purchaseId is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseidIsNotNull() {
            addCriterion("purchaseId is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseidEqualTo(Long value) {
            addCriterion("purchaseId =", value, "purchaseid");
            return (Criteria) this;
        }

        public Criteria andPurchaseidNotEqualTo(Long value) {
            addCriterion("purchaseId <>", value, "purchaseid");
            return (Criteria) this;
        }

        public Criteria andPurchaseidGreaterThan(Long value) {
            addCriterion("purchaseId >", value, "purchaseid");
            return (Criteria) this;
        }

        public Criteria andPurchaseidGreaterThanOrEqualTo(Long value) {
            addCriterion("purchaseId >=", value, "purchaseid");
            return (Criteria) this;
        }

        public Criteria andPurchaseidLessThan(Long value) {
            addCriterion("purchaseId <", value, "purchaseid");
            return (Criteria) this;
        }

        public Criteria andPurchaseidLessThanOrEqualTo(Long value) {
            addCriterion("purchaseId <=", value, "purchaseid");
            return (Criteria) this;
        }

        public Criteria andPurchaseidIn(List<Long> values) {
            addCriterion("purchaseId in", values, "purchaseid");
            return (Criteria) this;
        }

        public Criteria andPurchaseidNotIn(List<Long> values) {
            addCriterion("purchaseId not in", values, "purchaseid");
            return (Criteria) this;
        }

        public Criteria andPurchaseidBetween(Long value1, Long value2) {
            addCriterion("purchaseId between", value1, value2, "purchaseid");
            return (Criteria) this;
        }

        public Criteria andPurchaseidNotBetween(Long value1, Long value2) {
            addCriterion("purchaseId not between", value1, value2, "purchaseid");
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