package com.example.demo.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.demo.pojo.Comment;
import com.example.demo.pojo.vo.CommentVo;

public interface CommentService {
    int addComment(Comment comment);
    int deleteCommentById(Integer commentId, Integer memberId);
    IPage<CommentVo> findCommentByMemberId(IPage<CommentVo> page, Integer memberId);
}
