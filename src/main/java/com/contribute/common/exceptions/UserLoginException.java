package com.contribute.common.exceptions;

/**
 * @Author: Lijie
 * @Date: 2018/6/19 16:54
 */

/**
 * 用户登录/注册 异常
 */
public class UserLoginException extends RuntimeException {

    public UserLoginException(String message){
        super(message);
    }
    public UserLoginException(String message, Throwable cause){
        super(message,cause);
    }
}
