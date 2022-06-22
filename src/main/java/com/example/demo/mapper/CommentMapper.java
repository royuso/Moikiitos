package com.example.demo.mapper;

import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.demo.pojo.Comment;
import com.example.demo.pojo.vo.CommentVo;
import org.apache.ibatis.annotations.Param;

public interface CommentMapper extends BaseMapper<Comment> {
    IPage<CommentVo> selectCommentWithMember(IPage<CommentVo> commentVos, @Param("commentId")Integer commentId);
}
