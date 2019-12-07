package com.liuyanqun.localproject.entity;

import java.time.LocalDateTime;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author lyq
 * @since 2019-11-19
 */
@Data
@EqualsAndHashCode
@Accessors(chain = true)
@ApiModel(value="SysUser对象", description="")
public class SysUser implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId
    @ApiModelProperty(value = "用户id")
    private String uid;

    @ApiModelProperty(value = "登录名，不可改")
    private String uname;

    @ApiModelProperty(value = "用户昵称，可改")
    private String nick;

    @ApiModelProperty(value = "已加密的登录密码")
    private String pwd;

    @ApiModelProperty(value = "加密盐值")
    private String salt;

    @ApiModelProperty(value = "是否锁定")
    private Boolean isLock;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime created;

    @ApiModelProperty(value = "修改时间")
    private LocalDateTime updated;


}
