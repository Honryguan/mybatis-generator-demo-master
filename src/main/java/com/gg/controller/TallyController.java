package com.gg.controller;

import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.gg.service.TallyService;
import com.gg.utils.BaseResult;


import com.gg.bean.Tally;
import com.gg.vo.TallyVo;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;

import com.gg.service.TallyService;
/**
* @author honry.guan
* @created Create Time: 2020-04-05 05:51:07
*/
@RestController
@RequestMapping("/tally")
@CrossOrigin
@Api(description = "Tally相关的api")
public class TallyController {

    @Autowired
    public TallyService tallyService;

    @RequestMapping("/getTallyByPage")
    public BaseResult getTallyByPage(@RequestParam("pageNum") Integer pageNum, @RequestParam("pageSize") Integer pageSize, @RequestParam(value = "sortType", required = false) String sortType) {
        return BaseResult.ok();
    }

    @RequestMapping("/getTallyById")
    public BaseResult getTallyById(@RequestParam("id") Integer id) {
        Tally tally =  tallyService.getTallyById(id);
        return BaseResult.ok(tally);
    }

    @PutMapping("/updateTally")
    public BaseResult updateTally(@RequestBody TallyVo tallyVo) {
        tallyService.updateTallyVo(tallyVo);
        return BaseResult.ok();
    }

    @PostMapping("/addTally")
    public BaseResult addTally(@RequestBody TallyVo tallyVo) {
        tallyService.addTallyVo(tallyVo);
        return BaseResult.ok();
    }
    @PutMapping("/deleteTallyById")
    public BaseResult deleteTallyById(@RequestParam("id") Integer id) {
        tallyService.delTallyById(id);
        return BaseResult.ok();
    }

}