package com.example.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.demo.pojo.Comment;
import com.example.demo.pojo.vo.CommentVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentMapper extends BaseMapper<Comment> {
    IPage<CommentVo> selectCommentWithMember(IPage<CommentVo> commentVos, @Param("commentId") Integer commentId);
}
