package com.liuyanqun.localproject.handler;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @description:
 * @author: lyq
 * @createDate: 2019/12/6
 */

//@Component
public class HandlerContext  {

    private static   Map<String,Class> handlerMap;

//    public void setHandlerMap(Map<String, Class> handlerMap) {
//        HandlerContext.handlerMap = handlerMap;
//    }
//

    public HandlerContext(Map<String, Class> handlerMap) {
        HandlerContext.handlerMap = handlerMap;
    }

    public AbstractHandler getInstance(String type){
        Class clazz = handlerMap.get(type);
        if (clazz == null){
            throw new IllegalArgumentException("参数异常");
        }
        return (AbstractHandler)SpringContextUtils.getBean(clazz);
    }
}
