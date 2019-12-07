package com.liuyanqun.localproject.handler;

import com.liuyanqun.localproject.annotion.HandlerType;
import com.liuyanqun.localproject.entity.OrderDTO;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: lyq
 * @createDate: 2019/12/5
 */

@Component
@HandlerType("2")
public class GroupHandler extends AbstractHandler {

    @Override
    public String handler(OrderDTO dto) {
        return "处理团购订单";
    }
}
