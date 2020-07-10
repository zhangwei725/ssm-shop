package com.smart.shop.controller;

import com.smart.shop.domain.entity.Carts;
import com.smart.shop.domain.entity.Product;
import com.smart.shop.exception.ServiceException;
import com.smart.shop.service.CartService;
import com.smart.shop.utils.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 重复代码
 * 全局异常的处理
 * 自定义异常
 * 工作量
 */
@RestController
@RequestMapping("/carts")
public class CartsController {
    @Resource
    CartService cartService;
    /**
     *- 查询用户购物车的商品信息
     * - 修改购物的数量
     * - 添加购物车
     * - 删除商品信息
     * - 批量删除 多条记录
     */

    /**
     * 过滤器  AOP的思想
     * 查询用户购物车的商品信息
     * <p>
     * list/1
     */
    @GetMapping("/list/{mid}")
    public ResponseEntity<List<Carts>> list(@PathVariable() int mid) {
        List<Carts> list = cartService.list(mid);
        return ResponseEntity.success(list);
    }
    /**
     * 修改购物车的数量
     * 用户ID
     * 购车表主键
     *
     * @return
     */
    @PutMapping("/update")
    public ResponseEntity<Integer> update(int mid, int cartId) {
        return null;
    }

    /**
     * 该用户如果已经添加过该商品   更新数量
     * 如果没有购买过,添加该条记录
     *
     * @return
     */
    @PostMapping("/add")
    public ResponseEntity<Integer> addCarts(int mid, int quantity, Product product) throws ServiceException {
        int count = cartService.add(mid, quantity, product);
        return ResponseEntity.success(count);

    }

    @DeleteMapping("/del")
    public ResponseEntity<Integer> delete(@RequestParam List<Integer> ids) {
        int count = cartService.delete(ids);
        return ResponseEntity.success(count);
    }
}



