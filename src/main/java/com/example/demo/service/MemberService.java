package com.example.demo.service;

import java.util.List;

import com.example.demo.pojo.Member;
import com.example.demo.pojo.vo.MemberVo;

public interface MemberService {
    Member findMemberByName(String memberName);
    List<MemberVo> findFollowerList(List<MemberVo> memberVos, Integer mermberId);
    List<MemberVo> findFollowingList(List<MemberVo> memberVos, Integer mermberId);

}
