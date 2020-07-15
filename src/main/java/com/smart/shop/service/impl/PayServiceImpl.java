package com.smart.shop.service.impl;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.domain.AlipayTradeAppPayModel;
import com.alipay.api.request.AlipayTradePagePayRequest;
import com.alipay.api.response.AlipayTradePagePayResponse;
import com.smart.shop.config.AliPayConfigProperties;
import com.smart.shop.domain.dto.AliPayDto;
import com.smart.shop.service.PayService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PayServiceImpl implements PayService {
    @Resource
    AlipayClient alipayClient;

    @Override
    public String pay(String payMethod, AliPayDto aliPay) throws AlipayApiException {
        AlipayTradePagePayRequest request = new AlipayTradePagePayRequest();
        request.setReturnUrl(AliPayConfigProperties.RETURN_URL);
        request.setNotifyUrl(AliPayConfigProperties.NOTIFY_URL);

        AlipayTradeAppPayModel model = new AlipayTradeAppPayModel();
        //商品描述，可空


        model.setBody("支付案例");
        model.setSubject(aliPay.getSubject());
        // 该笔订单允许的最晚付款时间，逾期将关闭交易。取值范围：1m～15d。m-分钟，h-小时，d-天，1c-当天（1c-当天的情况下，无论交易何时创建，都在0点关闭）。 该参数数值不接受小数点， 如 1.5h，可转换为 90m。
        String timeout_express = "30m";
        model.setTimeExpire("30m");
        model.setTotalAmount(aliPay.getAmount());
        model.setOutTradeNo(aliPay.getOrderNo());
        model.setProductCode(AliPayConfigProperties.PRODUCT_CODE);
        request.setBizModel(model);
        AlipayTradePagePayResponse response = alipayClient.sdkExecute(request);
        return response.getBody();
    }


}
