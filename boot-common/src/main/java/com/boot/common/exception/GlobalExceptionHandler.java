package com.boot.common.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.boot.common.web.ResponseResult;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@ControllerAdvice
public class GlobalExceptionHandler {

    /**
     * 处理所有未捕获的异常
     */
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public ResponseResult<String> handleException(Exception ex) {
        log.error("Unexpected error occurred: ", ex);
        return ResponseResult.error("Internal Server Error");
    }

    @ExceptionHandler(BaseException.class)
    @ResponseBody
    public ResponseResult<String> handleBaseException(BaseException ex) {
        return ResponseResult.failure(ex.getCode(), ex.getMessage());
    }

}