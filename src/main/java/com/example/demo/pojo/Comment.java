package com.example.demo.pojo;

import java.time.LocalDateTime;
import java.util.Date;

import lombok.Data;

@Data
public class Comment {
    private Integer commentId;
    private Integer memberId;
    private LocalDateTime commentTime;
    private String commentContent;
    private int deleted;
}
