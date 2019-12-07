package com.liuyanqun.localproject.reflact;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.liuyanqun.localproject.entity.UserInfo;

import java.io.FileOutputStream;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * @author: lyq
 * @createDate: 2019/12/6
 */
public abstract class BeanCovertUtils<T> {

    public Object conver2T(String content,Class<T> clazz) throws Exception {
//        UserInfo userInfo = new UserInfo();
       Object object = Class.forName( clazz.getName()).newInstance();

        JSONObject contentMap = JSON.parseObject(content);
        Field[] declaredFields = clazz.getDeclaredFields();
        for(Field field :declaredFields){
            field.setAccessible(true);
            field.set(object,contentMap.get(field.getName()));
//            String value = field.get(object).toString();
            System.out.println(field.getName());
        }
        return object;

    }
    public void Conver2Dto(String obj)throws Exception{
        Object object = this.getClass().newInstance();
        obj.getClass().getDeclaredFields();
        Field[] declaredFields = this.getClass().getDeclaredFields();
        for(Field field : declaredFields){
            System.out.println(field);
            field.setAccessible(true);
            Object o = field.get(object);
            field.set(object,null);

        }

    }
    public Map<Object,Object> Cover2Map(Object obj)throws Exception{
        Map<Object,Object> map = new HashMap<>();
        Object object = this.getClass().newInstance();
        Field[] declare = object.getClass().getDeclaredFields();
        JSONObject json = JSONObject.parseObject(JSONObject.toJSONString(obj));
        Field[] declaredFields = obj.getClass().getDeclaredFields();
        for (int i = 0; i < declaredFields.length; i++) {
            declaredFields[i].setAccessible(true);
            declare[i].setAccessible(true);
            if (declare[i].getName().equals(declaredFields[i].getName())){
                map.put(declare[i].get(object),json.getString(declare[i].getName()));
            }
        }
        return map;
    }

    public static void main(String[] args)throws Exception {
//        BeanCovertUtils utils = new BeanCovertUtils();
        String ss = "{\"name\":\"liuyanqun\",\"age\":15}";
//        UserInfo o = (UserInfo)utils.conver2T(ss, UserInfo.class);
//
//        UserInfo parse =(UserInfo) JSON.parse(ss);
//        System.out.println(o);
    }
}
