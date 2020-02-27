package com.exp.services.gp.services.partylocation.mapper;

public interface SearchPartyLocationKeyFields {
    Long getPartyLocationId();

    Party getparty();
    interface Party{
        Long getPartyId();
    }

    Address getaddress();

    interface Address{
        Long getAddressId();
    }
    Purpose getpurpose();

    interface Purpose{
        Long getPurposeId();
        String getPurposeName();
    }

    Long getCamLocId();

    String getCustomerNumber();

    Long getCustomerBuid();

    Status getStatus();
    interface Status{
         Long getStatusId();
         String getStatusCode();
         String getStatusDesc();
     }
     String getAffinityId();
}
