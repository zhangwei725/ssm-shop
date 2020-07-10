package com.smart.shop.domain.entity;

import java.math.BigDecimal;
import java.util.Date;

import lombok.Data;

/**
 * 购物车表
 */
@Data
public class Carts {
    /**
     * 购物车主键
     */
    private Integer cartId;
    /**
     * 会员ID
     */
    private Integer memberId;
    /**
     * 商品id
     */
    private Integer pid;

    /**
     * 购买数量
     */
    private Integer quantity;

    /**
     * 商品单价
     */
    private BigDecimal price;

    /**
     * 商品图片
     */
    private String productPic;

    /**
     * 商品名称
     */
    private String productName;

    /**
     * 商品的销售属性
     */
    private String productAttr;

    /**
     * 是否删除 1.表示未删除  0 表示删除
     */
    private Integer status;

    /**
     * 创建时间
     */
    private Date createDate;

    /**
     * 更新时间
     */
    private Date updateDate;
}