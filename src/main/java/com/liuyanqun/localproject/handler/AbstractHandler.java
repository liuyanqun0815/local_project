package com.liuyanqun.localproject.handler;

import com.liuyanqun.localproject.entity.OrderDTO;

/**
 * @description:
 * @author: lyq
 * @createDate: 2019/12/5
 */
public abstract class AbstractHandler {

    abstract public String handler(OrderDTO dto);
}
