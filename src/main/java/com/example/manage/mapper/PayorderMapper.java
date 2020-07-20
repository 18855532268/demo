package com.example.manage.mapper;

import com.example.manage.domain.Payorder;
import com.example.manage.mapper.PayorderExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import com.example.manage.domain.other.OrderFuzzyQuery;
import com.example.manage.util.PageRequest;

@Mapper
public interface PayorderMapper {
    long countByExample(PayorderExample example);

    int deleteByExample(PayorderExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Payorder record);

    int insertSelective(Payorder record);

    List<Payorder> selectByExample(PayorderExample example);

    Payorder selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Payorder record, @Param("example") PayorderExample example);

    int updateByExample(@Param("record") Payorder record, @Param("example") PayorderExample example);

    int updateByPrimaryKeySelective(Payorder record);

    int updateByPrimaryKey(Payorder record);

    int deleteByPrimaryKey(String id);

    OrderFuzzyQuery findOrderCustomerById(@Param("id") Long id);

    Payorder selectByPrimaryKey(String id);

    Payorder findByIdAndType(@Param("id") Long id, @Param("type") Integer type);

    List<Payorder> findPageByType(@Param("pageRequest") PageRequest pageRequest, @Param("type") Integer type);

    List<OrderFuzzyQuery> findOrderFuzzyQuery(@Param("key") String key, @Param("type") Integer type);

    Long findCountByStatus();
}