package com.example.demo.pojo.vo;

import java.util.Date;

import lombok.Data;

@Data
public class CommentVo {
    private Integer commentId;
    private Integer memberId;
    private Date commentTime;
    private String commentContent;
}