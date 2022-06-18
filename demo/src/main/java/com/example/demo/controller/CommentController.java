package com.example.demo.controller;

public class CommentController {
    private CommentService commentService;
    private MemberService memberService;


    @Autowired
    public CommentController(CommentService commentService, MemberService memberService) {
        this.commentService = commentService;
        this.memberService = memberService;
    }


    
}
