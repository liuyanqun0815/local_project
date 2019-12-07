package com.liuyanqun.localproject.service;

import com.liuyanqun.localproject.entity.OrderDTO;

public interface IOrderService {
    /**
     * 根据订单的不同类型做出不同的处理
     * @param dto
     * @return
     */
    String handle(OrderDTO dto);

    String queryUserBean();
}
