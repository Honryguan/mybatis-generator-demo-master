package com.gg.bean;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Builder;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

/**
* @author honry.guan
* @created Time: 2020-04-05 05:51:07
*/
@ApiModel(value="com.gg.bean.SysUser",description="")
@Data
@Builder
public class SysUser {
    @ApiModelProperty(value="",name="id")
    private Integer id;

    @ApiModelProperty(value="",name="name")
    @Length(max = 50, message = "名长度最长为50")
    private String name;

    @ApiModelProperty(value="",name="age")
    private Integer age;

    @ApiModelProperty(value="",name="createTime")
    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss",timezone="GMT+8")
    private Date createTime;

    @ApiModelProperty(value="",name="password")
    @Length(max = 50, message = "名长度最长为50")
    private String password;
}