package com.exp.services.gp.services.partylocation.mapper;

public interface SearchPartyKeyFields {
    Long getPartyId();

    String getTitle();

    String getDepartment();

    String getOrganizationName();

    String getGivenName();

    String getLastName();

    String getMiddleName();

    SearchAddressKeyFields.Language getLanguage();

    Long getStatusId();

    String getAltContactName();

    String getAltGivenName();

    String getAltMiddleName();

    String getAltLastName();
}
