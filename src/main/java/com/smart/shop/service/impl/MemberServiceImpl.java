package com.smart.shop.service.impl;

import com.smart.shop.domain.dto.MemberDto;
import com.smart.shop.domain.entity.Member;
import com.smart.shop.domain.entity.MemberDetail;
import com.smart.shop.mapper.MemberDetailMapper;
import com.smart.shop.mapper.MemberMapper;
import com.smart.shop.service.MemberService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * 不考虑维护
 * 纯粹实现功能
 */
@Service
public class MemberServiceImpl implements MemberService {
    @Resource
    MemberMapper memberMapper;
    @Resource
    MemberDetailMapper memberDetailMapper;

    @Override
    public List<Member> findAll(MemberDto memberDto, int page, int size) {
        List<Member> members = memberMapper.selectAll(memberDto.getKeyword(), memberDto.getCreateDate(), (page - 1) * size, size);
        return members;
    }

    /**
     * 更新会员信息
     *
     * @param memberDto 更新的用户信息
     * @return
     */
    // dto ---> entity
    @Override
    @Transactional
    public int updateMember(MemberDto memberDto) {
        // 更新主表数据
        Member member = new Member();
        /*
         * 等价于  member.setUserName(memberDto.getUsername)
         */
        // 参数一  要拷贝的对象  dto
        // 参数二  目标对象    entity
        BeanUtils.copyProperties(memberDto, member);
        int count = memberMapper.updateByPrimaryKeySelective(member);
        //保存子表数据
        //会员性情的信息更新
        MemberDetail memberDetail = new MemberDetail();
        BeanUtils.copyProperties(memberDto.getDetailDto(), memberDetail);
        memberDetailMapper.updateByPrimaryKeySelective(memberDetail);
        return count;
    }
}
