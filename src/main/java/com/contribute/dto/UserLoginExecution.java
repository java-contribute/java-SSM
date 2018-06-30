package com.contribute.dto;

import com.contribute.common.enums.LoginRegisterEnum;
import com.contribute.entity.User;


/**
 *
 * @Author: Lijie
 * @Date: 2018/6/24 21:24
 */
public class UserLoginExecution {
  //登录注册名
   private String userName;
   //登录注册结果状态
   private int state;
   //状态标识
   private  String stateMessage;
   //登录注册成功对象
   private User user;


    public UserLoginExecution(){

    }
    //登录注册失败构造器
    public UserLoginExecution(String userName, LoginRegisterEnum loginRegisterEnum){
        this.userName = userName;
        this.state = loginRegisterEnum.getState();
        this.stateMessage = loginRegisterEnum.getStateMessage();
    }
    //登录注册成功构造器
    public UserLoginExecution(String userName, LoginRegisterEnum loginRegisterEnum, User user){
        this.userName = userName;
        this.state = loginRegisterEnum.getState();
        this.stateMessage = loginRegisterEnum.getStateMessage();
        this.user = user;
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getStateMessage() {
        return stateMessage;
    }

    public void setStateMessage(String stateMessage) {
        this.stateMessage = stateMessage;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "UserLoginExecution{" +
                "userName='" + userName + '\'' +
                ", state=" + state +
                ", stateMessage='" + stateMessage + '\'' +
                ", user=" + user +
                '}';
    }
}
