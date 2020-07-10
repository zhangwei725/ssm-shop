package com.smart.shop.service;

import com.smart.shop.domain.entity.Product;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeanUtils;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-context.xml", "classpath:spring-mybatis.xml"})
public class CartServiceTest {
//    @Resource
//    CartService cartService;

    @Test
    public void add() {
        Product productDto = new Product();
        productDto.setPid(1);
        productDto.setName("华为meta 40 pro");


        Product product1 = new Product();

        BeanUtils.copyProperties(productDto, product1);


        System.out.println(product1);

//        int count = cartService.add(1, 1, product);
    }

    @Test
    public void testDelete() {
        List<Integer> ids = new ArrayList<>();
        ids.add(2);
        ids.add(3);
        ids.add(4);
        ids.add(5);
        ids.add(6);
//        int count = cartService.delete(ids);
//        System.out.println(count);
    }
}