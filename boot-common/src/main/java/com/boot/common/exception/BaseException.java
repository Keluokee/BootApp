package com.boot.common.exception;

import lombok.Data;

@Data
public class BaseException extends RuntimeException {

    private int code = 500;

    private String message;

    public BaseException(String message) {
        this.message = message;
    }

    public BaseException(int code, String message) {
        this.code = code;
        this.message = message;
    }

}
