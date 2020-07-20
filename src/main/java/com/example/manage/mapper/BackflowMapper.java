package com.example.manage.mapper;

import com.example.manage.domain.Backflow;
import com.example.manage.mapper.BackflowExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.example.manage.util.PageRequest;

public interface BackflowMapper {
    long countByExample(BackflowExample example);

    int deleteByExample(BackflowExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Backflow record);

    int insertSelective(Backflow record);

    List<Backflow> selectByExample(BackflowExample example);

    Backflow selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Backflow record, @Param("example") BackflowExample example);

    int updateByExample(@Param("record") Backflow record, @Param("example") BackflowExample example);

    int updateByPrimaryKeySelective(Backflow record);

    int updateByPrimaryKey(Backflow record);

    Long findBackFlowPageCount();

    List<Backflow> findBackFlowPage(@Param("pageRequest") PageRequest pageRequest);

    List<Backflow> findBackFlowByPayOrderId(@Param("payOrderId")Long payOrderId);
}