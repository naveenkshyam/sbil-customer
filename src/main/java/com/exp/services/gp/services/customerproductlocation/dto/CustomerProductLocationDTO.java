package com.exp.services.gp.services.customerproductlocation.dto;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class CustomerProductLocationDTO {
    private Long customerProductLocationId;
    private Long addressSeqNum;
    private String addressTypeCode;
    private String altContactName;
    private String emailAddress;
    private String phoneNum;
    private Long sourceSiteId;
}
