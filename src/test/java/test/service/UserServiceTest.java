package test.service;

import com.contribute.entity.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import com.contribute.service.UserService;
import test.BaseServiceTest;


/**
 * @Author: Lijie
 * @Date: 2018/6/20 13:22
 */
public class UserServiceTest extends BaseServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void userRegisterTest(){
        User user = new User();
        user.setUserName("xiYanLi");
        user.setUserPassword("123456");
        user.setUserEmail("xiyanli@xiyan.com");
        user.setUserNumber("18401234213");
        System.out.println(userService.userRegister(user));
    }
    @Test
    public void userLoginTest(){
        User user = new User();
        user.setUserName("xiYan");
        user.setUserPassword("123456");
        System.out.println(userService.userLogin(user));
    }
    @Test
    public void userDetail(){
        String userName = "lijie";
        System.out.println(userService.userDetail(userName));
    }
}
