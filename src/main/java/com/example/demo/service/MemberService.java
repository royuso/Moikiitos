package com.example.demo.service;

import java.util.List;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.demo.pojo.Member;
import com.example.demo.pojo.vo.MemberVo;

public interface MemberService {

    int addMember(Member member);
    Member findMemberByName(String memberName);
    IPage<MemberVo> findFollower(IPage<MemberVo> memberVo, Integer mermberId);
    IPage<MemberVo> findFollowing(IPage<MemberVo> memberVo, Integer mermberId);

}
