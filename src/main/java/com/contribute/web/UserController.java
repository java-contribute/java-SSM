package com.contribute.web;

import com.contribute.dto.Result;
import com.contribute.entity.User;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.contribute.service.UserService;


/**
 * @Author: Lijie
 * @Date: 2018/6/22 10:49
 */
@Controller
@RequestMapping("/user")
public class UserController {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);
    @Autowired
    private UserService userService;
    //用户注册
    @ResponseBody
    @RequestMapping(value = "/register", method = RequestMethod.POST, produces = {
            "application/json; charset=utf-8" })
    private Result UserRegister(@RequestBody User user){
        System.out.println(user);
        LOGGER.debug("username:{}",user.getUserName());
        try {
            System.out.println(user);
            LOGGER.debug("username:{}",user.getUserName());
            Result result = new Result(true, userService.userRegister(user));
            LOGGER.debug("resultRegister:{}", result);
            return result;
        } catch (Exception ex) {
            return new Result(false,ex);
        }
    }
    //用户登录
    @ResponseBody
    @RequestMapping(value = "/login", method = RequestMethod.POST, produces = {
            "application/json; charset=utf-8" })
    private Result userLogin(@RequestBody User user) throws Exception {
        try {
            Result result = new Result(true, userService.userLogin(user));
            LOGGER.info("resultLogin:{}", result);
            return result;
        } catch (Exception ex) {
            return new Result(false,ex);
        }
    }
    //用户列表
    @ResponseBody
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    private Result userList() throws Exception {
        try {
            Result result = new Result(true, userService.userQueryAll());
            LOGGER.info("resultList:{}", result);
            return result;
        } catch (Exception ex) {
            return new Result(false,ex);
        }
    }
    //查看用户信息
    @ResponseBody
    @RequestMapping(value = "/{userName}/detail",method = RequestMethod.GET)
    private Result userDetail(@PathVariable("userName") String userName) {
        if (StringUtils.isEmpty(userName) || userName == "")
            return new Result(false, null);
        Result result = new Result(true, userService.userDetail(userName));
        LOGGER.info("resultDetail:{}", result);
        return result;
    }
}
