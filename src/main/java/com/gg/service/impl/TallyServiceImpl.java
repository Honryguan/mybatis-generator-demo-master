package com.gg.service.impl;

import com.gg.mapper.TallyMapper;
import com.gg.service.TallyService;
import com.gg.bean.Tally;
import com.gg.vo.TallyVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* @author honry.guan
* @created Create Time: 2020-04-05 05:51:07
*/
@Service
@Transactional(readOnly = true, rollbackFor = Exception.class)
public class TallyServiceImpl implements TallyService {
    @Autowired
    private TallyMapper tallyMapper;

    @Override
    public int addTally(Tally tally) {
        return tallyMapper.insert(tally);
    }
    
    @Override
    public int addTallyVo(TallyVo tallyVo) {
        return 0;
    }
    
    @Override
    public int updateTallyVo(TallyVo tallyVo) {
        return 0;
    }
    
    @Override
    public int updateTally(Tally tally) {
        return tallyMapper.updateByPrimaryKeySelective(tally);
    }
    
    @Override
    public int delTallyById(Integer id) {
        return tallyMapper.deleteByPrimaryKey(id);
    }
    
    @Override
    public Tally getTallyById(Integer id) {
        return tallyMapper.selectByPrimaryKey(id);
    }

}
