package com.smart.shop.service;

import com.smart.shop.domain.dto.MemberDetailDto;
import com.smart.shop.domain.dto.MemberDto;
import com.smart.shop.domain.entity.Member;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-context.xml", "classpath:spring-mybatis.xml", "classpath:spring-tx.xml"})
public class MemberServiceTest {
    @Resource
    MemberService memberService;

    @Test
    public void findAll() {
    }

    @Test
    public void updateMember() {
        MemberDto member = new MemberDto();
        member.setMemberId(1L);
        member.setUsername("admin");
        member.setPhone("123456");
        MemberDetailDto memberDetailDto = new MemberDetailDto();
        memberDetailDto.setCity("深圳 南山");
        memberDetailDto.setSex(3);
        memberDetailDto.setMemberDetailId(1);
        member.setDetailDto(memberDetailDto);
        memberService.updateMember(member);
    }
}