package com.example.manage.mapper;

import com.example.manage.domain.Productionfactory;
import com.example.manage.mapper.ProductionfactoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ProductionfactoryMapper {
    long countByExample(ProductionfactoryExample example);

    int deleteByExample(ProductionfactoryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Productionfactory record);

    int insertSelective(Productionfactory record);

    List<Productionfactory> selectByExample(ProductionfactoryExample example);

    Productionfactory selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Productionfactory record, @Param("example") ProductionfactoryExample example);

    int updateByExample(@Param("record") Productionfactory record, @Param("example") ProductionfactoryExample example);

    int updateByPrimaryKeySelective(Productionfactory record);

    int updateByPrimaryKey(Productionfactory record);
}