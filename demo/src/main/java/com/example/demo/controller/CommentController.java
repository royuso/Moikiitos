package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.pojo.Result;
import com.example.demo.service.CommentService;
import com.example.demo.service.MemberService;

@RestController
@RequestMapping('param')
public class CommentController {
    private CommentService commentService;
    private MemberService memberService;

    @Autowired
    public CommentController(CommentService commentService, MemberService memberService) {
        this.commentService = commentService;
        this.memberService = memberService;
    }

    @PostMapping("/comment")
    public Result addComment(){}

    @GetMapping("/comment")
    public Result listComment(){}
    
    @DeleteMapping("/comment")
    public Result deleteComment(){}
}
