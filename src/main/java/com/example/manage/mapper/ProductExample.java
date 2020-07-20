package com.example.manage.mapper;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ProductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductExample() {
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

        public Criteria andProductnumIsNull() {
            addCriterion("productNum is null");
            return (Criteria) this;
        }

        public Criteria andProductnumIsNotNull() {
            addCriterion("productNum is not null");
            return (Criteria) this;
        }

        public Criteria andProductnumEqualTo(String value) {
            addCriterion("productNum =", value, "productnum");
            return (Criteria) this;
        }

        public Criteria andProductnumNotEqualTo(String value) {
            addCriterion("productNum <>", value, "productnum");
            return (Criteria) this;
        }

        public Criteria andProductnumGreaterThan(String value) {
            addCriterion("productNum >", value, "productnum");
            return (Criteria) this;
        }

        public Criteria andProductnumGreaterThanOrEqualTo(String value) {
            addCriterion("productNum >=", value, "productnum");
            return (Criteria) this;
        }

        public Criteria andProductnumLessThan(String value) {
            addCriterion("productNum <", value, "productnum");
            return (Criteria) this;
        }

        public Criteria andProductnumLessThanOrEqualTo(String value) {
            addCriterion("productNum <=", value, "productnum");
            return (Criteria) this;
        }

        public Criteria andProductnumLike(String value) {
            addCriterion("productNum like", value, "productnum");
            return (Criteria) this;
        }

        public Criteria andProductnumNotLike(String value) {
            addCriterion("productNum not like", value, "productnum");
            return (Criteria) this;
        }

        public Criteria andProductnumIn(List<String> values) {
            addCriterion("productNum in", values, "productnum");
            return (Criteria) this;
        }

        public Criteria andProductnumNotIn(List<String> values) {
            addCriterion("productNum not in", values, "productnum");
            return (Criteria) this;
        }

        public Criteria andProductnumBetween(String value1, String value2) {
            addCriterion("productNum between", value1, value2, "productnum");
            return (Criteria) this;
        }

        public Criteria andProductnumNotBetween(String value1, String value2) {
            addCriterion("productNum not between", value1, value2, "productnum");
            return (Criteria) this;
        }

        public Criteria andProductnameIsNull() {
            addCriterion("productName is null");
            return (Criteria) this;
        }

        public Criteria andProductnameIsNotNull() {
            addCriterion("productName is not null");
            return (Criteria) this;
        }

        public Criteria andProductnameEqualTo(String value) {
            addCriterion("productName =", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotEqualTo(String value) {
            addCriterion("productName <>", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameGreaterThan(String value) {
            addCriterion("productName >", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameGreaterThanOrEqualTo(String value) {
            addCriterion("productName >=", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameLessThan(String value) {
            addCriterion("productName <", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameLessThanOrEqualTo(String value) {
            addCriterion("productName <=", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameLike(String value) {
            addCriterion("productName like", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotLike(String value) {
            addCriterion("productName not like", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameIn(List<String> values) {
            addCriterion("productName in", values, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotIn(List<String> values) {
            addCriterion("productName not in", values, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameBetween(String value1, String value2) {
            addCriterion("productName between", value1, value2, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotBetween(String value1, String value2) {
            addCriterion("productName not between", value1, value2, "productname");
            return (Criteria) this;
        }

        public Criteria andProductspecificationIsNull() {
            addCriterion("productSpecification is null");
            return (Criteria) this;
        }

        public Criteria andProductspecificationIsNotNull() {
            addCriterion("productSpecification is not null");
            return (Criteria) this;
        }

        public Criteria andProductspecificationEqualTo(String value) {
            addCriterion("productSpecification =", value, "productspecification");
            return (Criteria) this;
        }

        public Criteria andProductspecificationNotEqualTo(String value) {
            addCriterion("productSpecification <>", value, "productspecification");
            return (Criteria) this;
        }

        public Criteria andProductspecificationGreaterThan(String value) {
            addCriterion("productSpecification >", value, "productspecification");
            return (Criteria) this;
        }

        public Criteria andProductspecificationGreaterThanOrEqualTo(String value) {
            addCriterion("productSpecification >=", value, "productspecification");
            return (Criteria) this;
        }

        public Criteria andProductspecificationLessThan(String value) {
            addCriterion("productSpecification <", value, "productspecification");
            return (Criteria) this;
        }

        public Criteria andProductspecificationLessThanOrEqualTo(String value) {
            addCriterion("productSpecification <=", value, "productspecification");
            return (Criteria) this;
        }

        public Criteria andProductspecificationLike(String value) {
            addCriterion("productSpecification like", value, "productspecification");
            return (Criteria) this;
        }

        public Criteria andProductspecificationNotLike(String value) {
            addCriterion("productSpecification not like", value, "productspecification");
            return (Criteria) this;
        }

        public Criteria andProductspecificationIn(List<String> values) {
            addCriterion("productSpecification in", values, "productspecification");
            return (Criteria) this;
        }

        public Criteria andProductspecificationNotIn(List<String> values) {
            addCriterion("productSpecification not in", values, "productspecification");
            return (Criteria) this;
        }

        public Criteria andProductspecificationBetween(String value1, String value2) {
            addCriterion("productSpecification between", value1, value2, "productspecification");
            return (Criteria) this;
        }

        public Criteria andProductspecificationNotBetween(String value1, String value2) {
            addCriterion("productSpecification not between", value1, value2, "productspecification");
            return (Criteria) this;
        }

        public Criteria andProductcolorIsNull() {
            addCriterion("productColor is null");
            return (Criteria) this;
        }

        public Criteria andProductcolorIsNotNull() {
            addCriterion("productColor is not null");
            return (Criteria) this;
        }

        public Criteria andProductcolorEqualTo(String value) {
            addCriterion("productColor =", value, "productcolor");
            return (Criteria) this;
        }

        public Criteria andProductcolorNotEqualTo(String value) {
            addCriterion("productColor <>", value, "productcolor");
            return (Criteria) this;
        }

        public Criteria andProductcolorGreaterThan(String value) {
            addCriterion("productColor >", value, "productcolor");
            return (Criteria) this;
        }

        public Criteria andProductcolorGreaterThanOrEqualTo(String value) {
            addCriterion("productColor >=", value, "productcolor");
            return (Criteria) this;
        }

        public Criteria andProductcolorLessThan(String value) {
            addCriterion("productColor <", value, "productcolor");
            return (Criteria) this;
        }

        public Criteria andProductcolorLessThanOrEqualTo(String value) {
            addCriterion("productColor <=", value, "productcolor");
            return (Criteria) this;
        }

        public Criteria andProductcolorLike(String value) {
            addCriterion("productColor like", value, "productcolor");
            return (Criteria) this;
        }

        public Criteria andProductcolorNotLike(String value) {
            addCriterion("productColor not like", value, "productcolor");
            return (Criteria) this;
        }

        public Criteria andProductcolorIn(List<String> values) {
            addCriterion("productColor in", values, "productcolor");
            return (Criteria) this;
        }

        public Criteria andProductcolorNotIn(List<String> values) {
            addCriterion("productColor not in", values, "productcolor");
            return (Criteria) this;
        }

        public Criteria andProductcolorBetween(String value1, String value2) {
            addCriterion("productColor between", value1, value2, "productcolor");
            return (Criteria) this;
        }

        public Criteria andProductcolorNotBetween(String value1, String value2) {
            addCriterion("productColor not between", value1, value2, "productcolor");
            return (Criteria) this;
        }

        public Criteria andProductmaterialsIsNull() {
            addCriterion("productMaterials is null");
            return (Criteria) this;
        }

        public Criteria andProductmaterialsIsNotNull() {
            addCriterion("productMaterials is not null");
            return (Criteria) this;
        }

        public Criteria andProductmaterialsEqualTo(String value) {
            addCriterion("productMaterials =", value, "productmaterials");
            return (Criteria) this;
        }

        public Criteria andProductmaterialsNotEqualTo(String value) {
            addCriterion("productMaterials <>", value, "productmaterials");
            return (Criteria) this;
        }

        public Criteria andProductmaterialsGreaterThan(String value) {
            addCriterion("productMaterials >", value, "productmaterials");
            return (Criteria) this;
        }

        public Criteria andProductmaterialsGreaterThanOrEqualTo(String value) {
            addCriterion("productMaterials >=", value, "productmaterials");
            return (Criteria) this;
        }

        public Criteria andProductmaterialsLessThan(String value) {
            addCriterion("productMaterials <", value, "productmaterials");
            return (Criteria) this;
        }

        public Criteria andProductmaterialsLessThanOrEqualTo(String value) {
            addCriterion("productMaterials <=", value, "productmaterials");
            return (Criteria) this;
        }

        public Criteria andProductmaterialsLike(String value) {
            addCriterion("productMaterials like", value, "productmaterials");
            return (Criteria) this;
        }

        public Criteria andProductmaterialsNotLike(String value) {
            addCriterion("productMaterials not like", value, "productmaterials");
            return (Criteria) this;
        }

        public Criteria andProductmaterialsIn(List<String> values) {
            addCriterion("productMaterials in", values, "productmaterials");
            return (Criteria) this;
        }

        public Criteria andProductmaterialsNotIn(List<String> values) {
            addCriterion("productMaterials not in", values, "productmaterials");
            return (Criteria) this;
        }

        public Criteria andProductmaterialsBetween(String value1, String value2) {
            addCriterion("productMaterials between", value1, value2, "productmaterials");
            return (Criteria) this;
        }

        public Criteria andProductmaterialsNotBetween(String value1, String value2) {
            addCriterion("productMaterials not between", value1, value2, "productmaterials");
            return (Criteria) this;
        }

        public Criteria andProductingredientIsNull() {
            addCriterion("productIngredient is null");
            return (Criteria) this;
        }

        public Criteria andProductingredientIsNotNull() {
            addCriterion("productIngredient is not null");
            return (Criteria) this;
        }

        public Criteria andProductingredientEqualTo(String value) {
            addCriterion("productIngredient =", value, "productingredient");
            return (Criteria) this;
        }

        public Criteria andProductingredientNotEqualTo(String value) {
            addCriterion("productIngredient <>", value, "productingredient");
            return (Criteria) this;
        }

        public Criteria andProductingredientGreaterThan(String value) {
            addCriterion("productIngredient >", value, "productingredient");
            return (Criteria) this;
        }

        public Criteria andProductingredientGreaterThanOrEqualTo(String value) {
            addCriterion("productIngredient >=", value, "productingredient");
            return (Criteria) this;
        }

        public Criteria andProductingredientLessThan(String value) {
            addCriterion("productIngredient <", value, "productingredient");
            return (Criteria) this;
        }

        public Criteria andProductingredientLessThanOrEqualTo(String value) {
            addCriterion("productIngredient <=", value, "productingredient");
            return (Criteria) this;
        }

        public Criteria andProductingredientLike(String value) {
            addCriterion("productIngredient like", value, "productingredient");
            return (Criteria) this;
        }

        public Criteria andProductingredientNotLike(String value) {
            addCriterion("productIngredient not like", value, "productingredient");
            return (Criteria) this;
        }

        public Criteria andProductingredientIn(List<String> values) {
            addCriterion("productIngredient in", values, "productingredient");
            return (Criteria) this;
        }

        public Criteria andProductingredientNotIn(List<String> values) {
            addCriterion("productIngredient not in", values, "productingredient");
            return (Criteria) this;
        }

        public Criteria andProductingredientBetween(String value1, String value2) {
            addCriterion("productIngredient between", value1, value2, "productingredient");
            return (Criteria) this;
        }

        public Criteria andProductingredientNotBetween(String value1, String value2) {
            addCriterion("productIngredient not between", value1, value2, "productingredient");
            return (Criteria) this;
        }

        public Criteria andProductunitIsNull() {
            addCriterion("productUnit is null");
            return (Criteria) this;
        }

        public Criteria andProductunitIsNotNull() {
            addCriterion("productUnit is not null");
            return (Criteria) this;
        }

        public Criteria andProductunitEqualTo(String value) {
            addCriterion("productUnit =", value, "productunit");
            return (Criteria) this;
        }

        public Criteria andProductunitNotEqualTo(String value) {
            addCriterion("productUnit <>", value, "productunit");
            return (Criteria) this;
        }

        public Criteria andProductunitGreaterThan(String value) {
            addCriterion("productUnit >", value, "productunit");
            return (Criteria) this;
        }

        public Criteria andProductunitGreaterThanOrEqualTo(String value) {
            addCriterion("productUnit >=", value, "productunit");
            return (Criteria) this;
        }

        public Criteria andProductunitLessThan(String value) {
            addCriterion("productUnit <", value, "productunit");
            return (Criteria) this;
        }

        public Criteria andProductunitLessThanOrEqualTo(String value) {
            addCriterion("productUnit <=", value, "productunit");
            return (Criteria) this;
        }

        public Criteria andProductunitLike(String value) {
            addCriterion("productUnit like", value, "productunit");
            return (Criteria) this;
        }

        public Criteria andProductunitNotLike(String value) {
            addCriterion("productUnit not like", value, "productunit");
            return (Criteria) this;
        }

        public Criteria andProductunitIn(List<String> values) {
            addCriterion("productUnit in", values, "productunit");
            return (Criteria) this;
        }

        public Criteria andProductunitNotIn(List<String> values) {
            addCriterion("productUnit not in", values, "productunit");
            return (Criteria) this;
        }

        public Criteria andProductunitBetween(String value1, String value2) {
            addCriterion("productUnit between", value1, value2, "productunit");
            return (Criteria) this;
        }

        public Criteria andProductunitNotBetween(String value1, String value2) {
            addCriterion("productUnit not between", value1, value2, "productunit");
            return (Criteria) this;
        }

        public Criteria andProductdefaultstoreIsNull() {
            addCriterion("productDefaultStore is null");
            return (Criteria) this;
        }

        public Criteria andProductdefaultstoreIsNotNull() {
            addCriterion("productDefaultStore is not null");
            return (Criteria) this;
        }

        public Criteria andProductdefaultstoreEqualTo(String value) {
            addCriterion("productDefaultStore =", value, "productdefaultstore");
            return (Criteria) this;
        }

        public Criteria andProductdefaultstoreNotEqualTo(String value) {
            addCriterion("productDefaultStore <>", value, "productdefaultstore");
            return (Criteria) this;
        }

        public Criteria andProductdefaultstoreGreaterThan(String value) {
            addCriterion("productDefaultStore >", value, "productdefaultstore");
            return (Criteria) this;
        }

        public Criteria andProductdefaultstoreGreaterThanOrEqualTo(String value) {
            addCriterion("productDefaultStore >=", value, "productdefaultstore");
            return (Criteria) this;
        }

        public Criteria andProductdefaultstoreLessThan(String value) {
            addCriterion("productDefaultStore <", value, "productdefaultstore");
            return (Criteria) this;
        }

        public Criteria andProductdefaultstoreLessThanOrEqualTo(String value) {
            addCriterion("productDefaultStore <=", value, "productdefaultstore");
            return (Criteria) this;
        }

        public Criteria andProductdefaultstoreLike(String value) {
            addCriterion("productDefaultStore like", value, "productdefaultstore");
            return (Criteria) this;
        }

        public Criteria andProductdefaultstoreNotLike(String value) {
            addCriterion("productDefaultStore not like", value, "productdefaultstore");
            return (Criteria) this;
        }

        public Criteria andProductdefaultstoreIn(List<String> values) {
            addCriterion("productDefaultStore in", values, "productdefaultstore");
            return (Criteria) this;
        }

        public Criteria andProductdefaultstoreNotIn(List<String> values) {
            addCriterion("productDefaultStore not in", values, "productdefaultstore");
            return (Criteria) this;
        }

        public Criteria andProductdefaultstoreBetween(String value1, String value2) {
            addCriterion("productDefaultStore between", value1, value2, "productdefaultstore");
            return (Criteria) this;
        }

        public Criteria andProductdefaultstoreNotBetween(String value1, String value2) {
            addCriterion("productDefaultStore not between", value1, value2, "productdefaultstore");
            return (Criteria) this;
        }

        public Criteria andProductdefaultsupplierIsNull() {
            addCriterion("productDefaultSupplier is null");
            return (Criteria) this;
        }

        public Criteria andProductdefaultsupplierIsNotNull() {
            addCriterion("productDefaultSupplier is not null");
            return (Criteria) this;
        }

        public Criteria andProductdefaultsupplierEqualTo(String value) {
            addCriterion("productDefaultSupplier =", value, "productdefaultsupplier");
            return (Criteria) this;
        }

        public Criteria andProductdefaultsupplierNotEqualTo(String value) {
            addCriterion("productDefaultSupplier <>", value, "productdefaultsupplier");
            return (Criteria) this;
        }

        public Criteria andProductdefaultsupplierGreaterThan(String value) {
            addCriterion("productDefaultSupplier >", value, "productdefaultsupplier");
            return (Criteria) this;
        }

        public Criteria andProductdefaultsupplierGreaterThanOrEqualTo(String value) {
            addCriterion("productDefaultSupplier >=", value, "productdefaultsupplier");
            return (Criteria) this;
        }

        public Criteria andProductdefaultsupplierLessThan(String value) {
            addCriterion("productDefaultSupplier <", value, "productdefaultsupplier");
            return (Criteria) this;
        }

        public Criteria andProductdefaultsupplierLessThanOrEqualTo(String value) {
            addCriterion("productDefaultSupplier <=", value, "productdefaultsupplier");
            return (Criteria) this;
        }

        public Criteria andProductdefaultsupplierLike(String value) {
            addCriterion("productDefaultSupplier like", value, "productdefaultsupplier");
            return (Criteria) this;
        }

        public Criteria andProductdefaultsupplierNotLike(String value) {
            addCriterion("productDefaultSupplier not like", value, "productdefaultsupplier");
            return (Criteria) this;
        }

        public Criteria andProductdefaultsupplierIn(List<String> values) {
            addCriterion("productDefaultSupplier in", values, "productdefaultsupplier");
            return (Criteria) this;
        }

        public Criteria andProductdefaultsupplierNotIn(List<String> values) {
            addCriterion("productDefaultSupplier not in", values, "productdefaultsupplier");
            return (Criteria) this;
        }

        public Criteria andProductdefaultsupplierBetween(String value1, String value2) {
            addCriterion("productDefaultSupplier between", value1, value2, "productdefaultsupplier");
            return (Criteria) this;
        }

        public Criteria andProductdefaultsupplierNotBetween(String value1, String value2) {
            addCriterion("productDefaultSupplier not between", value1, value2, "productdefaultsupplier");
            return (Criteria) this;
        }

        public Criteria andProductsellIsNull() {
            addCriterion("productSell is null");
            return (Criteria) this;
        }

        public Criteria andProductsellIsNotNull() {
            addCriterion("productSell is not null");
            return (Criteria) this;
        }

        public Criteria andProductsellEqualTo(BigDecimal value) {
            addCriterion("productSell =", value, "productsell");
            return (Criteria) this;
        }

        public Criteria andProductsellNotEqualTo(BigDecimal value) {
            addCriterion("productSell <>", value, "productsell");
            return (Criteria) this;
        }

        public Criteria andProductsellGreaterThan(BigDecimal value) {
            addCriterion("productSell >", value, "productsell");
            return (Criteria) this;
        }

        public Criteria andProductsellGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("productSell >=", value, "productsell");
            return (Criteria) this;
        }

        public Criteria andProductsellLessThan(BigDecimal value) {
            addCriterion("productSell <", value, "productsell");
            return (Criteria) this;
        }

        public Criteria andProductsellLessThanOrEqualTo(BigDecimal value) {
            addCriterion("productSell <=", value, "productsell");
            return (Criteria) this;
        }

        public Criteria andProductsellIn(List<BigDecimal> values) {
            addCriterion("productSell in", values, "productsell");
            return (Criteria) this;
        }

        public Criteria andProductsellNotIn(List<BigDecimal> values) {
            addCriterion("productSell not in", values, "productsell");
            return (Criteria) this;
        }

        public Criteria andProductsellBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("productSell between", value1, value2, "productsell");
            return (Criteria) this;
        }

        public Criteria andProductsellNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("productSell not between", value1, value2, "productsell");
            return (Criteria) this;
        }

        public Criteria andProductpurchasingIsNull() {
            addCriterion("productPurchasing is null");
            return (Criteria) this;
        }

        public Criteria andProductpurchasingIsNotNull() {
            addCriterion("productPurchasing is not null");
            return (Criteria) this;
        }

        public Criteria andProductpurchasingEqualTo(BigDecimal value) {
            addCriterion("productPurchasing =", value, "productpurchasing");
            return (Criteria) this;
        }

        public Criteria andProductpurchasingNotEqualTo(BigDecimal value) {
            addCriterion("productPurchasing <>", value, "productpurchasing");
            return (Criteria) this;
        }

        public Criteria andProductpurchasingGreaterThan(BigDecimal value) {
            addCriterion("productPurchasing >", value, "productpurchasing");
            return (Criteria) this;
        }

        public Criteria andProductpurchasingGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("productPurchasing >=", value, "productpurchasing");
            return (Criteria) this;
        }

        public Criteria andProductpurchasingLessThan(BigDecimal value) {
            addCriterion("productPurchasing <", value, "productpurchasing");
            return (Criteria) this;
        }

        public Criteria andProductpurchasingLessThanOrEqualTo(BigDecimal value) {
            addCriterion("productPurchasing <=", value, "productpurchasing");
            return (Criteria) this;
        }

        public Criteria andProductpurchasingIn(List<BigDecimal> values) {
            addCriterion("productPurchasing in", values, "productpurchasing");
            return (Criteria) this;
        }

        public Criteria andProductpurchasingNotIn(List<BigDecimal> values) {
            addCriterion("productPurchasing not in", values, "productpurchasing");
            return (Criteria) this;
        }

        public Criteria andProductpurchasingBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("productPurchasing between", value1, value2, "productpurchasing");
            return (Criteria) this;
        }

        public Criteria andProductpurchasingNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("productPurchasing not between", value1, value2, "productpurchasing");
            return (Criteria) this;
        }

        public Criteria andProductcostpriceIsNull() {
            addCriterion("productCostPrice is null");
            return (Criteria) this;
        }

        public Criteria andProductcostpriceIsNotNull() {
            addCriterion("productCostPrice is not null");
            return (Criteria) this;
        }

        public Criteria andProductcostpriceEqualTo(BigDecimal value) {
            addCriterion("productCostPrice =", value, "productcostprice");
            return (Criteria) this;
        }

        public Criteria andProductcostpriceNotEqualTo(BigDecimal value) {
            addCriterion("productCostPrice <>", value, "productcostprice");
            return (Criteria) this;
        }

        public Criteria andProductcostpriceGreaterThan(BigDecimal value) {
            addCriterion("productCostPrice >", value, "productcostprice");
            return (Criteria) this;
        }

        public Criteria andProductcostpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("productCostPrice >=", value, "productcostprice");
            return (Criteria) this;
        }

        public Criteria andProductcostpriceLessThan(BigDecimal value) {
            addCriterion("productCostPrice <", value, "productcostprice");
            return (Criteria) this;
        }

        public Criteria andProductcostpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("productCostPrice <=", value, "productcostprice");
            return (Criteria) this;
        }

        public Criteria andProductcostpriceIn(List<BigDecimal> values) {
            addCriterion("productCostPrice in", values, "productcostprice");
            return (Criteria) this;
        }

        public Criteria andProductcostpriceNotIn(List<BigDecimal> values) {
            addCriterion("productCostPrice not in", values, "productcostprice");
            return (Criteria) this;
        }

        public Criteria andProductcostpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("productCostPrice between", value1, value2, "productcostprice");
            return (Criteria) this;
        }

        public Criteria andProductcostpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("productCostPrice not between", value1, value2, "productcostprice");
            return (Criteria) this;
        }

        public Criteria andProductremarkIsNull() {
            addCriterion("productRemark is null");
            return (Criteria) this;
        }

        public Criteria andProductremarkIsNotNull() {
            addCriterion("productRemark is not null");
            return (Criteria) this;
        }

        public Criteria andProductremarkEqualTo(String value) {
            addCriterion("productRemark =", value, "productremark");
            return (Criteria) this;
        }

        public Criteria andProductremarkNotEqualTo(String value) {
            addCriterion("productRemark <>", value, "productremark");
            return (Criteria) this;
        }

        public Criteria andProductremarkGreaterThan(String value) {
            addCriterion("productRemark >", value, "productremark");
            return (Criteria) this;
        }

        public Criteria andProductremarkGreaterThanOrEqualTo(String value) {
            addCriterion("productRemark >=", value, "productremark");
            return (Criteria) this;
        }

        public Criteria andProductremarkLessThan(String value) {
            addCriterion("productRemark <", value, "productremark");
            return (Criteria) this;
        }

        public Criteria andProductremarkLessThanOrEqualTo(String value) {
            addCriterion("productRemark <=", value, "productremark");
            return (Criteria) this;
        }

        public Criteria andProductremarkLike(String value) {
            addCriterion("productRemark like", value, "productremark");
            return (Criteria) this;
        }

        public Criteria andProductremarkNotLike(String value) {
            addCriterion("productRemark not like", value, "productremark");
            return (Criteria) this;
        }

        public Criteria andProductremarkIn(List<String> values) {
            addCriterion("productRemark in", values, "productremark");
            return (Criteria) this;
        }

        public Criteria andProductremarkNotIn(List<String> values) {
            addCriterion("productRemark not in", values, "productremark");
            return (Criteria) this;
        }

        public Criteria andProductremarkBetween(String value1, String value2) {
            addCriterion("productRemark between", value1, value2, "productremark");
            return (Criteria) this;
        }

        public Criteria andProductremarkNotBetween(String value1, String value2) {
            addCriterion("productRemark not between", value1, value2, "productremark");
            return (Criteria) this;
        }

        public Criteria andProducttaxrateIsNull() {
            addCriterion("productTaxRate is null");
            return (Criteria) this;
        }

        public Criteria andProducttaxrateIsNotNull() {
            addCriterion("productTaxRate is not null");
            return (Criteria) this;
        }

        public Criteria andProducttaxrateEqualTo(String value) {
            addCriterion("productTaxRate =", value, "producttaxrate");
            return (Criteria) this;
        }

        public Criteria andProducttaxrateNotEqualTo(String value) {
            addCriterion("productTaxRate <>", value, "producttaxrate");
            return (Criteria) this;
        }

        public Criteria andProducttaxrateGreaterThan(String value) {
            addCriterion("productTaxRate >", value, "producttaxrate");
            return (Criteria) this;
        }

        public Criteria andProducttaxrateGreaterThanOrEqualTo(String value) {
            addCriterion("productTaxRate >=", value, "producttaxrate");
            return (Criteria) this;
        }

        public Criteria andProducttaxrateLessThan(String value) {
            addCriterion("productTaxRate <", value, "producttaxrate");
            return (Criteria) this;
        }

        public Criteria andProducttaxrateLessThanOrEqualTo(String value) {
            addCriterion("productTaxRate <=", value, "producttaxrate");
            return (Criteria) this;
        }

        public Criteria andProducttaxrateLike(String value) {
            addCriterion("productTaxRate like", value, "producttaxrate");
            return (Criteria) this;
        }

        public Criteria andProducttaxrateNotLike(String value) {
            addCriterion("productTaxRate not like", value, "producttaxrate");
            return (Criteria) this;
        }

        public Criteria andProducttaxrateIn(List<String> values) {
            addCriterion("productTaxRate in", values, "producttaxrate");
            return (Criteria) this;
        }

        public Criteria andProducttaxrateNotIn(List<String> values) {
            addCriterion("productTaxRate not in", values, "producttaxrate");
            return (Criteria) this;
        }

        public Criteria andProducttaxrateBetween(String value1, String value2) {
            addCriterion("productTaxRate between", value1, value2, "producttaxrate");
            return (Criteria) this;
        }

        public Criteria andProducttaxrateNotBetween(String value1, String value2) {
            addCriterion("productTaxRate not between", value1, value2, "producttaxrate");
            return (Criteria) this;
        }

        public Criteria andTypeidIsNull() {
            addCriterion("typeId is null");
            return (Criteria) this;
        }

        public Criteria andTypeidIsNotNull() {
            addCriterion("typeId is not null");
            return (Criteria) this;
        }

        public Criteria andTypeidEqualTo(String value) {
            addCriterion("typeId =", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidNotEqualTo(String value) {
            addCriterion("typeId <>", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidGreaterThan(String value) {
            addCriterion("typeId >", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidGreaterThanOrEqualTo(String value) {
            addCriterion("typeId >=", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidLessThan(String value) {
            addCriterion("typeId <", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidLessThanOrEqualTo(String value) {
            addCriterion("typeId <=", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidLike(String value) {
            addCriterion("typeId like", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidNotLike(String value) {
            addCriterion("typeId not like", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidIn(List<String> values) {
            addCriterion("typeId in", values, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidNotIn(List<String> values) {
            addCriterion("typeId not in", values, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidBetween(String value1, String value2) {
            addCriterion("typeId between", value1, value2, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidNotBetween(String value1, String value2) {
            addCriterion("typeId not between", value1, value2, "typeid");
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

        public Criteria andUrlIsNull() {
            addCriterion("url is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("url is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("url =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("url <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("url >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("url >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("url <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("url <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("url like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("url not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("url in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("url not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("url between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("url not between", value1, value2, "url");
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