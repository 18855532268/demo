package com.example.manage.mapper;

import com.example.manage.domain.Role;
import com.example.manage.mapper.RoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import org.hibernate.validator.constraints.NotEmpty;
import javax.persistence.Column;
import javax.persistence.Table;
import com.example.manage.domain.Manageuser;
import javax.persistence.GeneratedValue;
import com.example.manage.util.PageRequest;
import javax.persistence.Id;

@Repository
public interface RoleMapper {
    long countByExample(RoleExample example);

    int deleteByExample(RoleExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Role record);

    int insertSelective(Role record);

    List<Role> selectByExample(RoleExample example);

    Role selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Role record, @Param("example") RoleExample example);

    int updateByExample(@Param("record") Role record, @Param("example") RoleExample example);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);

    List<Role> findPage(@Param("pageRequest") PageRequest pageRequest);

    List<Role> selectByUserId(@Param("userId") String id);

    List<Role> findRoleByManageUserId(@Param("manageUserId") String manageUserId);

    int deleteByPrimaryKey(String id);

    Role selectByPrimaryKey(String id);
}