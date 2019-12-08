package com.liuyanqun.localproject.webConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * @description:
 * @author: lyq
 * @createDate: 2019/12/8
 */
@Component
public class MvcConfig extends WebMvcConfigurationSupport {

    @Autowired
    private MyInterceptor myInterceptor;

//        void addResourceHandlers(ResourceHandlerRegistry registry);
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/");
    };

    /**
     *
     * 功能描述:
     *  配置静态资源,避免静态资源请求被拦截
     * @auther: Tt(yehuawei)
     * @date:
     * @param:
     * @return:
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**")
                .addResourceLocations("classpath:/static/");
        registry.addResourceHandler("/templates/**")
                .addResourceLocations("classpath:/templates/");
        super.addResourceHandlers(registry);
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(myInterceptor).addPathPatterns("/project/**","/test/*");

        super.addInterceptors(registry);
    }

}
