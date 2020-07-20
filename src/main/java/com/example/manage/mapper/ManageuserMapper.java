package com.example.manage.mapper;

import com.example.manage.domain.Manageuser;
import com.example.manage.mapper.ManageuserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import com.example.manage.util.PageRequest;

@Repository
public interface ManageuserMapper {
    long countByExample(ManageuserExample example);

    int deleteByExample(ManageuserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Manageuser record);

    int insertSelective(Manageuser record);

    List<Manageuser> selectByExample(ManageuserExample example);

    Manageuser selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Manageuser record, @Param("example") ManageuserExample example);

    int updateByExample(@Param("record") Manageuser record, @Param("example") ManageuserExample example);

    int updateByPrimaryKeySelective(Manageuser record);

    int updateByPrimaryKey(Manageuser record);

    int deleteByPrimaryKey(String id);

    List<Manageuser> findPage(@Param("pageRequest") PageRequest pageRequest);

    Manageuser selectByPrimaryKey(String id);

    Long findCountByStatus();
}