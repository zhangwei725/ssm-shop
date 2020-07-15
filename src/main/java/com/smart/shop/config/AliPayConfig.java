package com.smart.shop.config;

import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static com.smart.shop.config.AliPayConfigProperties.*;

@Configuration
public class AliPayConfig {
    /**
     * 初始化 AlipayClient
     *
     * @return
     */
    @Bean
    public AlipayClient defaultAlipayClient() {
        /**
         *String serverUrl,
         * String appId,
         * String privateKey,
         * String format,
         * String charset,
         * String alipayPublicKey,
         * String signType
         */
        AlipayClient client = new DefaultAlipayClient(GATEWAY_URL, APP_ID, APP_PRIVATE_KEY, FORMAT, CHARSET, ALIPAY_PUBLIC_KEY, SIGN_TYPE);
        return client;

    }


}
