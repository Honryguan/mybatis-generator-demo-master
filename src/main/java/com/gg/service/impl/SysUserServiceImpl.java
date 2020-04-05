package com.gg.service.impl;

import com.gg.mapper.SysUserMapper;
import com.gg.service.SysUserService;
import com.gg.bean.SysUser;
import com.gg.vo.SysUserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* @author honry.guan
* @created Create Time: 2020-04-05 05:51:07
*/
@Service
@Transactional(readOnly = true, rollbackFor = Exception.class)
public class SysUserServiceImpl implements SysUserService {
    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public int addSysUser(SysUser sysUser) {
        return sysUserMapper.insert(sysUser);
    }
    
    @Override
    public int addSysUserVo(SysUserVo sysUserVo) {
        return 0;
    }
    
    @Override
    public int updateSysUserVo(SysUserVo sysUserVo) {
        return 0;
    }
    
    @Override
    public int updateSysUser(SysUser sysUser) {
        return sysUserMapper.updateByPrimaryKeySelective(sysUser);
    }
    
    @Override
    public int delSysUserById(Integer id) {
        return sysUserMapper.deleteByPrimaryKey(id);
    }
    
    @Override
    public SysUser getSysUserById(Integer id) {
        return sysUserMapper.selectByPrimaryKey(id);
    }

}
