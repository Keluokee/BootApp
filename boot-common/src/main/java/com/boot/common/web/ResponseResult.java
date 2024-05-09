package com.boot.common.web;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseResult<T> {

    /**
     * 响应码
     */
    private int code;

    /**
     * 响应消息
     */
    private String message;

    /**
     * 响应数据
     */
    private T data;

    /**
     * 构造一个空响应
     *
     * @param code    响应码
     * @param message 响应消息
     */
    public ResponseResult(int code, String message) {
        this(code, message, null);
    }

    /**
     * 构造一个成功响应
     *
     * @param data 响应数据
     */
    public static <T> ResponseResult<T> success(T data) {
        return new ResponseResult<>(200, "Success", data);
    }

    public static <T> ResponseResult<T> success(String message) {
        return new ResponseResult<>(200, message, null);
    }

    /**
     * 构造一个失败响应
     *
     * @param code    响应码
     * @param message 响应消息
     */
    public static <T> ResponseResult<T> failure(int code, String message) {
        return new ResponseResult<>(code, message, null);
    }

    public static <T> ResponseResult<T> error(String message) {
        return new ResponseResult<>(500, message, null);
    }
}