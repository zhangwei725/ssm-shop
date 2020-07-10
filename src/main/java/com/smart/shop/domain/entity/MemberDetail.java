package com.smart.shop.domain.entity;

import java.util.Date;
import lombok.Data;

@Data
public class MemberDetail {
    /**
     * 主键
     */
    private Integer memberDetailId;

    /**
     * 性别 1 表示男 2 表示女 3 保密
     */
    private Integer sex;

    /**
     * 地址
     */
    private String city;

    /**
     * 会员表关联外键字段
     */
    private Integer memberId;

    /**
     * 创建时间
     */
    private Date createDate;

    /**
     * 状态1 表示正常 0 表示停用
     */
    private Integer status;
}