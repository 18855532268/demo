package com.example.manage.vo.production;

import lombok.*;

import java.util.Date;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Data
@Builder
public class ProductionVo {

    private Long payOrderId;
    private Long customerId;
    private Long productId;
    private Long cargoTypeId;
    private Long productionTypeId;
    private Long flowId;
    private Long factoryId;
    private Long productionmanageId;
    private Integer proCount;
    private Integer proNum;
    private String proDeliveryDate;
    private String stateCov;
    private String weight;
    private String larghezza;
    private String weightTolerance;
    private String lossRate;
    private String color;
    private String isBatchCharge;
    private String announcements;
    private String remark;
    private Integer grayNum;
    private List<String> productionProcesss;
}
