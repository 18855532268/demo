package com.example.manage.mapper;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PurchaseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PurchaseExample() {
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

        public Criteria andProcuretypeIsNull() {
            addCriterion("procureType is null");
            return (Criteria) this;
        }

        public Criteria andProcuretypeIsNotNull() {
            addCriterion("procureType is not null");
            return (Criteria) this;
        }

        public Criteria andProcuretypeEqualTo(String value) {
            addCriterion("procureType =", value, "procuretype");
            return (Criteria) this;
        }

        public Criteria andProcuretypeNotEqualTo(String value) {
            addCriterion("procureType <>", value, "procuretype");
            return (Criteria) this;
        }

        public Criteria andProcuretypeGreaterThan(String value) {
            addCriterion("procureType >", value, "procuretype");
            return (Criteria) this;
        }

        public Criteria andProcuretypeGreaterThanOrEqualTo(String value) {
            addCriterion("procureType >=", value, "procuretype");
            return (Criteria) this;
        }

        public Criteria andProcuretypeLessThan(String value) {
            addCriterion("procureType <", value, "procuretype");
            return (Criteria) this;
        }

        public Criteria andProcuretypeLessThanOrEqualTo(String value) {
            addCriterion("procureType <=", value, "procuretype");
            return (Criteria) this;
        }

        public Criteria andProcuretypeLike(String value) {
            addCriterion("procureType like", value, "procuretype");
            return (Criteria) this;
        }

        public Criteria andProcuretypeNotLike(String value) {
            addCriterion("procureType not like", value, "procuretype");
            return (Criteria) this;
        }

        public Criteria andProcuretypeIn(List<String> values) {
            addCriterion("procureType in", values, "procuretype");
            return (Criteria) this;
        }

        public Criteria andProcuretypeNotIn(List<String> values) {
            addCriterion("procureType not in", values, "procuretype");
            return (Criteria) this;
        }

        public Criteria andProcuretypeBetween(String value1, String value2) {
            addCriterion("procureType between", value1, value2, "procuretype");
            return (Criteria) this;
        }

        public Criteria andProcuretypeNotBetween(String value1, String value2) {
            addCriterion("procureType not between", value1, value2, "procuretype");
            return (Criteria) this;
        }

        public Criteria andBuyeridIsNull() {
            addCriterion("buyerId is null");
            return (Criteria) this;
        }

        public Criteria andBuyeridIsNotNull() {
            addCriterion("buyerId is not null");
            return (Criteria) this;
        }

        public Criteria andBuyeridEqualTo(Long value) {
            addCriterion("buyerId =", value, "buyerid");
            return (Criteria) this;
        }

        public Criteria andBuyeridNotEqualTo(Long value) {
            addCriterion("buyerId <>", value, "buyerid");
            return (Criteria) this;
        }

        public Criteria andBuyeridGreaterThan(Long value) {
            addCriterion("buyerId >", value, "buyerid");
            return (Criteria) this;
        }

        public Criteria andBuyeridGreaterThanOrEqualTo(Long value) {
            addCriterion("buyerId >=", value, "buyerid");
            return (Criteria) this;
        }

        public Criteria andBuyeridLessThan(Long value) {
            addCriterion("buyerId <", value, "buyerid");
            return (Criteria) this;
        }

        public Criteria andBuyeridLessThanOrEqualTo(Long value) {
            addCriterion("buyerId <=", value, "buyerid");
            return (Criteria) this;
        }

        public Criteria andBuyeridIn(List<Long> values) {
            addCriterion("buyerId in", values, "buyerid");
            return (Criteria) this;
        }

        public Criteria andBuyeridNotIn(List<Long> values) {
            addCriterion("buyerId not in", values, "buyerid");
            return (Criteria) this;
        }

        public Criteria andBuyeridBetween(Long value1, Long value2) {
            addCriterion("buyerId between", value1, value2, "buyerid");
            return (Criteria) this;
        }

        public Criteria andBuyeridNotBetween(Long value1, Long value2) {
            addCriterion("buyerId not between", value1, value2, "buyerid");
            return (Criteria) this;
        }

        public Criteria andSuppliernameIsNull() {
            addCriterion("supplierName is null");
            return (Criteria) this;
        }

        public Criteria andSuppliernameIsNotNull() {
            addCriterion("supplierName is not null");
            return (Criteria) this;
        }

        public Criteria andSuppliernameEqualTo(String value) {
            addCriterion("supplierName =", value, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameNotEqualTo(String value) {
            addCriterion("supplierName <>", value, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameGreaterThan(String value) {
            addCriterion("supplierName >", value, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameGreaterThanOrEqualTo(String value) {
            addCriterion("supplierName >=", value, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameLessThan(String value) {
            addCriterion("supplierName <", value, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameLessThanOrEqualTo(String value) {
            addCriterion("supplierName <=", value, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameLike(String value) {
            addCriterion("supplierName like", value, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameNotLike(String value) {
            addCriterion("supplierName not like", value, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameIn(List<String> values) {
            addCriterion("supplierName in", values, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameNotIn(List<String> values) {
            addCriterion("supplierName not in", values, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameBetween(String value1, String value2) {
            addCriterion("supplierName between", value1, value2, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameNotBetween(String value1, String value2) {
            addCriterion("supplierName not between", value1, value2, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSupplierlinkmanIsNull() {
            addCriterion("supplierLinkman is null");
            return (Criteria) this;
        }

        public Criteria andSupplierlinkmanIsNotNull() {
            addCriterion("supplierLinkman is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierlinkmanEqualTo(String value) {
            addCriterion("supplierLinkman =", value, "supplierlinkman");
            return (Criteria) this;
        }

        public Criteria andSupplierlinkmanNotEqualTo(String value) {
            addCriterion("supplierLinkman <>", value, "supplierlinkman");
            return (Criteria) this;
        }

        public Criteria andSupplierlinkmanGreaterThan(String value) {
            addCriterion("supplierLinkman >", value, "supplierlinkman");
            return (Criteria) this;
        }

        public Criteria andSupplierlinkmanGreaterThanOrEqualTo(String value) {
            addCriterion("supplierLinkman >=", value, "supplierlinkman");
            return (Criteria) this;
        }

        public Criteria andSupplierlinkmanLessThan(String value) {
            addCriterion("supplierLinkman <", value, "supplierlinkman");
            return (Criteria) this;
        }

        public Criteria andSupplierlinkmanLessThanOrEqualTo(String value) {
            addCriterion("supplierLinkman <=", value, "supplierlinkman");
            return (Criteria) this;
        }

        public Criteria andSupplierlinkmanLike(String value) {
            addCriterion("supplierLinkman like", value, "supplierlinkman");
            return (Criteria) this;
        }

        public Criteria andSupplierlinkmanNotLike(String value) {
            addCriterion("supplierLinkman not like", value, "supplierlinkman");
            return (Criteria) this;
        }

        public Criteria andSupplierlinkmanIn(List<String> values) {
            addCriterion("supplierLinkman in", values, "supplierlinkman");
            return (Criteria) this;
        }

        public Criteria andSupplierlinkmanNotIn(List<String> values) {
            addCriterion("supplierLinkman not in", values, "supplierlinkman");
            return (Criteria) this;
        }

        public Criteria andSupplierlinkmanBetween(String value1, String value2) {
            addCriterion("supplierLinkman between", value1, value2, "supplierlinkman");
            return (Criteria) this;
        }

        public Criteria andSupplierlinkmanNotBetween(String value1, String value2) {
            addCriterion("supplierLinkman not between", value1, value2, "supplierlinkman");
            return (Criteria) this;
        }

        public Criteria andSuppliertellphoneIsNull() {
            addCriterion("supplierTellphone is null");
            return (Criteria) this;
        }

        public Criteria andSuppliertellphoneIsNotNull() {
            addCriterion("supplierTellphone is not null");
            return (Criteria) this;
        }

        public Criteria andSuppliertellphoneEqualTo(String value) {
            addCriterion("supplierTellphone =", value, "suppliertellphone");
            return (Criteria) this;
        }

        public Criteria andSuppliertellphoneNotEqualTo(String value) {
            addCriterion("supplierTellphone <>", value, "suppliertellphone");
            return (Criteria) this;
        }

        public Criteria andSuppliertellphoneGreaterThan(String value) {
            addCriterion("supplierTellphone >", value, "suppliertellphone");
            return (Criteria) this;
        }

        public Criteria andSuppliertellphoneGreaterThanOrEqualTo(String value) {
            addCriterion("supplierTellphone >=", value, "suppliertellphone");
            return (Criteria) this;
        }

        public Criteria andSuppliertellphoneLessThan(String value) {
            addCriterion("supplierTellphone <", value, "suppliertellphone");
            return (Criteria) this;
        }

        public Criteria andSuppliertellphoneLessThanOrEqualTo(String value) {
            addCriterion("supplierTellphone <=", value, "suppliertellphone");
            return (Criteria) this;
        }

        public Criteria andSuppliertellphoneLike(String value) {
            addCriterion("supplierTellphone like", value, "suppliertellphone");
            return (Criteria) this;
        }

        public Criteria andSuppliertellphoneNotLike(String value) {
            addCriterion("supplierTellphone not like", value, "suppliertellphone");
            return (Criteria) this;
        }

        public Criteria andSuppliertellphoneIn(List<String> values) {
            addCriterion("supplierTellphone in", values, "suppliertellphone");
            return (Criteria) this;
        }

        public Criteria andSuppliertellphoneNotIn(List<String> values) {
            addCriterion("supplierTellphone not in", values, "suppliertellphone");
            return (Criteria) this;
        }

        public Criteria andSuppliertellphoneBetween(String value1, String value2) {
            addCriterion("supplierTellphone between", value1, value2, "suppliertellphone");
            return (Criteria) this;
        }

        public Criteria andSuppliertellphoneNotBetween(String value1, String value2) {
            addCriterion("supplierTellphone not between", value1, value2, "suppliertellphone");
            return (Criteria) this;
        }

        public Criteria andSupperlierpaytypeIsNull() {
            addCriterion("supperlierPayType is null");
            return (Criteria) this;
        }

        public Criteria andSupperlierpaytypeIsNotNull() {
            addCriterion("supperlierPayType is not null");
            return (Criteria) this;
        }

        public Criteria andSupperlierpaytypeEqualTo(String value) {
            addCriterion("supperlierPayType =", value, "supperlierpaytype");
            return (Criteria) this;
        }

        public Criteria andSupperlierpaytypeNotEqualTo(String value) {
            addCriterion("supperlierPayType <>", value, "supperlierpaytype");
            return (Criteria) this;
        }

        public Criteria andSupperlierpaytypeGreaterThan(String value) {
            addCriterion("supperlierPayType >", value, "supperlierpaytype");
            return (Criteria) this;
        }

        public Criteria andSupperlierpaytypeGreaterThanOrEqualTo(String value) {
            addCriterion("supperlierPayType >=", value, "supperlierpaytype");
            return (Criteria) this;
        }

        public Criteria andSupperlierpaytypeLessThan(String value) {
            addCriterion("supperlierPayType <", value, "supperlierpaytype");
            return (Criteria) this;
        }

        public Criteria andSupperlierpaytypeLessThanOrEqualTo(String value) {
            addCriterion("supperlierPayType <=", value, "supperlierpaytype");
            return (Criteria) this;
        }

        public Criteria andSupperlierpaytypeLike(String value) {
            addCriterion("supperlierPayType like", value, "supperlierpaytype");
            return (Criteria) this;
        }

        public Criteria andSupperlierpaytypeNotLike(String value) {
            addCriterion("supperlierPayType not like", value, "supperlierpaytype");
            return (Criteria) this;
        }

        public Criteria andSupperlierpaytypeIn(List<String> values) {
            addCriterion("supperlierPayType in", values, "supperlierpaytype");
            return (Criteria) this;
        }

        public Criteria andSupperlierpaytypeNotIn(List<String> values) {
            addCriterion("supperlierPayType not in", values, "supperlierpaytype");
            return (Criteria) this;
        }

        public Criteria andSupperlierpaytypeBetween(String value1, String value2) {
            addCriterion("supperlierPayType between", value1, value2, "supperlierpaytype");
            return (Criteria) this;
        }

        public Criteria andSupperlierpaytypeNotBetween(String value1, String value2) {
            addCriterion("supperlierPayType not between", value1, value2, "supperlierpaytype");
            return (Criteria) this;
        }

        public Criteria andSupperliercardIsNull() {
            addCriterion("supperlierCard is null");
            return (Criteria) this;
        }

        public Criteria andSupperliercardIsNotNull() {
            addCriterion("supperlierCard is not null");
            return (Criteria) this;
        }

        public Criteria andSupperliercardEqualTo(String value) {
            addCriterion("supperlierCard =", value, "supperliercard");
            return (Criteria) this;
        }

        public Criteria andSupperliercardNotEqualTo(String value) {
            addCriterion("supperlierCard <>", value, "supperliercard");
            return (Criteria) this;
        }

        public Criteria andSupperliercardGreaterThan(String value) {
            addCriterion("supperlierCard >", value, "supperliercard");
            return (Criteria) this;
        }

        public Criteria andSupperliercardGreaterThanOrEqualTo(String value) {
            addCriterion("supperlierCard >=", value, "supperliercard");
            return (Criteria) this;
        }

        public Criteria andSupperliercardLessThan(String value) {
            addCriterion("supperlierCard <", value, "supperliercard");
            return (Criteria) this;
        }

        public Criteria andSupperliercardLessThanOrEqualTo(String value) {
            addCriterion("supperlierCard <=", value, "supperliercard");
            return (Criteria) this;
        }

        public Criteria andSupperliercardLike(String value) {
            addCriterion("supperlierCard like", value, "supperliercard");
            return (Criteria) this;
        }

        public Criteria andSupperliercardNotLike(String value) {
            addCriterion("supperlierCard not like", value, "supperliercard");
            return (Criteria) this;
        }

        public Criteria andSupperliercardIn(List<String> values) {
            addCriterion("supperlierCard in", values, "supperliercard");
            return (Criteria) this;
        }

        public Criteria andSupperliercardNotIn(List<String> values) {
            addCriterion("supperlierCard not in", values, "supperliercard");
            return (Criteria) this;
        }

        public Criteria andSupperliercardBetween(String value1, String value2) {
            addCriterion("supperlierCard between", value1, value2, "supperliercard");
            return (Criteria) this;
        }

        public Criteria andSupperliercardNotBetween(String value1, String value2) {
            addCriterion("supperlierCard not between", value1, value2, "supperliercard");
            return (Criteria) this;
        }

        public Criteria andPayidIsNull() {
            addCriterion("payId is null");
            return (Criteria) this;
        }

        public Criteria andPayidIsNotNull() {
            addCriterion("payId is not null");
            return (Criteria) this;
        }

        public Criteria andPayidEqualTo(Long value) {
            addCriterion("payId =", value, "payid");
            return (Criteria) this;
        }

        public Criteria andPayidNotEqualTo(Long value) {
            addCriterion("payId <>", value, "payid");
            return (Criteria) this;
        }

        public Criteria andPayidGreaterThan(Long value) {
            addCriterion("payId >", value, "payid");
            return (Criteria) this;
        }

        public Criteria andPayidGreaterThanOrEqualTo(Long value) {
            addCriterion("payId >=", value, "payid");
            return (Criteria) this;
        }

        public Criteria andPayidLessThan(Long value) {
            addCriterion("payId <", value, "payid");
            return (Criteria) this;
        }

        public Criteria andPayidLessThanOrEqualTo(Long value) {
            addCriterion("payId <=", value, "payid");
            return (Criteria) this;
        }

        public Criteria andPayidIn(List<Long> values) {
            addCriterion("payId in", values, "payid");
            return (Criteria) this;
        }

        public Criteria andPayidNotIn(List<Long> values) {
            addCriterion("payId not in", values, "payid");
            return (Criteria) this;
        }

        public Criteria andPayidBetween(Long value1, Long value2) {
            addCriterion("payId between", value1, value2, "payid");
            return (Criteria) this;
        }

        public Criteria andPayidNotBetween(Long value1, Long value2) {
            addCriterion("payId not between", value1, value2, "payid");
            return (Criteria) this;
        }

        public Criteria andSettletypeIsNull() {
            addCriterion("settleType is null");
            return (Criteria) this;
        }

        public Criteria andSettletypeIsNotNull() {
            addCriterion("settleType is not null");
            return (Criteria) this;
        }

        public Criteria andSettletypeEqualTo(String value) {
            addCriterion("settleType =", value, "settletype");
            return (Criteria) this;
        }

        public Criteria andSettletypeNotEqualTo(String value) {
            addCriterion("settleType <>", value, "settletype");
            return (Criteria) this;
        }

        public Criteria andSettletypeGreaterThan(String value) {
            addCriterion("settleType >", value, "settletype");
            return (Criteria) this;
        }

        public Criteria andSettletypeGreaterThanOrEqualTo(String value) {
            addCriterion("settleType >=", value, "settletype");
            return (Criteria) this;
        }

        public Criteria andSettletypeLessThan(String value) {
            addCriterion("settleType <", value, "settletype");
            return (Criteria) this;
        }

        public Criteria andSettletypeLessThanOrEqualTo(String value) {
            addCriterion("settleType <=", value, "settletype");
            return (Criteria) this;
        }

        public Criteria andSettletypeLike(String value) {
            addCriterion("settleType like", value, "settletype");
            return (Criteria) this;
        }

        public Criteria andSettletypeNotLike(String value) {
            addCriterion("settleType not like", value, "settletype");
            return (Criteria) this;
        }

        public Criteria andSettletypeIn(List<String> values) {
            addCriterion("settleType in", values, "settletype");
            return (Criteria) this;
        }

        public Criteria andSettletypeNotIn(List<String> values) {
            addCriterion("settleType not in", values, "settletype");
            return (Criteria) this;
        }

        public Criteria andSettletypeBetween(String value1, String value2) {
            addCriterion("settleType between", value1, value2, "settletype");
            return (Criteria) this;
        }

        public Criteria andSettletypeNotBetween(String value1, String value2) {
            addCriterion("settleType not between", value1, value2, "settletype");
            return (Criteria) this;
        }

        public Criteria andPlanpaydateIsNull() {
            addCriterion("planPayDate is null");
            return (Criteria) this;
        }

        public Criteria andPlanpaydateIsNotNull() {
            addCriterion("planPayDate is not null");
            return (Criteria) this;
        }

        public Criteria andPlanpaydateEqualTo(Date value) {
            addCriterion("planPayDate =", value, "planpaydate");
            return (Criteria) this;
        }

        public Criteria andPlanpaydateNotEqualTo(Date value) {
            addCriterion("planPayDate <>", value, "planpaydate");
            return (Criteria) this;
        }

        public Criteria andPlanpaydateGreaterThan(Date value) {
            addCriterion("planPayDate >", value, "planpaydate");
            return (Criteria) this;
        }

        public Criteria andPlanpaydateGreaterThanOrEqualTo(Date value) {
            addCriterion("planPayDate >=", value, "planpaydate");
            return (Criteria) this;
        }

        public Criteria andPlanpaydateLessThan(Date value) {
            addCriterion("planPayDate <", value, "planpaydate");
            return (Criteria) this;
        }

        public Criteria andPlanpaydateLessThanOrEqualTo(Date value) {
            addCriterion("planPayDate <=", value, "planpaydate");
            return (Criteria) this;
        }

        public Criteria andPlanpaydateIn(List<Date> values) {
            addCriterion("planPayDate in", values, "planpaydate");
            return (Criteria) this;
        }

        public Criteria andPlanpaydateNotIn(List<Date> values) {
            addCriterion("planPayDate not in", values, "planpaydate");
            return (Criteria) this;
        }

        public Criteria andPlanpaydateBetween(Date value1, Date value2) {
            addCriterion("planPayDate between", value1, value2, "planpaydate");
            return (Criteria) this;
        }

        public Criteria andPlanpaydateNotBetween(Date value1, Date value2) {
            addCriterion("planPayDate not between", value1, value2, "planpaydate");
            return (Criteria) this;
        }

        public Criteria andPlandeliverydateIsNull() {
            addCriterion("planDeliveryDate is null");
            return (Criteria) this;
        }

        public Criteria andPlandeliverydateIsNotNull() {
            addCriterion("planDeliveryDate is not null");
            return (Criteria) this;
        }

        public Criteria andPlandeliverydateEqualTo(Date value) {
            addCriterion("planDeliveryDate =", value, "plandeliverydate");
            return (Criteria) this;
        }

        public Criteria andPlandeliverydateNotEqualTo(Date value) {
            addCriterion("planDeliveryDate <>", value, "plandeliverydate");
            return (Criteria) this;
        }

        public Criteria andPlandeliverydateGreaterThan(Date value) {
            addCriterion("planDeliveryDate >", value, "plandeliverydate");
            return (Criteria) this;
        }

        public Criteria andPlandeliverydateGreaterThanOrEqualTo(Date value) {
            addCriterion("planDeliveryDate >=", value, "plandeliverydate");
            return (Criteria) this;
        }

        public Criteria andPlandeliverydateLessThan(Date value) {
            addCriterion("planDeliveryDate <", value, "plandeliverydate");
            return (Criteria) this;
        }

        public Criteria andPlandeliverydateLessThanOrEqualTo(Date value) {
            addCriterion("planDeliveryDate <=", value, "plandeliverydate");
            return (Criteria) this;
        }

        public Criteria andPlandeliverydateIn(List<Date> values) {
            addCriterion("planDeliveryDate in", values, "plandeliverydate");
            return (Criteria) this;
        }

        public Criteria andPlandeliverydateNotIn(List<Date> values) {
            addCriterion("planDeliveryDate not in", values, "plandeliverydate");
            return (Criteria) this;
        }

        public Criteria andPlandeliverydateBetween(Date value1, Date value2) {
            addCriterion("planDeliveryDate between", value1, value2, "plandeliverydate");
            return (Criteria) this;
        }

        public Criteria andPlandeliverydateNotBetween(Date value1, Date value2) {
            addCriterion("planDeliveryDate not between", value1, value2, "plandeliverydate");
            return (Criteria) this;
        }

        public Criteria andBuydateIsNull() {
            addCriterion("buyDate is null");
            return (Criteria) this;
        }

        public Criteria andBuydateIsNotNull() {
            addCriterion("buyDate is not null");
            return (Criteria) this;
        }

        public Criteria andBuydateEqualTo(Date value) {
            addCriterion("buyDate =", value, "buydate");
            return (Criteria) this;
        }

        public Criteria andBuydateNotEqualTo(Date value) {
            addCriterion("buyDate <>", value, "buydate");
            return (Criteria) this;
        }

        public Criteria andBuydateGreaterThan(Date value) {
            addCriterion("buyDate >", value, "buydate");
            return (Criteria) this;
        }

        public Criteria andBuydateGreaterThanOrEqualTo(Date value) {
            addCriterion("buyDate >=", value, "buydate");
            return (Criteria) this;
        }

        public Criteria andBuydateLessThan(Date value) {
            addCriterion("buyDate <", value, "buydate");
            return (Criteria) this;
        }

        public Criteria andBuydateLessThanOrEqualTo(Date value) {
            addCriterion("buyDate <=", value, "buydate");
            return (Criteria) this;
        }

        public Criteria andBuydateIn(List<Date> values) {
            addCriterion("buyDate in", values, "buydate");
            return (Criteria) this;
        }

        public Criteria andBuydateNotIn(List<Date> values) {
            addCriterion("buyDate not in", values, "buydate");
            return (Criteria) this;
        }

        public Criteria andBuydateBetween(Date value1, Date value2) {
            addCriterion("buyDate between", value1, value2, "buydate");
            return (Criteria) this;
        }

        public Criteria andBuydateNotBetween(Date value1, Date value2) {
            addCriterion("buyDate not between", value1, value2, "buydate");
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