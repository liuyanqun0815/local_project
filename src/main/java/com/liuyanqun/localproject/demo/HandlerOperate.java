package com.liuyanqun.localproject.demo;

import com.alibaba.fastjson.JSONObject;
import com.liuyanqun.localproject.annotion.celv.CommonHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @description:
 * @author: lyq
 * @createDate: 2019/12/7
 */
@Component
public class HandlerOperate {


    @Autowired
    private static   Map<String,strategy> map = new HashMap<>();

//    @Autowired
    public HandlerOperate(Map<String, strategy> strategyMap){
        HandlerOperate.map.clear();
        strategyMap.forEach((k,v)->map.put(k,v));
    }
    public String getInstance(String type){
        strategy strategy =(strategy) map.get(type);
        return strategy.getUid(type);
    }

//    public HandlerOperate(List<strategy> list){
//        System.out.println(JSONObject.toJSONString(list));
//    }
}
