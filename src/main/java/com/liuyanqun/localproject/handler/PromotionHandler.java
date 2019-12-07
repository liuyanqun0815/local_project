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
@HandlerType("3")
public class PromotionHandler extends AbstractHandler {
    @Override
    public String handler(OrderDTO dto) {
        return "处理促销订单";
    }
}
