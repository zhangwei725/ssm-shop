package com.smart.shop.service;

import com.smart.shop.domain.dto.OrderDto;
import com.smart.shop.exception.ServiceException;

public interface OrderService {
    String generateOrder(OrderDto orderDto) throws Exception, ServiceException;
}
