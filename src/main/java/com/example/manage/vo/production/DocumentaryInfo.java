package com.example.manage.vo.production;

import com.example.manage.domain.Production;
import com.example.manage.util.Page;
import com.example.manage.vo.customer.CustomerVo;
import lombok.Builder;
import lombok.Data;

import java.util.List;
@Data
@Builder
public class DocumentaryInfo {
    private ProductionPageVo productionPageVo;
    private CustomerVo customerVo;
    private Page<DocumentaryPageVo> documentaryPageVos;

    public static DocumentaryInfo of(ProductionPageVo productionPageVo, CustomerVo customerVo, Page<DocumentaryPageVo> documentaryPageVos){
        return DocumentaryInfo.builder()
                .productionPageVo(productionPageVo)
                .customerVo(customerVo)
                .documentaryPageVos(documentaryPageVos)
                .build();
    }
}
