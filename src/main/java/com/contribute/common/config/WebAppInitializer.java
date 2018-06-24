//package com.contribute.common.config;
//
///**
// * @Author: Lijie
// * @Date: 2018/6/22 17:45
// * web初始化类,替代xml
// * 继承Abs..类后,会同时创建DispatcherServlet和ContextLoaderListener
// * 前提:Servlet3.0
// */
//
//import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
//
//public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
//
//    /**
//     * 配置ContextLoaderListener
//     */
//    @Override
//    protected Class<?>[] getRootConfigClasses() {
//        System.out.println("替代web.xml");
//        return new Class<?>[]{RootConfig.class};
//    }
//
//    /**
//     * 配置DispatcherServlet
//     */
//    @Override
//    protected Class<?>[] getServletConfigClasses() {
//        return new Class<?>[]{WebConfig.class};
//    }
//
//    /**
//     * 配置ServletMappings
//     */
//    @Override
//    protected String[] getServletMappings() {
//        return new String [] {"/"};
//    }
//
//}
