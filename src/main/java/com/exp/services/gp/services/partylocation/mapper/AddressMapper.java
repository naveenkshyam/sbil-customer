package com.exp.services.gp.services.partylocation.mapper;

import com.exp.services.gp.services.partylocation.dto.AddressDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.springframework.data.domain.Page;

@Mapper(componentModel = "spring")
public interface AddressMapper {
    @Mappings({
            @Mapping(target = "addressId", source = "addressId"),
            @Mapping(target = "line1", source = "line1"),
            @Mapping(target = "line2", source = "line2"),
            @Mapping(target = "line3", source = "line3"),
            @Mapping(target = "line4", source = "line4"),
            @Mapping(target = "city", source = "city"),
            @Mapping(target = "county", source = "county"),
            @Mapping(target = "province", source = "province"),
            @Mapping(target = "isoCountryCode", source = "isoCountryCode"),
            @Mapping(target = "postalCode", source = "postalCode"),
            @Mapping(target = "languageId", source = "language.languageId"),
            @Mapping(target = "languageCode", source = "language.languageCode"),
            @Mapping(target = "languageDesc", source = "language.languageDesc"),

    })
    AddressDTO map(SearchAddressKeyFields source);

    default Page<AddressDTO> map(Page<SearchAddressKeyFields> page){
        return page.map(this::map);
    }
}
