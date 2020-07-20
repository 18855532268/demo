package com.example.manage.mapper;

import com.example.manage.domain.Productstore;
import com.example.manage.mapper.ProductstoreExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import com.example.manage.domain.Producttype;
import com.example.manage.util.PageRequest;

@Mapper
public interface ProductstoreMapper {
    long countByExample(ProductstoreExample example);

    int deleteByExample(ProductstoreExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Productstore record);

    int insertSelective(Productstore record);

    List<Productstore> selectByExample(ProductstoreExample example);

    Productstore selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Productstore record, @Param("example") ProductstoreExample example);

    int updateByExample(@Param("record") Productstore record, @Param("example") ProductstoreExample example);

    int updateByPrimaryKeySelective(Productstore record);

    int updateByPrimaryKey(Productstore record);

    List<Productstore> findPage(@Param("pageRequest") PageRequest pageRequest);
}