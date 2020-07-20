package com.example.manage.constant;

public class ConstantsForDomain {
    /**
     * 通用状态
     */
    public final static Integer NORMAL = 1;
    public final static Integer DELETE = 9;
    /**
     * cusomer表
     */
    public final static int CUSTOMER_STATUS_NORMAL = 1;
    public final static int CUSTOMER_STATUS_DELETE = 9;

    /**
     * product表
     */
    public final static int PRODUCT_STATUS_NORMAL = 1;
    public final static int PRODUCT_STATUS_DELETE = 9;

    /**
     * 管理人员表
     */
    public final static int MANAGEUSER_STATUS_NORMAL = 1;
    public final static int MANAGEUSER_STATUS_DELETE = 9;
    /**
     * 订单表
     */
    public final static int ORDER_STATUS_NORMAL = 1;
    public final static int ORDER_STATUS_DELETE = 9;
    /**
     * 订单类型
     */
    public final static int ORDER_TYPE_BUY = 1;
    public final static int ORDER_TYPE_SPECIMEN = 2;

    /**
     * 生产表状态
     */
    // 代排单
    public final static int PRODUCTION_STATUS_RANK = 1;
    // 生产中
    public final static int PRODUCTION_STATUS_IN = 2;
    // 已完成
    public final static int PRODUCTION_STATUS_FINISHED = 3;
    // 已审核
    public final static int PRODUCTION_STATUS_AUDIT = 4;
    // 删除
    public final static int PRODUCTION_STATUS_DELETE = 9;

    /**
     * 采购记录状态
     */
    // 待审核
    public final static int PURCHASERECORD_STATUS_UNAUDIT = 1;
    // 已审核
    public final static int PURCHASERECORD_STATUS_AUDIT = 2;

    public final static int PURCHASERECORD_STATUS_DELETE = 9;

}
