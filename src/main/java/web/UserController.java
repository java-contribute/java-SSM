package web;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import dto.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import service.UserLoginService;


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
    @RequestMapping(value = "/list" ,method = RequestMethod.GET)
    private String UserList(){
        Result result = new Result();
        result.setData(userLoginService.userQueryAll());
        return JSON.toJSONString(result,SerializerFeature.WriteMapNullValue);
    }
}
