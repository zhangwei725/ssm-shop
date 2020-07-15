package com.smart.shop.service;

import com.alipay.api.AlipayApiException;
import com.smart.shop.domain.dto.AliPayDto;

/**
 *
 * 批量返回ID
 *
 */
public interface PayService {
    String pay(String payMethod, AliPayDto aliPay) throws AlipayApiException;
}
