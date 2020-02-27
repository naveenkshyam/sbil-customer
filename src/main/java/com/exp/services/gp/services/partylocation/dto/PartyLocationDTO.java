package com.exp.services.gp.services.partylocation.dto;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class PartyLocationDTO {

    private Long partyLocationId;

    private Long partyId;

    private Long addressId;

    private Long purposeId;

    private String purposeName;

    private Long camLocId;

    private String customerNumber;

    private Long customerBuid;

    private Long statusId;

    private String statusCode;

    private String statusDesc;

    private String affinityId;

}
