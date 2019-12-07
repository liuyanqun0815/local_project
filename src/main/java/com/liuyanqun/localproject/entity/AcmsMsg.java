package com.liuyanqun.localproject.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
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
 * @since 2019-12-05
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="AcmsMsg对象", description="")
public class AcmsMsg implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "消息类型（标识消息处理的业务类型（人员、组织、部门、邮件））")
    private String msgType;

    @ApiModelProperty(value = "消息内容")
    private String msgContent;

    @ApiModelProperty(value = "消息状态(-1--未处理    0--处理失败    1--处理成功)")
    private Integer msgState;

    @ApiModelProperty(value = "消息处理失败信息")
    private String msgFailMsg;

    @ApiModelProperty(value = "是否忽略消息(忽略消息不在处理  0-- 不忽略 1--忽略 )")
    private String msgIgnore;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "修改时间")
    private LocalDateTime modifTime;

    @ApiModelProperty(value = "任务类型（人员消息--user、邮件消息--email、组织消息-org、部门消息--dept）")
    private String workType;

    @ApiModelProperty(value = "消息keys")
    private String messagekey;


}
