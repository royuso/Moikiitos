package com.example.demo.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.mapper.CommentMapper;
import com.example.demo.pojo.Comment;
import com.example.demo.pojo.vo.CommentVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.pojo.Result;
import com.example.demo.service.CommentService;
import com.example.demo.service.MemberService;

import java.time.LocalDateTime;

@RestController
@RequestMapping("param")
public class CommentController {
    private CommentService commentService;
    private MemberService memberService;

    @Autowired
    public CommentController(CommentService commentService, MemberService memberService) {
        this.commentService = commentService;
        this.memberService = memberService;
    }

    @PostMapping("/comment")
    public Result addComment(CommentVo commentVo) {
        Comment comment = new Comment();
        BeanUtils.copyProperties(commentVo, comment);
        comment.setCommentTime(LocalDateTime.now());
        int result = commentService.addComment(comment);
        if (result == 1) {
            return Result.success(comment);
        } else {
            return Result.error(comment);
        }
    }

    @GetMapping("/comment")
    public Result listComment(Integer pageCurrent, Integer pageSize, Integer memberId) {
        IPage<CommentVo> page = new Page<>();
        page.setSize(pageSize);
        page.setCurrent(pageCurrent);
        IPage<CommentVo> commentPage = commentService.findCommentByMemberId(page, memberId);
        return Result.success(commentPage);
    }

    @DeleteMapping("/comment")
    public Result deleteComment(Integer commentId, Integer memberId) {
        int result = commentService.deleteCommentById(commentId, memberId);
        if (result == 1) {
            return Result.success(result);
        } else {
            return Result.error(result);
        }
    }
}
