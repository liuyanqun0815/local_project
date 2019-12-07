package com.liuyanqun.localproject.handler;

import com.google.common.collect.Maps;
import com.liuyanqun.localproject.annotion.HandlerType;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/**
 * @description:
 * @author: lyq
 * @createDate: 2019/12/5
 */
@Component
public class HandlerProcessor implements BeanFactoryPostProcessor {

    @Autowired
    private  HandlerContext handlerContext;
   static Map<String,Class> handlerMap = Maps.newHashMapWithExpectedSize(3);


    private static final String HANDLER_PACKAGE = "com.liuyanqun.localproject.handler";
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        String[] beanNamesForAnnotation1 = configurableListableBeanFactory.getBeanNamesForAnnotation(HandlerType.class);
        System.out.println(Arrays.toString(beanNamesForAnnotation1));
        for(String s :beanNamesForAnnotation1) {
            Class<?> type = configurableListableBeanFactory.getType(s);
            HandlerType annotation = type.getAnnotation(HandlerType.class);
            String value = annotation.value();
            System.out.println(type);
            handlerMap.put(value,type);
        }
        HandlerContext context = new HandlerContext(handlerMap);
        configurableListableBeanFactory.registerSingleton(HandlerContext.class.getName(),context);
//        ClassPathBeanDefinitionScanner scanner = new ClassPathBeanDefinitionScanner();
//        Iterator<String> beanNamesIterator = configurableListableBeanFactory.getBeanNamesIterator();
//        while (beanNamesIterator.hasNext()){
//            String next = beanNamesIterator.next();
//            System.out.println(next);
////            beanNamesIterator.
//        }
//        GenericApplicationContext context = new GenericApplicationContext();
//        MyClassPathDefinitonScanner myClassPathDefinitonScanner = new MyClassPathDefinitonScanner(context, HandlerType.class);
//        // 注册过滤器
//        myClassPathDefinitonScanner.registerTypeFilter();
//        int beanCount = myClassPathDefinitonScanner.scan(HANDLER_PACKAGE);
//        context.refresh();
//        String[] beanNamesForAnnotation = context.getBeanNamesForAnnotation(HandlerType.class);
//        System.out.println(beanNamesForAnnotation);
//        for(String s :beanNamesForAnnotation){
//            AbstractHandler bean = (AbstractHandler)context.getBean(s);
//            HandlerType annotation = AnnotationUtils.findAnnotation(bean.getClass(), HandlerType.class);
//            System.out.println(annotation.value());
//            handlerMap.put(annotation.value(),bean.getClass());
//        }
//        HandlerContext con = new HandlerContext(handlerMap);

//        handlerContext.setHandlerMap(handlerMap);
//        handlerMethod();
    }

    private void handlerMethod() {
        ApplicationContext applicationContext = new GenericApplicationContext();
        SpringContextUtils app = new SpringContextUtils(applicationContext);
        ApplicationContext application = SpringContextUtils.getApplicationContext();
//将applicationContext转换为ConfigurableApplicationContext
        ConfigurableApplicationContext configurableApplicationContext = (ConfigurableApplicationContext) applicationContext;

// 获取bean工厂并转换为DefaultListableBeanFactory
        DefaultListableBeanFactory defaultListableBeanFactory = (DefaultListableBeanFactory) configurableApplicationContext.getBeanFactory();
//
        GenericApplicationContext context = new GenericApplicationContext();
        MyClassPathDefinitonScanner myClassPathDefinitonScanner = new MyClassPathDefinitonScanner(context, HandlerType.class);
        // 注册过滤器
        myClassPathDefinitonScanner.registerTypeFilter();
        int beanCount = myClassPathDefinitonScanner.scan(HANDLER_PACKAGE);
        context.refresh();
        String[] beanNamesForAnnotation = context.getBeanNamesForAnnotation(HandlerType.class);
        System.out.println(beanNamesForAnnotation);
        for(String s :beanNamesForAnnotation){
            AbstractHandler bean = (AbstractHandler)context.getBean(s);
            HandlerType annotation = AnnotationUtils.findAnnotation(bean.getClass(), HandlerType.class);
            System.out.println(annotation.value());
            handlerMap.put(annotation.value(),bean.getClass());
        }
        HandlerContext con = new HandlerContext(handlerMap);

// 通过BeanDefinitionBuilder创建bean定义
        BeanDefinitionBuilder beanDefinitionBuilder = BeanDefinitionBuilder.genericBeanDefinition(con.getClass());

// 设置属性userService,此属性引用已经定义的bean:userService,这里userService已经被spring容器管理了.
// beanDefinitionBuilder.addPropertyReference("payClient", "payClient");

// 注册bean
//        defaultListableBeanFactory.registerBeanDefinition(con.getClass(), beanDefinitionBuilder.getRawBeanDefinition());

        Object bean = SpringContextUtils.getBean(con.getClass());
        System.out.println(bean);
    }


}
