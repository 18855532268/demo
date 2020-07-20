package com.example.manage.mapper;

import com.example.manage.domain.Production;
import com.example.manage.mapper.ProductionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.example.manage.util.PageRequest;

public interface ProductionMapper {
    long countByExample(ProductionExample example);

    int deleteByExample(ProductionExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Production record);

    int insertSelective(Production record);

    List<Production> selectByExample(ProductionExample example);

    Production selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Production record, @Param("example") ProductionExample example);

    int updateByExample(@Param("record") Production record, @Param("example") ProductionExample example);

    int updateByPrimaryKeySelective(Production record);

    int updateByPrimaryKey(Production record);

    List<Production> findPageByStatus(@Param("status") Integer status, @Param("pageRequest") PageRequest pageRequest);

    Long findCountByStatus(@Param("status") Integer status);
}