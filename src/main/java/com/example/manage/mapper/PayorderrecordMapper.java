package com.example.manage.mapper;

import com.example.manage.domain.Payorderrecord;
import com.example.manage.mapper.PayorderrecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PayorderrecordMapper {
    long countByExample(PayorderrecordExample example);

    int deleteByExample(PayorderrecordExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Payorderrecord record);

    int insertSelective(Payorderrecord record);

    List<Payorderrecord> selectByExample(PayorderrecordExample example);

    Payorderrecord selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Payorderrecord record, @Param("example") PayorderrecordExample example);

    int updateByExample(@Param("record") Payorderrecord record, @Param("example") PayorderrecordExample example);

    int updateByPrimaryKeySelective(Payorderrecord record);

    int updateByPrimaryKey(Payorderrecord record);

    int deleteByPrimaryKey(String id);

    Payorderrecord selectByPrimaryKey(String id);

    List<Payorderrecord> findListByPayOrderId(@Param("payOrderId") Long payOrderId);
}