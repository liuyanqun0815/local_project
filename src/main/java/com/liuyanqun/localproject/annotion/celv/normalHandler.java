package com.liuyanqun.localproject.annotion.celv;

import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: lyq
 * @createDate: 2019/12/7
 */
@Component("normal")
public class normalHandler extends CommonHandler {


    @Override
    public String handler() {
        return "一般方法";
    }
}
