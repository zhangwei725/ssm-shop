package com.smart.shop.service.impl;
/**
 * 方便管理
 */

import com.smart.shop.domain.dto.CartsDto;
import com.smart.shop.domain.dto.OrderDto;
import com.smart.shop.domain.entity.Order;
import com.smart.shop.domain.entity.Product;
import com.smart.shop.exception.ServiceException;
import com.smart.shop.mapper.OrderMapper;
import com.smart.shop.mapper.ProductMapper;
import com.smart.shop.service.OrderService;
import com.smart.shop.utils.ErrorStatus;
import com.smart.shop.utils.GenerateCodeUtil;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.List;
import java.util.Random;

public class OrderServiceImpl implements OrderService {
    @Resource
    ProductMapper productMapper;
    @Resource
    OrderMapper orderMapper;

    /**
     * 举一反三
     * 1. 生成订单号(一定要保证唯一)
     * 2. 减少库存
     * 高并发  synchronized 加锁
     *
     * @param orderDto
     * @return redis 实现分布式锁
     * 乐观锁
     * 在数据添加字段  version
     * 线程1 查询库存的时候 库存数量   版本 +1
     * 线程2 查询库存的时候 库存数量   版本 1
     * 线程1 更新库存数量 +  版本号1   version 2
     * # 表示已经有人操作过了   直接重新下单
     * 线程2 更新数据库存数量  版本号加1  作为更新的条件  where  version = 1
     */
    @Override
    @Transactional
    public String generateOrder(OrderDto orderDto) throws ServiceException {
        String orderNo = GenerateCodeUtil.createCodeNum("OR");
        List<CartsDto> carts = orderDto.getCarts();
        //总价
        BigDecimal total = new BigDecimal(0);
        for (CartsDto cart : carts) {
            //减少库存
            int pid = cart.getPid();
            Product product = productMapper.selectById(pid);
            // 获取库存信息   10   1
            Integer stock = product.getStock();
            int num = cart.getCount();
            if (stock >= num) {
                // 减少库存
                stock -= cart.getCount();
                //更新到数据
                int i = productMapper.updateStockById(pid, stock, product.getVersion());
                if (i == 0) {
                    throw new ServiceException(ErrorStatus.SERVICE_ERROR);
                }
//            update  表名  set  stock=1, version+=1 where pid=? and version=version
                // 计算总价   价格 * 数量
                BigDecimal count = new BigDecimal(cart.getCount());
                BigDecimal price = product.getPromotePrice();
                //价格 * 数量
                BigDecimal multiply = price.multiply(count);
                // total
                total.add(multiply);
            } else {
                throw new ServiceException("库存不够", 2000);
            }
        }
        //保存订单
        Order order = new Order();
        order.setOrderNo(orderNo);
        order.setTotal(total);
        order.setMemberId(orderDto.getMemberId());
        orderMapper.insert(order);
        // 保存定点详情
        //发起支付
        return null;
    }
}
