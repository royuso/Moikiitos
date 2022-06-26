package com.example.demo.mapper;

import java.util.List;

import com.example.demo.pojo.vo.MemberVo;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberMapper {
    List<MemberVo> selectFollowerList(List<MemberVo> memberVos, Integer memberId);
    List<MemberVo> selectFollowingList(List<MemberVo> memberVos, Integer memberId);
}
