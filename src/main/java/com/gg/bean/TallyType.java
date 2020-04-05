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
@ApiModel(value="com.gg.bean.TallyType",description="")
@Data
@Builder
public class TallyType {
    @ApiModelProperty(value="",name="id")
    private Integer id;

    @ApiModelProperty(value="",name="name")
    @Length(max = 50, message = "名长度最长为50")
    private String name;

    @ApiModelProperty(value="",name="createTime")
    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss",timezone="GMT+8")
    private Date createTime;

    @ApiModelProperty(value="",name="icon")
    @Length(max = 20, message = "名长度最长为20")
    private String icon;

    @ApiModelProperty(value="",name="color")
    @Length(max = 20, message = "名长度最长为20")
    private String color;

    @ApiModelProperty(value="",name="parentid")
    private Integer parentid;
}