package com.exp.services.gp.services.partylocation.dto;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class PartyDTO {

    private Long partyId;

    private String title;

    private String department;

    private String organizationName;

    private String givenName;

    private String lastName;

    private String middleName;

    private Long languageId;

    private String languageCode;

    private String languageDesc;

    private Long statusId;

    private String altContactName;

    private String altGivenName;

    private String altMiddleName;

    private String altLastName;
}
