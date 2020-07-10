package com.smart.shop.controller;

import com.smart.shop.domain.dto.MemberDto;
import com.smart.shop.domain.entity.Member;
import com.smart.shop.service.MemberService;
import com.smart.shop.utils.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/admin/member")
public class MemberController {
    @Resource
    MemberService memberService;

    /**
     * 根据用户名 手机号或者时间进行分页查询
     * 对数据进行校验
     */
    @GetMapping("/list")
    public ResponseEntity<List<Member>> list(MemberDto memberDto, @RequestParam(defaultValue = "1") int page, @RequestParam(defaultValue = "10") int size) {
        List<Member> members = memberService.findAll(memberDto, page, size);
        return ResponseEntity.success(members);
    }

    /**
     * @return
     */
    @PostMapping("/list")
    public ResponseEntity<Member> update(@RequestBody MemberDto memberDto) {

        return null;
    }

    /**
     * 添加对象
     *
     * @return
     */
    @PostMapping("/add")
    public ResponseEntity<Member> add() {
        return null;
    }

    @PostMapping("/batch")
    public ResponseEntity<Member> batchDel() {
        return null;
    }

    /**
     * @param id
     * @return
     */
    @PostMapping("/del")
    public ResponseEntity<Member> delete(int id) {
        return null;
    }

    @PostMapping("/active")
    public ResponseEntity<Member> active() {
        return null;
    }

}
