package com.liuyanqun.localproject.annotion.celv;

import com.liuyanqun.localproject.handler.SpringUtils;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * @author: lyq
 * @createDate: 2019/12/7
 */
@Component
public class handlerContext {
  static   Map<String,Class> map = new HashMap<>();

    static {
        map.put("1",normalHandler.class);
        map.put("2",SpecialHandler.class);
    }

    public String getInstance(String type){
        Class o = map.get(type);
        if (o ==null){
            throw new IllegalArgumentException();
        }
        CommonHandler bean =(CommonHandler) SpringUtils.getBean(o);
        return bean.handler();
    }
}
