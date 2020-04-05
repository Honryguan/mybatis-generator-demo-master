package com.gg.controller;

import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.gg.service.SysUserService;
import com.gg.utils.BaseResult;


import com.gg.bean.SysUser;
import com.gg.vo.SysUserVo;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;

import com.gg.service.SysUserService;
/**
* @author honry.guan
* @created Create Time: 2020-04-05 05:51:07
*/
@RestController
@RequestMapping("/sysUser")
@CrossOrigin
@Api(description = "SysUser相关的api")
public class SysUserController {

    @Autowired
    public SysUserService sysUserService;

    @RequestMapping("/getSysUserByPage")
    public BaseResult getSysUserByPage(@RequestParam("pageNum") Integer pageNum, @RequestParam("pageSize") Integer pageSize, @RequestParam(value = "sortType", required = false) String sortType) {
        return BaseResult.ok();
    }

    @RequestMapping("/getSysUserById")
    public BaseResult getSysUserById(@RequestParam("id") Integer id) {
        SysUser sysUser =  sysUserService.getSysUserById(id);
        return BaseResult.ok(sysUser);
    }

    @PutMapping("/updateSysUser")
    public BaseResult updateSysUser(@RequestBody SysUserVo sysUserVo) {
        sysUserService.updateSysUserVo(sysUserVo);
        return BaseResult.ok();
    }

    @PostMapping("/addSysUser")
    public BaseResult addSysUser(@RequestBody SysUserVo sysUserVo) {
        sysUserService.addSysUserVo(sysUserVo);
        return BaseResult.ok();
    }
    @PutMapping("/deleteSysUserById")
    public BaseResult deleteSysUserById(@RequestParam("id") Integer id) {
        sysUserService.delSysUserById(id);
        return BaseResult.ok();
    }

}