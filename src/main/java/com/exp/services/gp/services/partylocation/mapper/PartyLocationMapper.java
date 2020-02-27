package com.exp.services.gp.services.partylocation.mapper;

import com.exp.services.gp.services.partylocation.dto.PartyLocationDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.springframework.data.domain.Page;

@Mapper(componentModel = "spring")
public interface PartyLocationMapper {
    @Mappings({
            @Mapping(target = "partyLocationId", source = "partyLocationId"),
            @Mapping(target = "partyId", source = "party.partyId"),
            @Mapping(target = "addressId", source = "address.addressId"),
            @Mapping(target = "purposeId", source = "purpose.purposeId"),
            @Mapping(target = "purposeName", source = "purpose.purposeName"),
            @Mapping(target = "camLocId", source = "camLocId"),
            @Mapping(target = "customerNumber", source = "customerNumber"),
            @Mapping(target = "customerBuid", source = "customerBuid"),
            @Mapping(target = "statusId", source = "status.statusId"),
            @Mapping(target = "statusCode", source = "status.statusCode"),
            @Mapping(target = "statusDesc", source = "status.statusDesc"),
            @Mapping(target = "affinityId", source = "affinityId"),
    })
    PartyLocationDTO map(SearchPartyLocationKeyFields source);

    default Page<PartyLocationDTO> map(Page<SearchPartyLocationKeyFields> page){
        return page.map(this::map);
    }
}
