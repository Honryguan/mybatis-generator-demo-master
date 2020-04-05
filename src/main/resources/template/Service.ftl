package ${package_service};
import java.util.Map;
import ${package_bean}.${file_name};
import ${package_vo}.${file_name}Vo;
/**
* @author honry.guan
* @created Create Time: 2019/1/9
*/
public interface ${file_name}Service {

    int add${file_name}(${file_name} ${file_name?uncap_first});

    int add${file_name}Vo(${file_name}Vo ${file_name?uncap_first}Vo);

    int update${file_name}Vo(${file_name}Vo ${file_name?uncap_first}Vo);

    int update${file_name}(${file_name} ${file_name?uncap_first});

    int del${file_name}ById(Integer id);

    ${file_name} get${file_name}ById(Integer id);

}
