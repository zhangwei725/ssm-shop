package com.smart.shop.service;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.smart.shop.domain.dto.AliPayDto;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-context.xml", "classpath:spring-mybatis.xml"})
public class PayServiceTest {
    @Resource
    PayService payService;

    @Test
    public void pay() throws AlipayApiException {
        AliPayDto aliPayDto = new AliPayDto();
        aliPayDto.setAmount("9.00");
        aliPayDto.setOrderNo("1594632894390");
        aliPayDto.setSubject("有钱任性");
        String pay = payService.pay("1", aliPayDto);
        System.out.println(pay);
    }
}