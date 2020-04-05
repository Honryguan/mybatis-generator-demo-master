package com.gg.bean;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Builder;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

/**
* @author honry.guan
* @created Time: 2020-04-05 02:33:22
*/
@Data
@Builder
public class Tally {
    @ApiModelProperty(value="",name="id")
    private Integer id;

    @ApiModelProperty(value="",name="createTime")
    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss",timezone="GMT+8")
    private Date createTime;

    @ApiModelProperty(value="",name="typeId")
    private Integer typeId;

    @ApiModelProperty(value="",name="money")
    private Integer money;

    @ApiModelProperty(value="",name="remark")
    @Length(max = 20, message = "名长度最长为20")
    private String remark;

    @ApiModelProperty(value="",name="accountId")
    private Integer accountId;
}