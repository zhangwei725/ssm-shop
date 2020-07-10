package com.smart.shop.mapper;

import com.smart.shop.domain.entity.Order;
import org.apache.ibatis.annotations.Param;

public interface OrderMapper {
    int insert(@Param("order") Order order);
}
