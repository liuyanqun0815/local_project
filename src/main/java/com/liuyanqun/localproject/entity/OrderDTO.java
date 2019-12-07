package com.liuyanqun.localproject.entity;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @description:
 * @author: lyq
 * @createDate: 2019/12/5
 */
@Data
public class OrderDTO implements Serializable {
    private String code;

    private long price;
    /**
     * 订单类型
     * 1、普通订单
     * 2、团购订单
     * 3、促销订单
     */
    private String type;
}
