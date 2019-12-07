package com.liuyanqun.localproject.handler;

import com.liuyanqun.localproject.entity.UserInfo;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;

/**
 * @description:
 * @author: lyq
 * @createDate: 2019/12/7
 */
public class CustomBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {
    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry beanFactory) throws BeansException {
        BeanDefinitionBuilder beanDefinitionBuilder = BeanDefinitionBuilder.genericBeanDefinition(UserInfo.class);
        beanDefinitionBuilder.addPropertyValue("name","liuyanqun");
        beanDefinitionBuilder.addPropertyValue("age","10");

        BeanDefinition beanDefinition = BeanDefinitionBuilder.genericBeanDefinition(UserInfo.class).getBeanDefinition();
        beanDefinition.getPropertyValues().add("name","qunzi");
        beanDefinition.getPropertyValues().add("email","qunzi@meicai.cn");

        beanFactory.registerBeanDefinition("user1",beanDefinitionBuilder.getBeanDefinition());
        beanFactory.registerBeanDefinition("user2",beanDefinition);
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {

    }
}
