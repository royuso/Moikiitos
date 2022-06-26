package com.example.demo.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.demo.mapper.MemberMapper;
import com.example.demo.pojo.Member;
import com.example.demo.pojo.vo.MemberVo;
import com.example.demo.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService {

    private final MemberMapper memberMapper;

    @Autowired
    public MemberServiceImpl(MemberMapper memberMapper) {
        this.memberMapper = memberMapper;
    }

    @Override
    public int addMember(Member member) {
        return 0;
    }

    @Override
    public Member findMemberByName(String memberName) {
        return null;
    }

    @Override
    public IPage<MemberVo> findFollower(IPage<MemberVo> memberVo, Integer mermberId) {
        return null;
    }

    @Override
    public IPage<MemberVo> findFollowing(IPage<MemberVo> memberVo, Integer mermberId) {
        return null;
    }
}
