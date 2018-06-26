package com.contribute.web;


import com.contribute.dto.Result;
import com.contribute.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.contribute.service.UserLoginService;

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
    @RequestMapping(value = "/register", method = RequestMethod.GET, consumes = "application/json")
    private Result UserRegister(@RequestBody User user) throws Exception {
        System.out.println(user);
        LOGGER.debug("username:{}",user);
        return null;
//        try {
//            System.out.println(user);
//            LOGGER.debug("username:{}",user.getUserName());
//            Result result = new Result(true,userLoginService.userRegister(user));
//            LOGGER.debug("result:{}", result);
//            return result;
//        } catch (Exception ex) {
//            return new Result(false,ex);
//        }
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
