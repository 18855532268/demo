package com.example.manage.mapper;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductstoreExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductstoreExample() {
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

        public Criteria andVatnumIsNull() {
            addCriterion("vatNum is null");
            return (Criteria) this;
        }

        public Criteria andVatnumIsNotNull() {
            addCriterion("vatNum is not null");
            return (Criteria) this;
        }

        public Criteria andVatnumEqualTo(String value) {
            addCriterion("vatNum =", value, "vatnum");
            return (Criteria) this;
        }

        public Criteria andVatnumNotEqualTo(String value) {
            addCriterion("vatNum <>", value, "vatnum");
            return (Criteria) this;
        }

        public Criteria andVatnumGreaterThan(String value) {
            addCriterion("vatNum >", value, "vatnum");
            return (Criteria) this;
        }

        public Criteria andVatnumGreaterThanOrEqualTo(String value) {
            addCriterion("vatNum >=", value, "vatnum");
            return (Criteria) this;
        }

        public Criteria andVatnumLessThan(String value) {
            addCriterion("vatNum <", value, "vatnum");
            return (Criteria) this;
        }

        public Criteria andVatnumLessThanOrEqualTo(String value) {
            addCriterion("vatNum <=", value, "vatnum");
            return (Criteria) this;
        }

        public Criteria andVatnumLike(String value) {
            addCriterion("vatNum like", value, "vatnum");
            return (Criteria) this;
        }

        public Criteria andVatnumNotLike(String value) {
            addCriterion("vatNum not like", value, "vatnum");
            return (Criteria) this;
        }

        public Criteria andVatnumIn(List<String> values) {
            addCriterion("vatNum in", values, "vatnum");
            return (Criteria) this;
        }

        public Criteria andVatnumNotIn(List<String> values) {
            addCriterion("vatNum not in", values, "vatnum");
            return (Criteria) this;
        }

        public Criteria andVatnumBetween(String value1, String value2) {
            addCriterion("vatNum between", value1, value2, "vatnum");
            return (Criteria) this;
        }

        public Criteria andVatnumNotBetween(String value1, String value2) {
            addCriterion("vatNum not between", value1, value2, "vatnum");
            return (Criteria) this;
        }

        public Criteria andStoredateIsNull() {
            addCriterion("storeDate is null");
            return (Criteria) this;
        }

        public Criteria andStoredateIsNotNull() {
            addCriterion("storeDate is not null");
            return (Criteria) this;
        }

        public Criteria andStoredateEqualTo(Date value) {
            addCriterion("storeDate =", value, "storedate");
            return (Criteria) this;
        }

        public Criteria andStoredateNotEqualTo(Date value) {
            addCriterion("storeDate <>", value, "storedate");
            return (Criteria) this;
        }

        public Criteria andStoredateGreaterThan(Date value) {
            addCriterion("storeDate >", value, "storedate");
            return (Criteria) this;
        }

        public Criteria andStoredateGreaterThanOrEqualTo(Date value) {
            addCriterion("storeDate >=", value, "storedate");
            return (Criteria) this;
        }

        public Criteria andStoredateLessThan(Date value) {
            addCriterion("storeDate <", value, "storedate");
            return (Criteria) this;
        }

        public Criteria andStoredateLessThanOrEqualTo(Date value) {
            addCriterion("storeDate <=", value, "storedate");
            return (Criteria) this;
        }

        public Criteria andStoredateIn(List<Date> values) {
            addCriterion("storeDate in", values, "storedate");
            return (Criteria) this;
        }

        public Criteria andStoredateNotIn(List<Date> values) {
            addCriterion("storeDate not in", values, "storedate");
            return (Criteria) this;
        }

        public Criteria andStoredateBetween(Date value1, Date value2) {
            addCriterion("storeDate between", value1, value2, "storedate");
            return (Criteria) this;
        }

        public Criteria andStoredateNotBetween(Date value1, Date value2) {
            addCriterion("storeDate not between", value1, value2, "storedate");
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

        public Criteria andPayordertypeIsNull() {
            addCriterion("payOrderType is null");
            return (Criteria) this;
        }

        public Criteria andPayordertypeIsNotNull() {
            addCriterion("payOrderType is not null");
            return (Criteria) this;
        }

        public Criteria andPayordertypeEqualTo(String value) {
            addCriterion("payOrderType =", value, "payordertype");
            return (Criteria) this;
        }

        public Criteria andPayordertypeNotEqualTo(String value) {
            addCriterion("payOrderType <>", value, "payordertype");
            return (Criteria) this;
        }

        public Criteria andPayordertypeGreaterThan(String value) {
            addCriterion("payOrderType >", value, "payordertype");
            return (Criteria) this;
        }

        public Criteria andPayordertypeGreaterThanOrEqualTo(String value) {
            addCriterion("payOrderType >=", value, "payordertype");
            return (Criteria) this;
        }

        public Criteria andPayordertypeLessThan(String value) {
            addCriterion("payOrderType <", value, "payordertype");
            return (Criteria) this;
        }

        public Criteria andPayordertypeLessThanOrEqualTo(String value) {
            addCriterion("payOrderType <=", value, "payordertype");
            return (Criteria) this;
        }

        public Criteria andPayordertypeLike(String value) {
            addCriterion("payOrderType like", value, "payordertype");
            return (Criteria) this;
        }

        public Criteria andPayordertypeNotLike(String value) {
            addCriterion("payOrderType not like", value, "payordertype");
            return (Criteria) this;
        }

        public Criteria andPayordertypeIn(List<String> values) {
            addCriterion("payOrderType in", values, "payordertype");
            return (Criteria) this;
        }

        public Criteria andPayordertypeNotIn(List<String> values) {
            addCriterion("payOrderType not in", values, "payordertype");
            return (Criteria) this;
        }

        public Criteria andPayordertypeBetween(String value1, String value2) {
            addCriterion("payOrderType between", value1, value2, "payordertype");
            return (Criteria) this;
        }

        public Criteria andPayordertypeNotBetween(String value1, String value2) {
            addCriterion("payOrderType not between", value1, value2, "payordertype");
            return (Criteria) this;
        }

        public Criteria andReelnumIsNull() {
            addCriterion("reelNum is null");
            return (Criteria) this;
        }

        public Criteria andReelnumIsNotNull() {
            addCriterion("reelNum is not null");
            return (Criteria) this;
        }

        public Criteria andReelnumEqualTo(String value) {
            addCriterion("reelNum =", value, "reelnum");
            return (Criteria) this;
        }

        public Criteria andReelnumNotEqualTo(String value) {
            addCriterion("reelNum <>", value, "reelnum");
            return (Criteria) this;
        }

        public Criteria andReelnumGreaterThan(String value) {
            addCriterion("reelNum >", value, "reelnum");
            return (Criteria) this;
        }

        public Criteria andReelnumGreaterThanOrEqualTo(String value) {
            addCriterion("reelNum >=", value, "reelnum");
            return (Criteria) this;
        }

        public Criteria andReelnumLessThan(String value) {
            addCriterion("reelNum <", value, "reelnum");
            return (Criteria) this;
        }

        public Criteria andReelnumLessThanOrEqualTo(String value) {
            addCriterion("reelNum <=", value, "reelnum");
            return (Criteria) this;
        }

        public Criteria andReelnumLike(String value) {
            addCriterion("reelNum like", value, "reelnum");
            return (Criteria) this;
        }

        public Criteria andReelnumNotLike(String value) {
            addCriterion("reelNum not like", value, "reelnum");
            return (Criteria) this;
        }

        public Criteria andReelnumIn(List<String> values) {
            addCriterion("reelNum in", values, "reelnum");
            return (Criteria) this;
        }

        public Criteria andReelnumNotIn(List<String> values) {
            addCriterion("reelNum not in", values, "reelnum");
            return (Criteria) this;
        }

        public Criteria andReelnumBetween(String value1, String value2) {
            addCriterion("reelNum between", value1, value2, "reelnum");
            return (Criteria) this;
        }

        public Criteria andReelnumNotBetween(String value1, String value2) {
            addCriterion("reelNum not between", value1, value2, "reelnum");
            return (Criteria) this;
        }

        public Criteria andProducttypeidIsNull() {
            addCriterion("productTypeId is null");
            return (Criteria) this;
        }

        public Criteria andProducttypeidIsNotNull() {
            addCriterion("productTypeId is not null");
            return (Criteria) this;
        }

        public Criteria andProducttypeidEqualTo(Long value) {
            addCriterion("productTypeId =", value, "producttypeid");
            return (Criteria) this;
        }

        public Criteria andProducttypeidNotEqualTo(Long value) {
            addCriterion("productTypeId <>", value, "producttypeid");
            return (Criteria) this;
        }

        public Criteria andProducttypeidGreaterThan(Long value) {
            addCriterion("productTypeId >", value, "producttypeid");
            return (Criteria) this;
        }

        public Criteria andProducttypeidGreaterThanOrEqualTo(Long value) {
            addCriterion("productTypeId >=", value, "producttypeid");
            return (Criteria) this;
        }

        public Criteria andProducttypeidLessThan(Long value) {
            addCriterion("productTypeId <", value, "producttypeid");
            return (Criteria) this;
        }

        public Criteria andProducttypeidLessThanOrEqualTo(Long value) {
            addCriterion("productTypeId <=", value, "producttypeid");
            return (Criteria) this;
        }

        public Criteria andProducttypeidIn(List<Long> values) {
            addCriterion("productTypeId in", values, "producttypeid");
            return (Criteria) this;
        }

        public Criteria andProducttypeidNotIn(List<Long> values) {
            addCriterion("productTypeId not in", values, "producttypeid");
            return (Criteria) this;
        }

        public Criteria andProducttypeidBetween(Long value1, Long value2) {
            addCriterion("productTypeId between", value1, value2, "producttypeid");
            return (Criteria) this;
        }

        public Criteria andProducttypeidNotBetween(Long value1, Long value2) {
            addCriterion("productTypeId not between", value1, value2, "producttypeid");
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