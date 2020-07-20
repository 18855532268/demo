package com.example.manage.exception;

/**
 * 程序错误信息
 *
 * @author zhangjicheng
 */
public class ErrorMessageException extends RuntimeException {
    public ErrorMessageException(String message) {
        super(message);
    }
}
