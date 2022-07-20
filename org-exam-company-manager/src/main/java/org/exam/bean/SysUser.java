package org.exam.bean;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
@ApiModel("系统用户")
public class SysUser {

    @ApiModelProperty("主键")
    private Integer id;

    @ApiModelProperty("用户名")
    private String loginName;

    @ApiModelProperty("密码")
    private String password;

    @ApiModelProperty("真实姓名")
    private String realName;

    @ApiModelProperty("角色")
    private Integer roleId;

    @ApiModelProperty("性别")
    private String sex;

    @ApiModelProperty("联系电话")
    private String tel;

    @ApiModelProperty("创建时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

}
