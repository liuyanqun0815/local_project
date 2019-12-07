package com.liuyanqun.localproject.demo;

import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: lyq
 * @createDate: 2019/12/7
 */
@Component
public class ResouceA implements strategy {

    @Override
    public String getUid(String id) {
        return "资源A";
    }
}
