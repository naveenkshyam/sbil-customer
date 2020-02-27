package com.exp.services.gp.services.customerproductlocation.dto;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class AssetContactInfoDTO {
    private Long customerProductLocationId;
    private String contactFirstName;
    private String contactMiddleInitial;
    private String contactLastName;
    private String customerExternalId;
    private String emailAddress;
    private String primaryPhone;
    private String phoneNumberExtension;
    private String countryCodePhone;
}
