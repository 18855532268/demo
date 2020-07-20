package com.example.manage.mapper;

import com.example.manage.domain.Documentary;
import com.example.manage.mapper.DocumentaryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.example.manage.util.PageRequest;

public interface DocumentaryMapper {
    long countByExample(DocumentaryExample example);

    int deleteByExample(DocumentaryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Documentary record);

    int insertSelective(Documentary record);

    List<Documentary> selectByExample(DocumentaryExample example);

    Documentary selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Documentary record, @Param("example") DocumentaryExample example);

    int updateByExample(@Param("record") Documentary record, @Param("example") DocumentaryExample example);

    int updateByPrimaryKeySelective(Documentary record);

    int updateByPrimaryKey(Documentary record);

    Long findCount(@Param("productionId") Long productionId);

    List<Documentary> selectByPayOrderId(@Param("pageRequest") PageRequest pageRequest, @Param("productionId") Long productionId);
}