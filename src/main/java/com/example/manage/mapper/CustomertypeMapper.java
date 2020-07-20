package com.example.manage.mapper;

import com.example.manage.domain.Customertype;
import com.example.manage.mapper.CustomertypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.example.manage.util.PageRequest;

public interface CustomertypeMapper {
    long countByExample(CustomertypeExample example);

    int deleteByExample(CustomertypeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Customertype record);

    int insertSelective(Customertype record);

    List<Customertype> selectByExample(CustomertypeExample example);

    Customertype selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Customertype record, @Param("example") CustomertypeExample example);

    int updateByExample(@Param("record") Customertype record, @Param("example") CustomertypeExample example);

    int updateByPrimaryKeySelective(Customertype record);

    int updateByPrimaryKey(Customertype record);

    Customertype selectByType(@Param("customerType") String customerType);

    int deleteByPrimaryKey(String id);

    List<Customertype> findPage(@Param("pageRequest") PageRequest pageRequest);

    Customertype selectByPrimaryKey(String id);

    Long findCount();
}