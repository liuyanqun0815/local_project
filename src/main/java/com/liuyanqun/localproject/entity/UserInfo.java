package com.liuyanqun.localproject.entity;

import com.alibaba.fastjson.JSONObject;
import com.liuyanqun.localproject.reflact.BeanCovertUtils;
import lombok.Data;
import org.apache.catalina.User;

import java.io.Serializable;
import java.util.Map;

/**
 * @description:
 * @author: lyq
 * @createDate: 2019/12/6
 */

@Data
public class UserInfo extends BeanCovertUtils implements Serializable{

    private String name="姓名";

    private String age="年龄";

    private String email="邮箱";

    private String sex="性别";


    public  void Conver() throws Exception{
        String str = "{\"name\":\"liuyanqun\",\"age\":\"190\",\"email\":\"liuyanqun@meicai.cn\",\"sex\":\"1\"}";
        UserUtil info = new UserUtil();
        info.setAge("12");
        info.setName("feizi");
        info.setEmail("liuyanqun@meicai.cn");
        info.setSex("1");
//        UserInfo.super.Conver2Dto(str);
        Map map = UserInfo.super.Cover2Map(info);
        System.out.println(JSONObject.toJSONString(map));
    }

    public static void main(String[] args) throws Exception{
        UserInfo info = new UserInfo();
        info.Conver();
    }
}
