package com.example.manage.mapper;

import com.example.manage.domain.Productstoretype;
import com.example.manage.mapper.ProductstoretypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ProductstoretypeMapper {
    long countByExample(ProductstoretypeExample example);

    int deleteByExample(ProductstoretypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Productstoretype record);

    int insertSelective(Productstoretype record);

    List<Productstoretype> selectByExample(ProductstoretypeExample example);

    Productstoretype selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Productstoretype record, @Param("example") ProductstoretypeExample example);

    int updateByExample(@Param("record") Productstoretype record, @Param("example") ProductstoretypeExample example);

    int updateByPrimaryKeySelective(Productstoretype record);

    int updateByPrimaryKey(Productstoretype record);
}