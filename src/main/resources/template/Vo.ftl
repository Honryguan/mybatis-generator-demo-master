package ${package_vo};

import ${package_domain}.${file_name};
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.Builder;

/**
* @author honry.guan
* @created Create Time:  ${date?string('yyyy-MM-dd hh:mm:ss')}
*/
@ApiModel(description="扩展信息")
@Data
@Builder
public class ${file_name}Vo extends ${file_name} {

}