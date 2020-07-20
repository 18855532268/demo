package com.example.manage.mapper;

import com.example.manage.domain.Cure;
import com.example.manage.mapper.CureExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CureMapper {
    long countByExample(CureExample example);

    int deleteByExample(CureExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Cure record);

    int insertSelective(Cure record);

    List<Cure> selectByExample(CureExample example);

    Cure selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Cure record, @Param("example") CureExample example);

    int updateByExample(@Param("record") Cure record, @Param("example") CureExample example);

    int updateByPrimaryKeySelective(Cure record);

    int updateByPrimaryKey(Cure record);
}