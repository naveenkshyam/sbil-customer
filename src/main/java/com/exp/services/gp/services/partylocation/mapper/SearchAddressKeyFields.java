package com.exp.services.gp.services.partylocation.mapper;

public interface SearchAddressKeyFields {

    Long getAddressId();
    String getLine1();
    String getLine2();
    String getLine3();
    String getLine4();
    String getCity();
    String getCounty();
    String getProvince();
    String getIsoCountryCode();
    String getPostalCode();
    Language getlanguage();

    interface Language{
        Long getLanguageId();
        String getLanguageDesc();
        String getLanguageCode();
    }
}
