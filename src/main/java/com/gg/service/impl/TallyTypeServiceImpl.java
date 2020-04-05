package com.gg.service.impl;

import com.gg.mapper.TallyTypeMapper;
import com.gg.service.TallyTypeService;
import com.gg.bean.TallyType;
import com.gg.vo.TallyTypeVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* @author honry.guan
* @created Create Time: 2020-04-05 05:51:07
*/
@Service
@Transactional(readOnly = true, rollbackFor = Exception.class)
public class TallyTypeServiceImpl implements TallyTypeService {
    @Autowired
    private TallyTypeMapper tallyTypeMapper;

    @Override
    public int addTallyType(TallyType tallyType) {
        return tallyTypeMapper.insert(tallyType);
    }
    
    @Override
    public int addTallyTypeVo(TallyTypeVo tallyTypeVo) {
        return 0;
    }
    
    @Override
    public int updateTallyTypeVo(TallyTypeVo tallyTypeVo) {
        return 0;
    }
    
    @Override
    public int updateTallyType(TallyType tallyType) {
        return tallyTypeMapper.updateByPrimaryKeySelective(tallyType);
    }
    
    @Override
    public int delTallyTypeById(Integer id) {
        return tallyTypeMapper.deleteByPrimaryKey(id);
    }
    
    @Override
    public TallyType getTallyTypeById(Integer id) {
        return tallyTypeMapper.selectByPrimaryKey(id);
    }

}
