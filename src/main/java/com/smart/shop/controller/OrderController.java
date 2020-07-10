package com.smart.shop.controller;

import com.smart.shop.domain.dto.OrderDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 订单功能
 * 优惠券系统 积分系统  库存系统  物理系统  发票系统
 */
@RestController
@RequestMapping("/order")
public class OrderController {
    /*
     * 查询订单  查询
     *
     * 取消订单   更新
     */

    /**
     * 事务的知识点  锁
     * 生成订单  如何生成订单号 (要求在你的系统中必须是唯一)
     * 计算总价
     * 判断库存
     * 减少库存  id    stock
     * 通过商品ID成库存
     * 10 -2
     * update   8
     * 发起支付
     */
    @PostMapping("/add")
    public void order(OrderDto orderDto) {

    }
}
