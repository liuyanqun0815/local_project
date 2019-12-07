package com.liuyanqun.localproject.controller;


import com.liuyanqun.localproject.entity.SysUser;
import com.liuyanqun.localproject.service.impl.SysUserServiceImpl;
import io.swagger.annotations.Api;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author lyq
 * @since 2019-11-19
 */
@RestController
@RequestMapping("/sysUser")
@Api(value = "Swagger  Control", description = "对外提供用户接口", tags = "Swagger Test Control Tag")
public class SysUserController {


    @Autowired
    private SysUserServiceImpl sysUserService;

    @GetMapping("/queryById")
    public SysUser queryUserById(@RequestParam("uid")String uid){
        return sysUserService.queryUserByUid(uid);
    }

    @GetMapping("/byId")
    public SysUser queryById(@RequestParam("uid")String uid){
        return sysUserService.queryById(uid);
    }

}
