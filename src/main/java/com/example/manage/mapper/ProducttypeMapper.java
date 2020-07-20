package com.example.manage.mapper;

import com.example.manage.domain.Producttype;
import com.example.manage.mapper.ProducttypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.example.manage.util.PageRequest;

public interface ProducttypeMapper {
    long countByExample(ProducttypeExample example);

    int deleteByExample(ProducttypeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Producttype record);

    int insertSelective(Producttype record);

    List<Producttype> selectByExample(ProducttypeExample example);

    Producttype selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Producttype record, @Param("example") ProducttypeExample example);

    int updateByExample(@Param("record") Producttype record, @Param("example") ProducttypeExample example);

    int updateByPrimaryKeySelective(Producttype record);

    int updateByPrimaryKey(Producttype record);

    List<Producttype> findPage(@Param("pageRequest") PageRequest pageRequest);

    int deleteByPrimaryKey(String id);

    Producttype selectByPrimaryKey(String id);
}