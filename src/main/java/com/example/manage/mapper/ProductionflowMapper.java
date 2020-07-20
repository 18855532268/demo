package com.example.manage.mapper;

import com.example.manage.domain.Productionflow;
import com.example.manage.mapper.ProductionflowExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ProductionflowMapper {
    long countByExample(ProductionflowExample example);

    int deleteByExample(ProductionflowExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Productionflow record);

    int insertSelective(Productionflow record);

    List<Productionflow> selectByExample(ProductionflowExample example);

    Productionflow selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Productionflow record, @Param("example") ProductionflowExample example);

    int updateByExample(@Param("record") Productionflow record, @Param("example") ProductionflowExample example);

    int updateByPrimaryKeySelective(Productionflow record);

    int updateByPrimaryKey(Productionflow record);
}