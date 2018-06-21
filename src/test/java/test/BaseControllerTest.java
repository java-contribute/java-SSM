package test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.context.WebApplicationContext;

/**
 * @Author: Lijie
 * @Date: 2018/6/19 16:17
 */
@WebAppConfiguration
@ContextConfiguration({ "classpath:spring/spring-web.xml","classpath:spring/spring-service.xml",
        "classpath:spring/spring-dao.xml" })
public abstract class BaseControllerTest {
    @Autowired
    protected WebApplicationContext webApplicationContext;
}
