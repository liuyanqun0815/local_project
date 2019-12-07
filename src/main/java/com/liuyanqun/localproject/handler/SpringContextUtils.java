package com.liuyanqun.localproject.handler;

import com.liuyanqun.localproject.annotion.HandlerType;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.Optional;

/**
 * @description:
 * @author: lyq
 * @createDate: 2019/12/6
 */

@Component
//@SuppressWarnings({ "rawtypes", "unchecked" })
public class SpringContextUtils implements ApplicationContextAware {

    private static ApplicationContext applicationContext;

    public SpringContextUtils(ApplicationContext applicationContext) {
        SpringContextUtils.applicationContext = applicationContext;
    }

        @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        SpringContextUtils.applicationContext = applicationContext;

    }
//    public static ApplicationContext getApplicationContext() {
//        return applicationContext;
//    }
    public static Object getBean(String beanId) throws BeansException {
        return applicationContext.getBean(beanId);
    }

    public static Object getBean(Class clazz) throws BeansException {
        return applicationContext.getBean(clazz);
    }

    /**
     * 取得存储在静态变量中的ApplicationContext.
     */
    public static ApplicationContext getApplicationContext() {
        checkApplicationContext();
        return applicationContext;
    }

    private static void checkApplicationContext() {
        if (applicationContext == null) {
            throw new IllegalStateException("applicaitonContext未注入,请在applicationContext.xml中定义SpringContextHolder");
        }
    }
//    public static Map<String ,Object> getbeanwithAnno(){
//          Map<String ,Object> beansWithAnno = applicationContext.getBeansWithAnnotation(HandlerType.class);
//          for (String key : beansWithAnno.keySet()) {
//              HandlerType annotation = AnnotationUtils.findAnnotation(beansWithAnno.get(key).getClass(), HandlerType.class);
//              String value = annotation.value();
//              System.out.println(value);
//          }
//          return beansWithAnno;
//    }

}
