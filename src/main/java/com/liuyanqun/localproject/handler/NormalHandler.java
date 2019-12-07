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
@HandlerType("1")
public class NormalHandler extends AbstractHandler {
    @Override
    public String handler(OrderDTO dto) {
        return "处理简单订单";
    }
}
