package com.smart.shop.domain.dto;

import lombok.Data;

@Data
public class CartsDto {
    // 商品ID
    private int pid;
    //商品数量
    private int count;
    // 收货地址
}
