package com.gg.service;
import java.util.Map;
import com.gg.bean.Tally;
import com.gg.vo.TallyVo;
/**
* @author honry.guan
* @created Create Time: 2019/1/9
*/
public interface TallyService {

    int addTally(Tally tally);

    int addTallyVo(TallyVo tallyVo);

    int updateTallyVo(TallyVo tallyVo);

    int updateTally(Tally tally);

    int delTallyById(Integer id);

    Tally getTallyById(Integer id);

}
