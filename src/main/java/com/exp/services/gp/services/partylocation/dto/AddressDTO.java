package com.exp.services.gp.services.partylocation.dto;


import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class AddressDTO {

    private Long addressId;
    private String line1;
    private String line2;
    private String line3;
    private String line4;
    private String city;
    private String county;
    private String province;
    private String isoCountryCode;
    private String postalCode;
    private Long languageId;
    private String languageCode;
    private String languageDesc;
}
