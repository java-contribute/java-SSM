package web;


import dto.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import service.UserLoginService;

/**
 * @Author: Lijie
 * @Date: 2018/6/22 10:49
 */
@Controller
@RequestMapping("/java-SSM/user")
public class UserController {

    private Logger LOGGER = LoggerFactory.getLogger(UserController.class);
    @Autowired
    private UserLoginService userLoginService;


    @RequestMapping(value = "/list" ,method = RequestMethod.GET)
    @ResponseBody
    private Result UserList(){
        Result result = new Result();
        result.setData(userLoginService.userQueryAll());
        return result;
    }
}
