package com.smart.shop.domain.dto;
// 按着功能进行分 controller
import lombok.Data;
//数据校验
@Data
public class CartsDto {
    // 商品ID
    private int pid;
    //商品数量
    private int count;
    // 收货地址
}
