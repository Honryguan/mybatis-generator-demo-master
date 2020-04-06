package ${package_controller};

import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import ${package_service}.${file_name}Service;
import com.gg.utils.BaseResult;
import org.springframework.web.bind.annotation.*;
import ${package_bean}.${file_name};
import ${package_vo}.${file_name}Vo;
/**
* @author honry.guan
* @created Create Time: ${date?string('yyyy-MM-dd hh:mm:ss')}
*/
@RestController
@RequestMapping("/${file_name?uncap_first}")
@Api(description = "${file_name}相关的api")
@ApiResponses({
    @ApiResponse(code=201,message="已经创建过，不能重复创建"),
    @ApiResponse(code=204,message="数据不存在"),
    @ApiResponse(code=400,message="请求参数没填好"),
    @ApiResponse(code=401,message="未经许可"),
    @ApiResponse(code=403,message="禁止访问"),
    @ApiResponse(code=404,message="未找到")
})
public class ${file_name}Controller {
    
    @Autowired
    public ${file_name}Service ${file_name?uncap_first}Service;
    
    @GetMapping(value = "/get${file_name}ByPage")
    @ApiOperation(value = "分页查询", notes = "分页必填、都是数字")
    @ApiImplicitParams({
    @ApiImplicitParam(name = "pageNum", value = "页号", required = true, paramType = "query",defaultValue = "1"),
    @ApiImplicitParam(name = "pageSize", value = "每页大小", required = true, paramType = "query",defaultValue = "10"),
    @ApiImplicitParam(name = "sortType", value = "排序", required = true, paramType = "query",defaultValue = "desc")
    })
    public BaseResult get${file_name}ByPage(@RequestParam("pageNum") Integer pageNum, @RequestParam("pageSize") Integer pageSize, String sortType) {
        return BaseResult.ok();
    }
    
    @ApiOperation(value = "通过id查询详情", notes = "id必填")
    @ApiImplicitParams({
    @ApiImplicitParam(name = "id", value = "主键id", required = true, paramType = "path"),
    })
    @GetMapping("/{id}")
    public BaseResult get${file_name}ById(@PathVariable("id") Integer id) {
        ${file_name} ${file_name?uncap_first} = ${file_name?uncap_first}Service.get${file_name}ById(id);
        return BaseResult.ok(${file_name?uncap_first});
    }
    
    @ApiOperation(value = "更新", notes = "更新")
    @ApiImplicitParams({
    @ApiImplicitParam(name = "${file_name?uncap_first}Vo", value = "对象vo", required = true, paramType = "body"),
    })
    @PutMapping("/update${file_name}")
    public BaseResult update${file_name}(@RequestBody ${file_name}Vo ${file_name?uncap_first}Vo) {
        ${file_name?uncap_first}Service.update${file_name}Vo(${file_name?uncap_first}Vo);
        return BaseResult.ok();
    }
    
    @ApiOperation(value = "新增", notes = "新增")
    @ApiImplicitParams({
    @ApiImplicitParam(name = "${file_name?uncap_first}Vo", value = "对象vo", required = true, paramType = "body"),
    })
    @PostMapping("/add${file_name}")
    public BaseResult add${file_name}(@RequestBody ${file_name}Vo ${file_name?uncap_first}Vo) {
        ${file_name?uncap_first}Service.add${file_name}Vo(${file_name?uncap_first}Vo);
        return BaseResult.ok();
    }
    
    @ApiOperation(value = "删除", notes = "通过主键删除")
    @ApiImplicitParams({
    @ApiImplicitParam(name = "id", value = "主键id", required = true, paramType = "path"),
    })
    @DeleteMapping("/{id}")
        public BaseResult delete${file_name}ById(@PathVariable("id") Integer id) {
        ${file_name?uncap_first}Service.del${file_name}ById(id);
        return BaseResult.ok();
    }

}