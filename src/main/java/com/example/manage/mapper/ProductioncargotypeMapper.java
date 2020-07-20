package com.example.manage.mapper;

import com.example.manage.domain.Productioncargotype;
import com.example.manage.mapper.ProductioncargotypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ProductioncargotypeMapper {
    long countByExample(ProductioncargotypeExample example);

    int deleteByExample(ProductioncargotypeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Productioncargotype record);

    int insertSelective(Productioncargotype record);

    List<Productioncargotype> selectByExample(ProductioncargotypeExample example);

    Productioncargotype selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Productioncargotype record, @Param("example") ProductioncargotypeExample example);

    int updateByExample(@Param("record") Productioncargotype record, @Param("example") ProductioncargotypeExample example);

    int updateByPrimaryKeySelective(Productioncargotype record);

    int updateByPrimaryKey(Productioncargotype record);
}