package com.exp.services.gp.services.customerproductlocation.mapper;

import com.exp.services.gp.services.partylocation.mapper.SearchPartyLocationKeyFields;

public interface SearchCustomerProductPartyLocationKeyFields {

     Long getCustomerProductPartyLocationId();
     SearchCustomerProductChannelHistoryKeyFields.CustomerProduct getCustomerProduct();
     SearchPartyLocationKeyFields.Purpose getPurpose();
     SearchPartyLocationKeyFields.Party getParty();
     SearchPartyLocationKeyFields.Address getAddress();
     PartyLocation getPartyLocation();
     interface PartyLocation{
          Long getPartyLocationId();
     }
     Long getSequenceNum();
     String getRouteToMarket();
     Long getRank();
}
