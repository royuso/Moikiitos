package com.example.demo.pojo;

public class Result {
    private Integer status;
    private String msg;
    private Object data;

    public static Result success(Object data) {
        return new Result(data);
    }

    public static Result error(Object data) {
        return new Result(500, "error", data);
    }

    private Result(Object data) {
        this.status = 200;
        this.msg = "OK";
        this.data = data;
    }

    public Result(Integer status, String msg, Object data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }
}
