package test.web;

import com.alibaba.fastjson.JSONObject;
import com.contribute.entity.User;
import org.junit.Before;
import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.transaction.annotation.Transactional;
import test.BaseControllerTest;

import com.alibaba.fastjson.JSON;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

/**
 * @Author: Lijie
 * @Date: 2018/6/22 11:14
 */

/**
 * 配置事务的回滚,对数据库的增删改都会回滚,便于测试用例的循环利用
 * 让我们对数据库的操作会事务回滚，如对数据库的添加操作，在方法结束之后，会撤销我们对数据库的操作。
 * 不方便循环测试，即假如这次我们将一个记录删除了，下次就无法再进行这个Junit测试了，因为该记录已经删除，将会报错。
 * 如果不使用事务回滚，我们需要在代码中显式的对我们的增删改数据库操作进行恢复，将多很多和测试无关的代码
 */
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

    /**
     *  perform：执行一个RequestBuilder请求，会自动执行SpringMVC的流程并映射到相应的控制器执行处理
     *  get:声明发送一个get请求的方法。
     *  param：添加request的参数，比如下面带上code = root的参数。假如使用需要发送json数据格式的时将不能使用这种方式
     */
    @Test
    public void userList(){
        try {

            this.mockMvc.perform(get(userList));
           //.param("code","root");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * contentType需要设置成MediaType.APPLICATION_JSON，即声明是发送“application/json”格式的数据
     * 使用content方法，将转换的json数据放到request的body中。
     * andDo：添加ResultHandler结果处理器，比如调试时打印结果到控制台（对返回的数据进行的判断）；
     * andExpect：添加ResultMatcher验证规则，验证控制器执行完成后结果是否正确（对返回的数据进行的判断）；
     * .isOk()返回的状态是200
     * andReturn：最后返回相应的MvcResult；然后进行自定义验证/进行下一步的异步处理（对返回的数据进行的判断）；
     * .getResponse().getContentAsString(); 将相应的数据转换为字符串
     */
    @Test
    public void userRegister(){
        User user = new User();
        user.setUserName("test");
        user.setUserPassword("lijie123");
        user.setUserEmail("lijie@lijie.com");
        user.setUserNumber("18201234896");
        String userJson = JSONObject.toJSONString(user);
        try {
            this.mockMvc.perform(post(userRegister)
                    .contentType(MediaType.APPLICATION_JSON)
                    .content(userJson))
                    .andDo(print())
                    .andExpect(status()
                    .isOk())
                    .andReturn()
                    .getResponse().getContentAsString();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
