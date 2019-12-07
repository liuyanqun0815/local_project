package com.liuyanqun.localproject.annotion.celv;

import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: lyq
 * @createDate: 2019/12/7
 */
@Component
public class SpecialHandler extends CommonHandler {
    @Override
    public String handler() {
        return "特殊处理";
    }
}
