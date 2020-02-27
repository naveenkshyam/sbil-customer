package com.exp.services.gp.services.partylocation.mapper;

import com.exp.services.gp.services.partylocation.dto.PartyDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.springframework.data.domain.Page;

@Mapper(componentModel = "spring")
public interface PartyMapper {
    @Mappings({
            @Mapping(target = "partyId", source = "partyId"),
            @Mapping(target = "title", source = "title"),
            @Mapping(target = "department", source = "department"),
            @Mapping(target = "organizationName", source = "organizationName"),
            @Mapping(target = "givenName", source = "givenName"),
            @Mapping(target = "lastName", source = "lastName"),
            @Mapping(target = "middleName", source = "middleName"),
            @Mapping(target = "languageId", source = "language.languageId"),
            @Mapping(target = "languageCode", source = "language.languageCode"),
            @Mapping(target = "languageDesc", source = "language.languageDesc"),
            @Mapping(target = "statusId", source = "statusId"),
            @Mapping(target = "altContactName", source = "altContactName"),
            @Mapping(target = "altGivenName", source = "altGivenName"),
            @Mapping(target = "altMiddleName", source = "altMiddleName"),
            @Mapping(target = "altLastName", source = "altLastName"),

    })
    PartyDTO map(SearchPartyKeyFields source);

    default Page<PartyDTO> map(Page<SearchPartyKeyFields> page){
        return page.map(this::map);
    }
}
