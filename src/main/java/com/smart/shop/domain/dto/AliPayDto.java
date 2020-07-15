package com.smart.shop.domain.dto;

import lombok.Data;

@Data
public class AliPayDto {
    private String orderNo;
    private String subject;
    private String amount;
}
