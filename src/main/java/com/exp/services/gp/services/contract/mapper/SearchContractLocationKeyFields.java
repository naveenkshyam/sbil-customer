package com.exp.services.gp.services.contract.mapper;

import java.util.Calendar;

public interface SearchContractLocationKeyFields {

     Long getContractLocationId();
     Long getSourceSiteId();
     AddressType getAddressType();
    interface AddressType{
        String getAddressTypeCode();
        String getAddressTypeDesc();
    }
     CustomerContract getCustomerContract();
     interface CustomerContract{
         Long getCustomerContractId();
         String getContractBasisType();
         Calendar getContractEndDate();
         Long getCustomerBuid();
         Long getCustomerNumber();
     }


     String getActiveAddress();
     String getAddress1();
     String getAddress2();
     String getAddress3();
     String getAddress4();
     String getCityName();
     String getCounty();
     String getPostalCode();
     String getIsoCountryCode();
     String getSubdivisionCode();
     String getCompanyName();
     String getGeoCode();


}
