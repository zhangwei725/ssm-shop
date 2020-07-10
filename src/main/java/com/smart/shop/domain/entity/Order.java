package com.smart.shop.domain.entity;

import java.math.BigDecimal;
import java.util.Date;

import lombok.Data;

@Data
public class Order {
    /**
     * 主键
     */
    private Integer orderId;

    /**
     * 订单号
     */
    private String orderNo;

    /**
     * 创建时间
     */
    private Date createDate;

    /**
     * 订单状态
     */
    private Integer status;

    /**
     * 总价
     */
    private BigDecimal total;

    /**
     * 会员ID
     */
    private Integer memberId;
}