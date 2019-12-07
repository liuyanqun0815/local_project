package com.liuyanqun.localproject.handler;

import com.liuyanqun.localproject.entity.UserInfo;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: lyq
 * @createDate: 2019/12/7
 */
@Component
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

//        beanFactory.getBeanNamesForAnnotation()

//        ObjectProvider<UserInfo> beanProvider = beanFactory.getBeanProvider(UserInfo.class);
//        System.out.println(beanProvider);
//        UserInfo ifAvailable = beanProvider.getIfAvailable();
//        BeanDefinition bean = beanFactory.getBeanDefinition("orderService");
//        bean.getPropertyValues().add("tel","199");
//        bean.getPropertyValues().add("home","china");
//        bean.setScope(BeanDefinition.SCOPE_SINGLETON);
//        beanFactory.getBean("user",UserInfo.class);

//        beanFactory.getBeanDefinition()
//        String[] beans = beanFactory.getBeanDefinitionNames();
//        for(String bean: beans){
//            System.out.println(bean);
//            BeanDefinition beanDefinition = beanFactory.getBeanDefinition(bean);
//            System.out.println(beanDefinition);
//            String beanClassName = beanDefinition.getBeanClassName();
////            beanDefinition.getp
//
//        }
//        BeanDefinitionBuilder beanDefinitionBuilder = BeanDefinitionBuilder.genericBeanDefinition(UserInfo.class);
//        beanDefinitionBuilder.addPropertyValue("name","liuyanqun");
//        beanDefinitionBuilder.addPropertyValue("age","10");
//
//        BeanDefinition beanDefinition = BeanDefinitionBuilder.genericBeanDefinition(UserInfo.class).getBeanDefinition();
//        beanDefinition.getPropertyValues().add("name","qunzi");
//        beanDefinition.getPropertyValues().add("email","qunzi@meicai.cn");
//
//        beanFactory.registerSingleton("user1",beanDefinitionBuilder.getBeanDefinition().getBeanClass());
//        beanFactory.registerSingleton("user2",beanDefinition);
    }
}
