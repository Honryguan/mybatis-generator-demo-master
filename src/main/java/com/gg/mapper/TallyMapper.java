package com.gg.mapper;

import com.gg.bean.Tally;
import com.gg.bean.TallyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TallyMapper {
    long countByExample(TallyExample example);

    int deleteByExample(TallyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Tally record);

    int insertSelective(Tally record);

    List<Tally> selectByExample(TallyExample example);

    Tally selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Tally record, @Param("example") TallyExample example);

    int updateByExample(@Param("record") Tally record, @Param("example") TallyExample example);

    int updateByPrimaryKeySelective(Tally record);

    int updateByPrimaryKey(Tally record);
}