package com.gg.service;
import java.util.Map;
import com.gg.bean.TallyType;
import com.gg.vo.TallyTypeVo;
/**
* @author honry.guan
* @created Create Time: 2019/1/9
*/
public interface TallyTypeService {

    int addTallyType(TallyType tallyType);

    int addTallyTypeVo(TallyTypeVo tallyTypeVo);

    int updateTallyTypeVo(TallyTypeVo tallyTypeVo);

    int updateTallyType(TallyType tallyType);

    int delTallyTypeById(Integer id);

    TallyType getTallyTypeById(Integer id);

}
