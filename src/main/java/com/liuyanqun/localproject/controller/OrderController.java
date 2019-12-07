package com.liuyanqun.localproject.controller;

import com.liuyanqun.localproject.demo.HandlerOperate;
import com.liuyanqun.localproject.entity.OrderDTO;
import com.liuyanqun.localproject.service.impl.OrderServiceV2Impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: lyq
 * @createDate: 2019/12/6
 */

@RestController
public class OrderController {

    @Autowired
    HandlerOperate operate;
    @Autowired
    private OrderServiceV2Impl orderServiceV2;

    @RequestMapping("/getOrderType")
    public String getOrderType(){
        OrderDTO dto = new OrderDTO();
        dto.setCode("11");
        dto.setPrice(120L);
        dto.setType("1");
       return orderServiceV2.handle(dto);
    }

    @RequestMapping("/getUserInfo")
    public String getUerInfo(){
        return orderServiceV2.queryUserBean();
    }
    @RequestMapping("/getResouce")
    public String getResouce(@RequestParam("id")String id){
        return operate.getInstance(id);
    }
}
