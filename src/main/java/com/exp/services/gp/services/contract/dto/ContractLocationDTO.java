package com.exp.services.gp.services.contract.dto;


import lombok.Data;
import lombok.ToString;

import java.util.Calendar;

@Data
@ToString
public class ContractLocationDTO {

    private Long contractLocationId;
    private Long sourceSiteId;
    private String addressTypeCode;
    private String addressTypeDesc;
    private Long customerContractId;
    private String contractBasisType;
    private Calendar contractEndDate;
    private Long customerBuid;
    private Long customerNumber;


    private String activeAddress;
    private String address1;
    private String address2;
    private String address3;
    private String address4;
    private String cityName;
    private String county;
    private String postalCode;
    private String isoCountryCode;
    private String subdivisionCode;
    private String companyName;
    private String geoCode;

}
