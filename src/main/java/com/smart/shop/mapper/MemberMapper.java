package com.smart.shop.mapper;

import com.smart.shop.domain.entity.Member;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MemberMapper {
    int deleteByPrimaryKey(Long memberId);

    int insert(Member record);

    int insertSelective(Member record);

    Member selectByPrimaryKey(Long memberId);

    int updateByPrimaryKeySelective(Member record);

    /**
     * @param keyword 搜索关键字
     * @param limit   起始索引
     * @param offset  返回多少条
     * @return
     */
    List<Member> selectAll(@Param("keyword") String keyword, @Param("createDate") String createDate, @Param("limit") int limit, @Param("offset") int offset);
}