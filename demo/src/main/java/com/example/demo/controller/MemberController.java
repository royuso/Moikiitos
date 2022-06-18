package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.service.MemberService;

public class MemberController {

    private MemberService memberService;

    @Autowired
    public MemberController (MemberService memberService) {
        this.memberService = memberService;
    }
}
