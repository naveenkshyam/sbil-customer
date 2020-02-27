package com.exp.services.gp.services.customerproductlocation.dto;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class CustomerProductPartyLocationDTO {
    private Long customerProductPartyLocationId;
    private Long customerProductId;
    private Long purposeId;
    private Long partyId;
    private Long addressId;
    private Long partyLocationId;
    private Long sequenceNum;
    private String routeToMarket;
    private Long rank;
}
