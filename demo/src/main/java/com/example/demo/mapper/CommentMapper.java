package com.example.demo.mapper;

import java.util.List;

import com.example.demo.pojo.vo.CommentVo;
public interface CommentMapper {
    List<CommentVo> selectCommentWithMember(List<CommentVo> commentVos, @Param("commentId")Integer commentId);
}
