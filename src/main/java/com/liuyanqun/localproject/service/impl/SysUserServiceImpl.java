package com.liuyanqun.localproject.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.liuyanqun.localproject.entity.SysUser;
import com.liuyanqun.localproject.dao.SysUserMapper;
import com.liuyanqun.localproject.service.ISysUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.sql.Wrapper;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lyq
 * @since 2019-11-19
 */
@Service("sysUserService")
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements ISysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public SysUser queryUserByUid(String uid) {
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("uid",uid);

        return sysUserMapper.selectOne(queryWrapper);
    }

    @Override
    public SysUser queryById(String uid) {
        return sysUserMapper.selectById(uid);
    }
}
