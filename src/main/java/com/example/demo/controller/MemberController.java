package com.example.demo.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.pojo.Member;
import com.example.demo.pojo.vo.MemberVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.pojo.Result;
import com.example.demo.service.MemberService;

@RestController
@RequestMapping("param")
public class MemberController {

    private final MemberService memberService;

    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @PostMapping("/register")
    public Result register(Member memberVO) {
        Member member = new Member();
        BeanUtils.copyProperties(memberVO, member);
        int result = memberService.addMember(member);
        if (result == 1) {
            return Result.success("new member added");
        } else {
            return Result.error("fail to add new member");
        }
    }

    @GetMapping("/follower")
    public Result findFollower(Integer pageCurrent, MemberVo memberVo, Integer pageSize) {
        return findRelation(pageCurrent, pageSize, memberVo, 1);
    }


    @GetMapping("/following")
    public Result findFollowing(Integer pageCurrent, MemberVo memberVo, Integer pageSize) {
        return findRelation(pageCurrent, pageSize, memberVo, 0);
    }


    private Result findRelation(Integer pageCurrent, Integer pageSize, MemberVo memberVO, Integer action) {
        Member member = memberService.findMemberByName(memberVO.getMemberName());
        IPage<MemberVo> iPage = new Page<>();
        iPage.setSize(pageSize);
        iPage.setCurrent(pageCurrent);
        IPage<MemberVo> result;
        if (action == 1) {
            result = memberService.findFollower(iPage, member.getMemberId());
        } else {
            result = memberService.findFollowing(iPage, member.getMemberId());
        }
        return Result.success(result);
    }


}
