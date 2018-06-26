package com.contribute.web;


import com.contribute.dto.Result;
import com.contribute.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.contribute.service.UserLoginService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author: Lijie
 * @Date: 2018/6/22 10:49
 */
@Controller
@RequestMapping("/user")
public class UserController {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);
    @Autowired
    private UserLoginService userLoginService;
    //用户列表
    @ResponseBody
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    private Result UserList() throws Exception {
        try {
            Result result = new Result(true,userLoginService.userQueryAll());
            LOGGER.info("result:{}", result);
            return result;
        } catch (Exception ex) {
            return new Result(false,ex);
        }
    }
    //用户注册
    @ResponseBody
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    private Result UserRegister(@ModelAttribute User user, HttpServletRequest request,
                                HttpServletResponse responseUser) throws Exception {
        try {
            Result result = new Result(true,userLoginService.userRegister(user));
            LOGGER.info("result:{}", result);
            return result;
        } catch (Exception ex) {
            return new Result(false,ex);
        }
    }
    //用户登录
    @ResponseBody
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    private Result UserLogin(User user) throws Exception {
        try {
            Result result = new Result(true,userLoginService.userLogin(user));
            LOGGER.info("result:{}", result);
            return result;
        } catch (Exception ex) {
            return new Result(false,ex);
        }
    }
}
