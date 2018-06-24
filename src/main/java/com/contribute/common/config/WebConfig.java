//package com.contribute.common.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.ViewResolver;
//import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
//import org.springframework.web.servlet.config.annotation.EnableWebMvc;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
//import org.springframework.web.servlet.view.InternalResourceViewResolver;
//
///**
// * @Author: Lijie
// * @Date: 2018/6/22 17:44
// */
//@Configuration
//@EnableWebMvc
//@ComponentScan("com.contribute.web")
//public class WebConfig extends WebMvcConfigurerAdapter {
//
//    //jsp视图解析器
//    @Bean
//    public ViewResolver viewResolver(){
//        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
//        resolver.setPrefix("/WEB-INF/jsp/");
//        resolver.setSuffix(".jsp");
//        resolver.setExposeContextBeansAsAttributes(true);
//        System.out.println("视图解析器");
//        return resolver;
//    }
//
//    /**
//     * 配置静态资源的处理
//     * 将请求交由Servlet处理,不经过DispatchServlet
//     */
//    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer){
//        configurer.enable();
//    }
//
//}
