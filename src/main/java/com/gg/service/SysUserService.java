package com.gg.service;
import java.util.Map;
import com.gg.bean.SysUser;
import com.gg.vo.SysUserVo;
/**
* @author honry.guan
* @created Create Time: 2019/1/9
*/
public interface SysUserService {

    int addSysUser(SysUser sysUser);

    int addSysUserVo(SysUserVo sysUserVo);

    int updateSysUserVo(SysUserVo sysUserVo);

    int updateSysUser(SysUser sysUser);

    int delSysUserById(Integer id);

    SysUser getSysUserById(Integer id);

}
