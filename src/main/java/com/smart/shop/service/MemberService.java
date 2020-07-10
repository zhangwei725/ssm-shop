package com.smart.shop.service;

import com.smart.shop.domain.dto.MemberDto;
import com.smart.shop.domain.entity.Member;

import java.util.List;

public interface MemberService {
    List<Member> findAll(MemberDto memberDto, int page, int size);

    int updateMember(MemberDto memberDto);

}
