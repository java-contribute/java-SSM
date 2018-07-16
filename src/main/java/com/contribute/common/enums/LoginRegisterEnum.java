package com.contribute.common.enums;

/**
 * 登录和注册的枚举
 * @Author: Lijie
 * @Date: 2018/6/19 16:54
 */
public enum LoginRegisterEnum {

    LOGIN_SUCCESS(101, "登录成功"), LOGIN_FAILED(102, "账号或密码错误"),REGISTER_SUCCESS(103,"注册成功"),
    REGISTER_FAILED(104,"注册失败"), REGISTER_ECHO(105,"账号已经存在"), DETAIL_FAILED(106,"查看详情失败"),
    DETAIL_SUCCESS(107,"查看详情成功"), SYSTEM_ERROR(108,"系统错误");
    //错误码
    private int state;
    //错误码描述
    private String stateMessage;

    LoginRegisterEnum(int state, String stateMessage){
        this.state = state;
        this.stateMessage = stateMessage;
    }
    public int getState() {
        return state;
    }

    public String getStateMessage() {
        return stateMessage;
    }

    public static LoginRegisterEnum userLoginRegisterState(int index){
        for (LoginRegisterEnum state:values()) {
            if (state.getState() == index){
                return state;
            }
        }
        return null;
    }
}
