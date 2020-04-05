package ${package_impl};

import ${package_mapper}.${file_name}Mapper;
import ${package_service}.${file_name}Service;
import ${package_bean}.${file_name};
import ${package_vo}.${file_name}Vo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* @author honry.guan
* @created Create Time: ${date?string('yyyy-MM-dd hh:mm:ss')}
*/
@Service
@Transactional(readOnly = true, rollbackFor = Exception.class)
public class ${file_name}ServiceImpl implements ${file_name}Service {
    @Autowired
    private ${file_name}Mapper ${file_name?uncap_first}Mapper;

    @Override
    public int add${file_name}(${file_name} ${file_name?uncap_first}) {
        return ${file_name?uncap_first}Mapper.insert(${file_name?uncap_first});
    }
    
    @Override
    public int add${file_name}Vo(${file_name}Vo ${file_name?uncap_first}Vo) {
        return 0;
    }
    
    @Override
    public int update${file_name}Vo(${file_name}Vo ${file_name?uncap_first}Vo) {
        return 0;
    }
    
    @Override
    public int update${file_name}(${file_name} ${file_name?uncap_first}) {
        return ${file_name?uncap_first}Mapper.updateByPrimaryKeySelective(${file_name?uncap_first});
    }
    
    @Override
    public int del${file_name}ById(Integer id) {
        return ${file_name?uncap_first}Mapper.deleteByPrimaryKey(id);
    }
    
    @Override
    public ${file_name} get${file_name}ById(Integer id) {
        return ${file_name?uncap_first}Mapper.selectByPrimaryKey(id);
    }

}
