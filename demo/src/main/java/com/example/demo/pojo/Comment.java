package com.example.demo.pojo;

import java.util.Date;

import lombok.Data;

@Data
public class Comment {
    private Integer commentId;
    private Integer memberId;
    private Date commentTime;
    private String commentContent;
}
