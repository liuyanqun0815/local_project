package com.liuyanqun.localproject.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.liuyanqun.localproject.annotion.celv.CommonHandler;
import com.liuyanqun.localproject.annotion.celv.handlerContext;
import com.liuyanqun.localproject.entity.OrderDTO;
import com.liuyanqun.localproject.entity.UserInfo;
import com.liuyanqun.localproject.handler.AbstractHandler;
import com.liuyanqun.localproject.handler.HandlerContext;
import com.liuyanqun.localproject.handler.SpringContextUtils;
import com.liuyanqun.localproject.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author: lyq
 * @createDate: 2019/12/5
 */

@Service("orderService")
public class OrderServiceV2Impl implements IOrderService {

    @Autowired
    private HandlerContext handlerContext;

    @Autowired
    private com.liuyanqun.localproject.annotion.celv.handlerContext commonHandler;


    @Override
    public String handle(OrderDTO dto) {
        AbstractHandler handler = handlerContext.getInstance(dto.getType());
        return handler.handler(dto);
    }

    @Override
    public String queryUserBean() {
        return commonHandler.getInstance("2");
//        Object user1 = SpringContextUtils.getBean("user1");
//        return JSONObject.toJSONString(user1);
    }
}
