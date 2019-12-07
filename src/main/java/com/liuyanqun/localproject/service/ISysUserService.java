package com.liuyanqun.localproject.service;

import com.liuyanqun.localproject.entity.SysUser;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author lyq
 * @since 2019-11-19
 */
public interface ISysUserService extends IService<SysUser> {

   SysUser queryUserByUid(String uid);

   SysUser queryById(String uid);
}
