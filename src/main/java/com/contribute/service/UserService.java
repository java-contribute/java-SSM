package com.contribute.service;

import com.contribute.dto.UserLoginExecution;
import com.contribute.entity.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author: Lijie
 * @Date: 2018/6/19 16:44
 * 用户登录、注册服务层
 */
public interface UserService {
    /**
     * 用户注册
     * @param user
     * @return
     */
    @Transactional
    UserLoginExecution userRegister(User user);

    /**
     * 用户登录
     * @param user
     * @return
     */
    UserLoginExecution userLogin(User user);

    /**
     * 查看所有用户
     * @return
     */
    List<User> userQueryAll();

    /**
     * 用户详情
     * @param userName
     * @return
     */
    UserLoginExecution userDetail(String userName);


    boolean userDelete(String userName);
}
