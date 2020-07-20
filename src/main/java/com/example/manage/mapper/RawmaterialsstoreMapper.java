package com.example.manage.mapper;

import com.example.manage.domain.Rawmaterialsstore;
import com.example.manage.mapper.RawmaterialsstoreExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.example.manage.util.PageRequest;

public interface RawmaterialsstoreMapper {
    long countByExample(RawmaterialsstoreExample example);

    int deleteByExample(RawmaterialsstoreExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Rawmaterialsstore record);

    int insertSelective(Rawmaterialsstore record);

    List<Rawmaterialsstore> selectByExample(RawmaterialsstoreExample example);

    Rawmaterialsstore selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Rawmaterialsstore record, @Param("example") RawmaterialsstoreExample example);

    int updateByExample(@Param("record") Rawmaterialsstore record, @Param("example") RawmaterialsstoreExample example);

    int updateByPrimaryKeySelective(Rawmaterialsstore record);

    int updateByPrimaryKey(Rawmaterialsstore record);

    Long findRawMaterialsStatusCount(@Param("status")Integer status);

    List<Rawmaterialsstore> findRawMaterialsStatusPage(@Param("pageRequest") PageRequest pageRequest, @Param("status")Integer status);
}