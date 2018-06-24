package com.contribute.common.enums;

/**
 * @Author: Lijie
 * @Date: 2018/6/19 16:54
 */
public enum UserLoginEnum {

    LOGIN_SUCCESS(101, "登录成功"), LOGIN_FAILED(102, "账号或密码错误"), REGISTER_FAILED(103,"注册失败"),
    REGISTER_ECHO(104,"账号已经存在"), SYSTEM_ERROR(105,"系统错误");
    //错误码
    private int state;
    //错误码描述
    private String stateMessage;

    UserLoginEnum(int state,String stateMessage){
        this.state = state;
        this.stateMessage = stateMessage;
    }
    public int getState() {
        return state;
    }

    public String getStateMessage() {
        return stateMessage;
    }

    public static UserLoginEnum userLoginState(int index){
        for (UserLoginEnum state:values()) {
            if (state.getState() == index){
                return state;
            }
        }
        return null;
    }

}
