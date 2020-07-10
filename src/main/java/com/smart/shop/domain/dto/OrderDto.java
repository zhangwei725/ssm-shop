package com.smart.shop.domain.dto;

import lombok.Data;

import java.util.List;

/**
 * 商品的id
 * 商品的数量
 */
@Data
public class OrderDto {
    private int memberId;
    private List<CartsDto> carts;
    private String address;
}
