package com.example.manage.mapper;

import com.example.manage.domain.Paymentrecord;
import com.example.manage.mapper.PaymentrecordExample;
import java.util.List;

import com.example.manage.util.PageRequest;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PaymentrecordMapper {
    long countByExample(PaymentrecordExample example);

    int deleteByExample(PaymentrecordExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Paymentrecord record);

    int insertSelective(Paymentrecord record);

    List<Paymentrecord> selectByExample(PaymentrecordExample example);

    Paymentrecord selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Paymentrecord record, @Param("example") PaymentrecordExample example);

    int updateByExample(@Param("record") Paymentrecord record, @Param("example") PaymentrecordExample example);

    int updateByPrimaryKeySelective(Paymentrecord record);

    int updateByPrimaryKey(Paymentrecord record);

    List<Long> findPayRentalByPurchaseId(@Param("purchaseId") Long purchaseId);

    List<Paymentrecord> findPaymentRecordPage(@Param("pageRequest")PageRequest pageRequest);
}