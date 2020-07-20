package com.example.manage.mapper;

import com.example.manage.domain.Productionprocess;
import com.example.manage.mapper.ProductionprocessExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ProductionprocessMapper {
    long countByExample(ProductionprocessExample example);

    int deleteByExample(ProductionprocessExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Productionprocess record);

    int insertSelective(Productionprocess record);

    List<Productionprocess> selectByExample(ProductionprocessExample example);

    Productionprocess selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Productionprocess record, @Param("example") ProductionprocessExample example);

    int updateByExample(@Param("record") Productionprocess record, @Param("example") ProductionprocessExample example);

    int updateByPrimaryKeySelective(Productionprocess record);

    int updateByPrimaryKey(Productionprocess record);
}