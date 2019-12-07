package com.liuyanqun.localproject.service;

import com.liuyanqun.localproject.entity.AcmsMsg;
import com.baomidou.mybatisplus.extension.service.IService;
import com.liuyanqun.localproject.entity.OrderDTO;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author lyq
 * @since 2019-12-05
 */
public interface IAcmsMsgService extends IService<AcmsMsg> {

    interface OrderService {
        /**
         * 根据订单不同类型做出不同的处理
         * @param dto
         * @return
         */
        String handle(OrderDTO dto);
    }
}
