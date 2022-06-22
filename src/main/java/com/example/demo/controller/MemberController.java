package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.pojo.Result;
import com.example.demo.service.MemberService;

@RestController
@RequestMapping("param")
public class MemberController {

    private MemberService memberService;

    @Autowired
    public MemberController (MemberService memberService) {
        this.memberService = memberService;
    }

    @PostMapping("/register")
    public Result register(){}

    @PostMapping("/login")
    public Result login(){}

    @GetMapping("/follower")
    public Result findFollower(){}


    @GetMapping("/following")
    public Result findFollowing(){}




}
