package com.smart.shop.service;

import com.smart.shop.domain.entity.Carts;
import com.smart.shop.domain.entity.Product;
import com.smart.shop.exception.ServiceException;

import java.util.List;

public interface CartService {
    int add(int mid, int quantity, Product product) throws ServiceException;

    List<Carts> list(int mid);

    int delete(List<Integer> ids);
}
