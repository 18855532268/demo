package com.example.manage.mapper;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PaymentrecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PaymentrecordExample() {
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

        public Criteria andPaymoneyIsNull() {
            addCriterion("payMoney is null");
            return (Criteria) this;
        }

        public Criteria andPaymoneyIsNotNull() {
            addCriterion("payMoney is not null");
            return (Criteria) this;
        }

        public Criteria andPaymoneyEqualTo(String value) {
            addCriterion("payMoney =", value, "paymoney");
            return (Criteria) this;
        }

        public Criteria andPaymoneyNotEqualTo(String value) {
            addCriterion("payMoney <>", value, "paymoney");
            return (Criteria) this;
        }

        public Criteria andPaymoneyGreaterThan(String value) {
            addCriterion("payMoney >", value, "paymoney");
            return (Criteria) this;
        }

        public Criteria andPaymoneyGreaterThanOrEqualTo(String value) {
            addCriterion("payMoney >=", value, "paymoney");
            return (Criteria) this;
        }

        public Criteria andPaymoneyLessThan(String value) {
            addCriterion("payMoney <", value, "paymoney");
            return (Criteria) this;
        }

        public Criteria andPaymoneyLessThanOrEqualTo(String value) {
            addCriterion("payMoney <=", value, "paymoney");
            return (Criteria) this;
        }

        public Criteria andPaymoneyLike(String value) {
            addCriterion("payMoney like", value, "paymoney");
            return (Criteria) this;
        }

        public Criteria andPaymoneyNotLike(String value) {
            addCriterion("payMoney not like", value, "paymoney");
            return (Criteria) this;
        }

        public Criteria andPaymoneyIn(List<String> values) {
            addCriterion("payMoney in", values, "paymoney");
            return (Criteria) this;
        }

        public Criteria andPaymoneyNotIn(List<String> values) {
            addCriterion("payMoney not in", values, "paymoney");
            return (Criteria) this;
        }

        public Criteria andPaymoneyBetween(String value1, String value2) {
            addCriterion("payMoney between", value1, value2, "paymoney");
            return (Criteria) this;
        }

        public Criteria andPaymoneyNotBetween(String value1, String value2) {
            addCriterion("payMoney not between", value1, value2, "paymoney");
            return (Criteria) this;
        }

        public Criteria andPayrentalIsNull() {
            addCriterion("payRental is null");
            return (Criteria) this;
        }

        public Criteria andPayrentalIsNotNull() {
            addCriterion("payRental is not null");
            return (Criteria) this;
        }

        public Criteria andPayrentalEqualTo(String value) {
            addCriterion("payRental =", value, "payrental");
            return (Criteria) this;
        }

        public Criteria andPayrentalNotEqualTo(String value) {
            addCriterion("payRental <>", value, "payrental");
            return (Criteria) this;
        }

        public Criteria andPayrentalGreaterThan(String value) {
            addCriterion("payRental >", value, "payrental");
            return (Criteria) this;
        }

        public Criteria andPayrentalGreaterThanOrEqualTo(String value) {
            addCriterion("payRental >=", value, "payrental");
            return (Criteria) this;
        }

        public Criteria andPayrentalLessThan(String value) {
            addCriterion("payRental <", value, "payrental");
            return (Criteria) this;
        }

        public Criteria andPayrentalLessThanOrEqualTo(String value) {
            addCriterion("payRental <=", value, "payrental");
            return (Criteria) this;
        }

        public Criteria andPayrentalLike(String value) {
            addCriterion("payRental like", value, "payrental");
            return (Criteria) this;
        }

        public Criteria andPayrentalNotLike(String value) {
            addCriterion("payRental not like", value, "payrental");
            return (Criteria) this;
        }

        public Criteria andPayrentalIn(List<String> values) {
            addCriterion("payRental in", values, "payrental");
            return (Criteria) this;
        }

        public Criteria andPayrentalNotIn(List<String> values) {
            addCriterion("payRental not in", values, "payrental");
            return (Criteria) this;
        }

        public Criteria andPayrentalBetween(String value1, String value2) {
            addCriterion("payRental between", value1, value2, "payrental");
            return (Criteria) this;
        }

        public Criteria andPayrentalNotBetween(String value1, String value2) {
            addCriterion("payRental not between", value1, value2, "payrental");
            return (Criteria) this;
        }

        public Criteria andDebtIsNull() {
            addCriterion("debt is null");
            return (Criteria) this;
        }

        public Criteria andDebtIsNotNull() {
            addCriterion("debt is not null");
            return (Criteria) this;
        }

        public Criteria andDebtEqualTo(String value) {
            addCriterion("debt =", value, "debt");
            return (Criteria) this;
        }

        public Criteria andDebtNotEqualTo(String value) {
            addCriterion("debt <>", value, "debt");
            return (Criteria) this;
        }

        public Criteria andDebtGreaterThan(String value) {
            addCriterion("debt >", value, "debt");
            return (Criteria) this;
        }

        public Criteria andDebtGreaterThanOrEqualTo(String value) {
            addCriterion("debt >=", value, "debt");
            return (Criteria) this;
        }

        public Criteria andDebtLessThan(String value) {
            addCriterion("debt <", value, "debt");
            return (Criteria) this;
        }

        public Criteria andDebtLessThanOrEqualTo(String value) {
            addCriterion("debt <=", value, "debt");
            return (Criteria) this;
        }

        public Criteria andDebtLike(String value) {
            addCriterion("debt like", value, "debt");
            return (Criteria) this;
        }

        public Criteria andDebtNotLike(String value) {
            addCriterion("debt not like", value, "debt");
            return (Criteria) this;
        }

        public Criteria andDebtIn(List<String> values) {
            addCriterion("debt in", values, "debt");
            return (Criteria) this;
        }

        public Criteria andDebtNotIn(List<String> values) {
            addCriterion("debt not in", values, "debt");
            return (Criteria) this;
        }

        public Criteria andDebtBetween(String value1, String value2) {
            addCriterion("debt between", value1, value2, "debt");
            return (Criteria) this;
        }

        public Criteria andDebtNotBetween(String value1, String value2) {
            addCriterion("debt not between", value1, value2, "debt");
            return (Criteria) this;
        }

        public Criteria andPayeenameIsNull() {
            addCriterion("payeeName is null");
            return (Criteria) this;
        }

        public Criteria andPayeenameIsNotNull() {
            addCriterion("payeeName is not null");
            return (Criteria) this;
        }

        public Criteria andPayeenameEqualTo(String value) {
            addCriterion("payeeName =", value, "payeename");
            return (Criteria) this;
        }

        public Criteria andPayeenameNotEqualTo(String value) {
            addCriterion("payeeName <>", value, "payeename");
            return (Criteria) this;
        }

        public Criteria andPayeenameGreaterThan(String value) {
            addCriterion("payeeName >", value, "payeename");
            return (Criteria) this;
        }

        public Criteria andPayeenameGreaterThanOrEqualTo(String value) {
            addCriterion("payeeName >=", value, "payeename");
            return (Criteria) this;
        }

        public Criteria andPayeenameLessThan(String value) {
            addCriterion("payeeName <", value, "payeename");
            return (Criteria) this;
        }

        public Criteria andPayeenameLessThanOrEqualTo(String value) {
            addCriterion("payeeName <=", value, "payeename");
            return (Criteria) this;
        }

        public Criteria andPayeenameLike(String value) {
            addCriterion("payeeName like", value, "payeename");
            return (Criteria) this;
        }

        public Criteria andPayeenameNotLike(String value) {
            addCriterion("payeeName not like", value, "payeename");
            return (Criteria) this;
        }

        public Criteria andPayeenameIn(List<String> values) {
            addCriterion("payeeName in", values, "payeename");
            return (Criteria) this;
        }

        public Criteria andPayeenameNotIn(List<String> values) {
            addCriterion("payeeName not in", values, "payeename");
            return (Criteria) this;
        }

        public Criteria andPayeenameBetween(String value1, String value2) {
            addCriterion("payeeName between", value1, value2, "payeename");
            return (Criteria) this;
        }

        public Criteria andPayeenameNotBetween(String value1, String value2) {
            addCriterion("payeeName not between", value1, value2, "payeename");
            return (Criteria) this;
        }

        public Criteria andPayeetypeIsNull() {
            addCriterion("payeeType is null");
            return (Criteria) this;
        }

        public Criteria andPayeetypeIsNotNull() {
            addCriterion("payeeType is not null");
            return (Criteria) this;
        }

        public Criteria andPayeetypeEqualTo(String value) {
            addCriterion("payeeType =", value, "payeetype");
            return (Criteria) this;
        }

        public Criteria andPayeetypeNotEqualTo(String value) {
            addCriterion("payeeType <>", value, "payeetype");
            return (Criteria) this;
        }

        public Criteria andPayeetypeGreaterThan(String value) {
            addCriterion("payeeType >", value, "payeetype");
            return (Criteria) this;
        }

        public Criteria andPayeetypeGreaterThanOrEqualTo(String value) {
            addCriterion("payeeType >=", value, "payeetype");
            return (Criteria) this;
        }

        public Criteria andPayeetypeLessThan(String value) {
            addCriterion("payeeType <", value, "payeetype");
            return (Criteria) this;
        }

        public Criteria andPayeetypeLessThanOrEqualTo(String value) {
            addCriterion("payeeType <=", value, "payeetype");
            return (Criteria) this;
        }

        public Criteria andPayeetypeLike(String value) {
            addCriterion("payeeType like", value, "payeetype");
            return (Criteria) this;
        }

        public Criteria andPayeetypeNotLike(String value) {
            addCriterion("payeeType not like", value, "payeetype");
            return (Criteria) this;
        }

        public Criteria andPayeetypeIn(List<String> values) {
            addCriterion("payeeType in", values, "payeetype");
            return (Criteria) this;
        }

        public Criteria andPayeetypeNotIn(List<String> values) {
            addCriterion("payeeType not in", values, "payeetype");
            return (Criteria) this;
        }

        public Criteria andPayeetypeBetween(String value1, String value2) {
            addCriterion("payeeType between", value1, value2, "payeetype");
            return (Criteria) this;
        }

        public Criteria andPayeetypeNotBetween(String value1, String value2) {
            addCriterion("payeeType not between", value1, value2, "payeetype");
            return (Criteria) this;
        }

        public Criteria andPayeecardIsNull() {
            addCriterion("payeeCard is null");
            return (Criteria) this;
        }

        public Criteria andPayeecardIsNotNull() {
            addCriterion("payeeCard is not null");
            return (Criteria) this;
        }

        public Criteria andPayeecardEqualTo(String value) {
            addCriterion("payeeCard =", value, "payeecard");
            return (Criteria) this;
        }

        public Criteria andPayeecardNotEqualTo(String value) {
            addCriterion("payeeCard <>", value, "payeecard");
            return (Criteria) this;
        }

        public Criteria andPayeecardGreaterThan(String value) {
            addCriterion("payeeCard >", value, "payeecard");
            return (Criteria) this;
        }

        public Criteria andPayeecardGreaterThanOrEqualTo(String value) {
            addCriterion("payeeCard >=", value, "payeecard");
            return (Criteria) this;
        }

        public Criteria andPayeecardLessThan(String value) {
            addCriterion("payeeCard <", value, "payeecard");
            return (Criteria) this;
        }

        public Criteria andPayeecardLessThanOrEqualTo(String value) {
            addCriterion("payeeCard <=", value, "payeecard");
            return (Criteria) this;
        }

        public Criteria andPayeecardLike(String value) {
            addCriterion("payeeCard like", value, "payeecard");
            return (Criteria) this;
        }

        public Criteria andPayeecardNotLike(String value) {
            addCriterion("payeeCard not like", value, "payeecard");
            return (Criteria) this;
        }

        public Criteria andPayeecardIn(List<String> values) {
            addCriterion("payeeCard in", values, "payeecard");
            return (Criteria) this;
        }

        public Criteria andPayeecardNotIn(List<String> values) {
            addCriterion("payeeCard not in", values, "payeecard");
            return (Criteria) this;
        }

        public Criteria andPayeecardBetween(String value1, String value2) {
            addCriterion("payeeCard between", value1, value2, "payeecard");
            return (Criteria) this;
        }

        public Criteria andPayeecardNotBetween(String value1, String value2) {
            addCriterion("payeeCard not between", value1, value2, "payeecard");
            return (Criteria) this;
        }

        public Criteria andPayeeremarkIsNull() {
            addCriterion("payeeRemark is null");
            return (Criteria) this;
        }

        public Criteria andPayeeremarkIsNotNull() {
            addCriterion("payeeRemark is not null");
            return (Criteria) this;
        }

        public Criteria andPayeeremarkEqualTo(String value) {
            addCriterion("payeeRemark =", value, "payeeremark");
            return (Criteria) this;
        }

        public Criteria andPayeeremarkNotEqualTo(String value) {
            addCriterion("payeeRemark <>", value, "payeeremark");
            return (Criteria) this;
        }

        public Criteria andPayeeremarkGreaterThan(String value) {
            addCriterion("payeeRemark >", value, "payeeremark");
            return (Criteria) this;
        }

        public Criteria andPayeeremarkGreaterThanOrEqualTo(String value) {
            addCriterion("payeeRemark >=", value, "payeeremark");
            return (Criteria) this;
        }

        public Criteria andPayeeremarkLessThan(String value) {
            addCriterion("payeeRemark <", value, "payeeremark");
            return (Criteria) this;
        }

        public Criteria andPayeeremarkLessThanOrEqualTo(String value) {
            addCriterion("payeeRemark <=", value, "payeeremark");
            return (Criteria) this;
        }

        public Criteria andPayeeremarkLike(String value) {
            addCriterion("payeeRemark like", value, "payeeremark");
            return (Criteria) this;
        }

        public Criteria andPayeeremarkNotLike(String value) {
            addCriterion("payeeRemark not like", value, "payeeremark");
            return (Criteria) this;
        }

        public Criteria andPayeeremarkIn(List<String> values) {
            addCriterion("payeeRemark in", values, "payeeremark");
            return (Criteria) this;
        }

        public Criteria andPayeeremarkNotIn(List<String> values) {
            addCriterion("payeeRemark not in", values, "payeeremark");
            return (Criteria) this;
        }

        public Criteria andPayeeremarkBetween(String value1, String value2) {
            addCriterion("payeeRemark between", value1, value2, "payeeremark");
            return (Criteria) this;
        }

        public Criteria andPayeeremarkNotBetween(String value1, String value2) {
            addCriterion("payeeRemark not between", value1, value2, "payeeremark");
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

        public Criteria andPayaccountIsNull() {
            addCriterion("payAccount is null");
            return (Criteria) this;
        }

        public Criteria andPayaccountIsNotNull() {
            addCriterion("payAccount is not null");
            return (Criteria) this;
        }

        public Criteria andPayaccountEqualTo(String value) {
            addCriterion("payAccount =", value, "payaccount");
            return (Criteria) this;
        }

        public Criteria andPayaccountNotEqualTo(String value) {
            addCriterion("payAccount <>", value, "payaccount");
            return (Criteria) this;
        }

        public Criteria andPayaccountGreaterThan(String value) {
            addCriterion("payAccount >", value, "payaccount");
            return (Criteria) this;
        }

        public Criteria andPayaccountGreaterThanOrEqualTo(String value) {
            addCriterion("payAccount >=", value, "payaccount");
            return (Criteria) this;
        }

        public Criteria andPayaccountLessThan(String value) {
            addCriterion("payAccount <", value, "payaccount");
            return (Criteria) this;
        }

        public Criteria andPayaccountLessThanOrEqualTo(String value) {
            addCriterion("payAccount <=", value, "payaccount");
            return (Criteria) this;
        }

        public Criteria andPayaccountLike(String value) {
            addCriterion("payAccount like", value, "payaccount");
            return (Criteria) this;
        }

        public Criteria andPayaccountNotLike(String value) {
            addCriterion("payAccount not like", value, "payaccount");
            return (Criteria) this;
        }

        public Criteria andPayaccountIn(List<String> values) {
            addCriterion("payAccount in", values, "payaccount");
            return (Criteria) this;
        }

        public Criteria andPayaccountNotIn(List<String> values) {
            addCriterion("payAccount not in", values, "payaccount");
            return (Criteria) this;
        }

        public Criteria andPayaccountBetween(String value1, String value2) {
            addCriterion("payAccount between", value1, value2, "payaccount");
            return (Criteria) this;
        }

        public Criteria andPayaccountNotBetween(String value1, String value2) {
            addCriterion("payAccount not between", value1, value2, "payaccount");
            return (Criteria) this;
        }

        public Criteria andItemsIsNull() {
            addCriterion("items is null");
            return (Criteria) this;
        }

        public Criteria andItemsIsNotNull() {
            addCriterion("items is not null");
            return (Criteria) this;
        }

        public Criteria andItemsEqualTo(String value) {
            addCriterion("items =", value, "items");
            return (Criteria) this;
        }

        public Criteria andItemsNotEqualTo(String value) {
            addCriterion("items <>", value, "items");
            return (Criteria) this;
        }

        public Criteria andItemsGreaterThan(String value) {
            addCriterion("items >", value, "items");
            return (Criteria) this;
        }

        public Criteria andItemsGreaterThanOrEqualTo(String value) {
            addCriterion("items >=", value, "items");
            return (Criteria) this;
        }

        public Criteria andItemsLessThan(String value) {
            addCriterion("items <", value, "items");
            return (Criteria) this;
        }

        public Criteria andItemsLessThanOrEqualTo(String value) {
            addCriterion("items <=", value, "items");
            return (Criteria) this;
        }

        public Criteria andItemsLike(String value) {
            addCriterion("items like", value, "items");
            return (Criteria) this;
        }

        public Criteria andItemsNotLike(String value) {
            addCriterion("items not like", value, "items");
            return (Criteria) this;
        }

        public Criteria andItemsIn(List<String> values) {
            addCriterion("items in", values, "items");
            return (Criteria) this;
        }

        public Criteria andItemsNotIn(List<String> values) {
            addCriterion("items not in", values, "items");
            return (Criteria) this;
        }

        public Criteria andItemsBetween(String value1, String value2) {
            addCriterion("items between", value1, value2, "items");
            return (Criteria) this;
        }

        public Criteria andItemsNotBetween(String value1, String value2) {
            addCriterion("items not between", value1, value2, "items");
            return (Criteria) this;
        }

        public Criteria andImgurlIsNull() {
            addCriterion("imgUrl is null");
            return (Criteria) this;
        }

        public Criteria andImgurlIsNotNull() {
            addCriterion("imgUrl is not null");
            return (Criteria) this;
        }

        public Criteria andImgurlEqualTo(String value) {
            addCriterion("imgUrl =", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlNotEqualTo(String value) {
            addCriterion("imgUrl <>", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlGreaterThan(String value) {
            addCriterion("imgUrl >", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlGreaterThanOrEqualTo(String value) {
            addCriterion("imgUrl >=", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlLessThan(String value) {
            addCriterion("imgUrl <", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlLessThanOrEqualTo(String value) {
            addCriterion("imgUrl <=", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlLike(String value) {
            addCriterion("imgUrl like", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlNotLike(String value) {
            addCriterion("imgUrl not like", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlIn(List<String> values) {
            addCriterion("imgUrl in", values, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlNotIn(List<String> values) {
            addCriterion("imgUrl not in", values, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlBetween(String value1, String value2) {
            addCriterion("imgUrl between", value1, value2, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlNotBetween(String value1, String value2) {
            addCriterion("imgUrl not between", value1, value2, "imgurl");
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