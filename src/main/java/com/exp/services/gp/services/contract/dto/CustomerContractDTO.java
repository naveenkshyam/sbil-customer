package com.exp.services.gp.services.contract.dto;


import lombok.Data;
import lombok.ToString;

import java.util.Calendar;

@Data
@ToString
public class CustomerContractDTO {
    private Long customerContractId;

    private Long vendorId;

    private Long sourceSiteId;

    private Long originalOrderBuid;

    private Long orderBuid;

    private String contractBasisType;

    private Calendar contractEndDate;

    private String contractLaborType;

    private Calendar contractStartDate;

    private String initialContractCode;


    private Short intlBusUnitId;


    private String itemNum;

    private String orderNum;

    private String originalOrderNum;

    private Long customerBuid;

    private Long customerNumber;

    private Calendar contractStatusChangedDts;

}
