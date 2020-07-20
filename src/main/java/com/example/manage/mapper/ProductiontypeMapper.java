package com.example.manage.mapper;

import com.example.manage.domain.Productiontype;
import com.example.manage.mapper.ProductiontypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ProductiontypeMapper {
    long countByExample(ProductiontypeExample example);

    int deleteByExample(ProductiontypeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Productiontype record);

    int insertSelective(Productiontype record);

    List<Productiontype> selectByExample(ProductiontypeExample example);

    Productiontype selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Productiontype record, @Param("example") ProductiontypeExample example);

    int updateByExample(@Param("record") Productiontype record, @Param("example") ProductiontypeExample example);

    int updateByPrimaryKeySelective(Productiontype record);

    int updateByPrimaryKey(Productiontype record);
}