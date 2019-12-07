package com.liuyanqun.localproject.handler;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: lyq
 * @createDate: 2019/12/7
 */

@Component
public class SpringUtils implements BeanFactoryPostProcessor {

    private static ConfigurableListableBeanFactory baeanFactory;
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        SpringUtils.baeanFactory = configurableListableBeanFactory;
        System.out.println(baeanFactory);
    }

    public static Object getBean(Class clazz){
        return baeanFactory.getBean(clazz);
    }

    public static Object getBean(String name){
        return baeanFactory.getBean(name);
    }
}
