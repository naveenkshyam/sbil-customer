package com.exp.services.gp.services.customerproductlocation.mapper;

import com.exp.services.gp.services.customerproductlocation.dto.CustomerProductPartyLocationDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.springframework.data.domain.Page;

@Mapper(componentModel = "spring")
public interface CustomerProductPartyLocationMapper {
    @Mappings({
            @Mapping(target = "customerProductPartyLocationId", source = "customerProductPartyLocationId"),
            @Mapping(target = "customerProductId", source = "customerProduct.customerProductId"),
            @Mapping(target = "purposeId", source = "purpose.purposeId"),
            @Mapping(target = "partyId", source = "party.partyId"),
            @Mapping(target = "addressId", source = "address.addressId"),
            @Mapping(target = "partyLocationId", source = "partyLocation.partyLocationId"),
            @Mapping(target = "sequenceNum", source = "sequenceNum"),
            @Mapping(target = "routeToMarket", source = "routeToMarket"),
            @Mapping(target = "rank", source = "rank"),
    })
    CustomerProductPartyLocationDTO map(SearchCustomerProductPartyLocationKeyFields source);

    default Page<CustomerProductPartyLocationDTO> map(Page<SearchCustomerProductPartyLocationKeyFields> page){
        return page.map(this::map);
    }
}
