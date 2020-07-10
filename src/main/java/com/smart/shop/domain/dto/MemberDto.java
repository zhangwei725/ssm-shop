package com.smart.shop.domain.dto;

import lombok.Data;

import java.util.Date;

/**
 * 接受客服端传递的参数
 */
@Data
public class MemberDto {

    // 查询的关键字  手机号 用户名 邮箱
    private String keyword;
    private Long memberId;
    private String username;
    private String phone;
    private String email;
    private String createDate;
    // 关联的详细信息
    private MemberDetailDto detailDto;

}
