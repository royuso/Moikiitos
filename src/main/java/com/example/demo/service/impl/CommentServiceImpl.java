package com.example.demo.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.demo.mapper.CommentMapper;
import com.example.demo.pojo.Comment;
import com.example.demo.pojo.vo.CommentVo;
import com.example.demo.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;

public class CommentServiceImpl implements CommentService {
    private CommentMapper commentMapper;

    @Autowired
    public CommentServiceImpl(CommentMapper commentMapper) {
        this.commentMapper = commentMapper;
    }

    @Override
    public int addComment(Comment comment) {
        return commentMapper.insert(comment);
    }

    @Override
    public int deleteCommentById(Integer commentId, Integer memberId) {
        Comment comment = commentMapper.selectById(commentId);
        if (comment==null){
            return 0;
        }
        if (comment.getMemberId().equals(memberId)){
            comment.setDeleted(1);
            return commentMapper.updateById(comment);
        }else {
            return 0;
        }
    }

    @Override
    public IPage<CommentVo> findCommentByMemberId(IPage<CommentVo> page, Integer memberId) {
        return commentMapper.selectCommentWithMember(page,memberId);
    }
}
