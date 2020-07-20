package com.example.manage.mapper;

import com.example.manage.domain.Customer;
import com.example.manage.mapper.CustomerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.example.manage.util.PageRequest;

public interface CustomerMapper {
    long countByExample(CustomerExample example);

    int deleteByExample(CustomerExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Customer record);

    int insertSelective(Customer record);

    List<Customer> selectByExample(CustomerExample example);

    Customer selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Customer record, @Param("example") CustomerExample example);

    int updateByExample(@Param("record") Customer record, @Param("example") CustomerExample example);

    int updateByPrimaryKeySelective(Customer record);

    int updateByPrimaryKey(Customer record);

    Customer selectByPrimaryKey(String id);

    int deleteByPrimaryKey(String id);

    List<Customer> findPage(@Param("pageRequest") PageRequest pageRequest);

    Customer selectByIdAndStatus(@Param("id") String id);

    Long findCountByStatus();
}