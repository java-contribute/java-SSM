package test.web;

import com.contribute.entity.User;
import org.junit.Before;
import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.transaction.annotation.Transactional;
import test.BaseControllerTest;

import static com.sun.org.apache.xerces.internal.util.PropertyState.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

/**
 * @Author: Lijie
 * @Date: 2018/6/22 11:14
 */
// 配置事务的回滚,对数据库的增删改都会回滚,便于测试用例的循环利用
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = true)
@Transactional
public class UserWebTest extends BaseControllerTest {

    private MockMvc mockMvc;
    private String userList = "/user/list";
    private String userRegister = "/user/register";


    @Before
    public void setup() {
        this.mockMvc = webAppContextSetup(this.webApplicationContext).alwaysExpect(status().isOk()).alwaysDo(print()).build();
    }

    @Test
    public void userList(){
        try {
            this.mockMvc.perform(get(userList));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

//    @Test
//    public void userRegister(){
//        String responseString = null;   //将相应的数据转换为字符串);
//        try {
//            this.mockMvc.perform(post(userRegister) .contentType(MediaType.APPLICATION_FORM_URLENCODED)
//            .param("username","test")
//            .param("userpassword","lijie123")
//            .param("useremail","lijie@lijie.com")
//            .param("usernumber","123458965")
//            ).andExpect(status().isOk())    //返回的状态是200
//                    .andDo(print())         //打印出请求和相应的内容
//                    .andReturn().getResponse().getContentAsString();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

//    }
}
