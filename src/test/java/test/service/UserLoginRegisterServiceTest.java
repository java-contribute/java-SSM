package test.service;

import com.contribute.entity.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import com.contribute.service.UserLoginRegisterService;
import test.BaseServiceTest;


/**
 * @Author: Lijie
 * @Date: 2018/6/20 13:22
 */
public class UserLoginRegisterServiceTest extends BaseServiceTest {

    @Autowired
    private UserLoginRegisterService userLoginRegisterService;

    @Test
    public void userRegisterTest(){
        User user = new User();
        user.setUserName("xiYanLi");
        user.setUserPassword("123456");
        user.setUserEmail("xiyanli@xiyan.com");
        user.setUserNumber("18401234213");
        System.out.println(userLoginRegisterService.userRegister(user));
    }
    @Test
    public void userLoginTest(){
        User user = new User();
        user.setUserName("xiYan");
        user.setUserPassword("123456");
        System.out.println(userLoginRegisterService.userLogin(user));
    }
}
