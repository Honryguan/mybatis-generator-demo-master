package com.gg.controller;

import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.gg.service.TallyTypeService;
import com.gg.utils.BaseResult;


import com.gg.bean.TallyType;
import com.gg.vo.TallyTypeVo;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;

import com.gg.service.TallyTypeService;
/**
* @author honry.guan
* @created Create Time: 2020-04-05 05:51:07
*/
@RestController
@RequestMapping("/tallyType")
@CrossOrigin
@Api(description = "TallyType相关的api")
public class TallyTypeController {

    @Autowired
    public TallyTypeService tallyTypeService;

    @RequestMapping("/getTallyTypeByPage")
    public BaseResult getTallyTypeByPage(@RequestParam("pageNum") Integer pageNum, @RequestParam("pageSize") Integer pageSize, @RequestParam(value = "sortType", required = false) String sortType) {
        return BaseResult.ok();
    }

    @RequestMapping("/getTallyTypeById")
    public BaseResult getTallyTypeById(@RequestParam("id") Integer id) {
        TallyType tallyType =  tallyTypeService.getTallyTypeById(id);
        return BaseResult.ok(tallyType);
    }

    @PutMapping("/updateTallyType")
    public BaseResult updateTallyType(@RequestBody TallyTypeVo tallyTypeVo) {
        tallyTypeService.updateTallyTypeVo(tallyTypeVo);
        return BaseResult.ok();
    }

    @PostMapping("/addTallyType")
    public BaseResult addTallyType(@RequestBody TallyTypeVo tallyTypeVo) {
        tallyTypeService.addTallyTypeVo(tallyTypeVo);
        return BaseResult.ok();
    }
    @PutMapping("/deleteTallyTypeById")
    public BaseResult deleteTallyTypeById(@RequestParam("id") Integer id) {
        tallyTypeService.delTallyTypeById(id);
        return BaseResult.ok();
    }

}