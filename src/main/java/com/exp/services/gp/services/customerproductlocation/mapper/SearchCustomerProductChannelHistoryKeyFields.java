package com.exp.services.gp.services.customerproductlocation.mapper;

public interface SearchCustomerProductChannelHistoryKeyFields {

    ChannelType getChannelType();

    Long getCustomerBuid();

    Long getCustomerNum();

    CustomerProduct getCustomerProduct();

    Long getCustomerProductChannelHistId();

    Long getOrderBuid();

    String getOrderNumber();

    Long getPartyId();

    String getUserAccountId();

    String getUserAddress();

    String getUserCity();

    String getUserCountry();

    String getUserName();

    String getUserState();

    String getUserStoreId();

    String getUserStoreName();

    String getUserZipCode();

    interface ChannelType{
        Long getChannelTypeId();
        String getChannelTypeName();
    }

    interface CustomerProduct{
        Long getCustomerProductId();
    }
}
