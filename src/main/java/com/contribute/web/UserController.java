package com.contribute.web;


import com.contribute.dto.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.contribute.service.UserLoginService;

/**
 * @Author: Lijie
 * @Date: 2018/6/22 10:49
 */
@Controller
@RequestMapping("/user")
public class UserController {

    private Logger LOGGER = LoggerFactory.getLogger(UserController.class);
    @Autowired
    private UserLoginService userLoginService;

    @ResponseBody
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    private Result UserList(){
        System.out.println("接口测试1111");
        Result result = new Result();
        result.setData(userLoginService.userQueryAll());
        System.out.println("接口测试2222");
        LOGGER.info("result:{}",result);
        return result;
    }
}
