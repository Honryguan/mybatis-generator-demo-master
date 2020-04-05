package ${package_controller};

import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ${package_service}.${file_name}Service;


import ${package_bean}.${file_name};
import ${package_vo}.${file_name}Vo;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;

import com.gg.service.${file_name}Service;
/**
* @author honry.guan
* @created Create Time: ${date?string('yyyy-MM-dd hh:mm:ss')}
*/
@RestController
@RequestMapping("/${file_name?uncap_first}")
@CrossOrigin
@Api(description = "${file_name}相关的api")
public class ${file_name}Controller {

    @Autowired
    public ${file_name}Service ${file_name?uncap_first}Service;

    @RequestMapping("/get${file_name}ByPage")
    public BaseResult get${file_name}ByPage(@RequestParam("pageNum") Integer pageNum, @RequestParam("pageSize") Integer pageSize, @RequestParam(value = "sortType", required = false) String sortType) {
        return BaseResult.ok();
    }

    @RequestMapping("/get${file_name}ById")
    public BaseResult get${file_name}ById(@RequestParam("id") Integer id) {
        ${file_name} ${file_name?uncap_first} =  ${file_name?uncap_first}Service.get${file_name}ById(id);
        return BaseResult.ok(${file_name?uncap_first});
    }

    @PutMapping("/update${file_name}")
    public BaseResult update${file_name}(@RequestBody ${file_name}Vo ${file_name?uncap_first}Vo) {
        ${file_name?uncap_first}Service.update${file_name}Vo(${file_name?uncap_first}Vo);
        return BaseResult.ok();
    }

    @PostMapping("/add${file_name}")
    public BaseResult add${file_name}(@RequestBody ${file_name}Vo ${file_name?uncap_first}Vo) {
        ${file_name?uncap_first}Service.add${file_name}Vo(${file_name?uncap_first}Vo);
        return BaseResult.ok();
    }
    @PutMapping("/delete${file_name}ById")
    public BaseResult delete${file_name}ById(@RequestParam("id") Integer id) {
        ${file_name?uncap_first}Service.del${file_name}ById(id);
        return BaseResult.ok();
    }

}