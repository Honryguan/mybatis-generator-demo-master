package com.gg.mapper;

import com.gg.bean.TallyType;
import com.gg.bean.TallyTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
* @author honry.guan
* @created Time: 2020-04-05 05:51:07
*/
@Mapper
public interface TallyTypeMapper {
    long countByExample(TallyTypeExample example);

    int deleteByExample(TallyTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TallyType record);

    int insertSelective(TallyType record);

    List<TallyType> selectByExample(TallyTypeExample example);

    TallyType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TallyType record, @Param("example") TallyTypeExample example);

    int updateByExample(@Param("record") TallyType record, @Param("example") TallyTypeExample example);

    int updateByPrimaryKeySelective(TallyType record);

    int updateByPrimaryKey(TallyType record);
}