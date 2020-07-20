package com.example.manage.mapper;

import com.example.manage.domain.Purchaserecord;
import com.example.manage.mapper.PurchaserecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PurchaserecordMapper {
    long countByExample(PurchaserecordExample example);

    int deleteByExample(PurchaserecordExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Purchaserecord record);

    int insertSelective(Purchaserecord record);

    List<Purchaserecord> selectByExample(PurchaserecordExample example);

    Purchaserecord selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Purchaserecord record, @Param("example") PurchaserecordExample example);

    int updateByExample(@Param("record") Purchaserecord record, @Param("example") PurchaserecordExample example);

    int updateByPrimaryKeySelective(Purchaserecord record);

    int updateByPrimaryKey(Purchaserecord record);

    List<Purchaserecord> findPurchaseRecordByPurchaseIdAndFinshed(@Param("purchaseId") Long purchaseId);

    List<Purchaserecord> findPurchaseRecordByRawMaterialsRecordId(@Param("purchaseId") Long purchaseId);
}