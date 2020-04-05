package com.gg.vo;

import com.gg.bean.Tally;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.Builder;

/**
* @author honry.guan
* @created Create Time:  2020-04-05 02:33:22
*/
@ApiModel(description="扩展信息")
@Data
@Builder
public class TallyVo extends Tally {

}