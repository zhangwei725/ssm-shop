package com.smart.shop.domain.entity;

import java.math.BigDecimal;
import java.util.Date;

import lombok.Data;

@Data
public class Product {
    private Integer pid;

    /**
     * 商品的名称
     */
    private String name;

    /**
     * 商品的子标题
     */
    private String subTitle;

    /**
     * 原价
     */
    private BigDecimal orignalPrice;

    /**
     * 现价
     */
    private BigDecimal promotePrice;

    /**
     * 库存
     */
    private Integer stock;

    /**
     * 分类ID
     */
    private Integer cid;

    private Date createDate;
    /**
     * 乐观锁
     */
    private int version;
}