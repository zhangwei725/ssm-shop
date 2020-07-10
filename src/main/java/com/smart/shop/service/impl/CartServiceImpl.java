package com.smart.shop.service.impl;

import com.smart.shop.domain.entity.Carts;
import com.smart.shop.domain.entity.Product;
import com.smart.shop.exception.ServiceException;
import com.smart.shop.mapper.CartsMapper;
import com.smart.shop.service.CartService;
import com.smart.shop.utils.ErrorStatus;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CartServiceImpl implements CartService {
    @Resource
    CartsMapper cartsMapper;

    /**
     * @param mid
     * @param product
     * @return 1.通过用户id跟商品的id查询购车表
     * 2 如果该商品已经存在
     * 3 如果该对象不存在则添加该条记录
     */
    @Override
    public int add(int mid, int quantity, Product product) throws ServiceException {
        int count = 0;
        // 查询
        Carts carts = cartsMapper.selectByMidAndPid(mid, product.getPid());
        if (carts != null) {
            //如果该商品已经存在 更新的操作
            quantity += carts.getQuantity();
            count = cartsMapper.update(carts.getCartId(), quantity);
        } else {
            //添加的操作
            carts = new Carts();
            carts.setMemberId(mid);
            carts.setQuantity(quantity);
            carts.setPid(product.getPid());
            count = cartsMapper.insert(carts);
        }
        return count;
    }

    @Override
    public List<Carts> list(int mid) {
        return cartsMapper.selectAll(mid);
    }

    @Override
    public int delete(List<Integer> ids) {
        return cartsMapper.updateBatch(ids);
    }
}
