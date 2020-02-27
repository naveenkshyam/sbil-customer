package com.exp.services.gp.services.contract.mapper;

import com.exp.services.gp.services.contract.dto.ContractLocationDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.springframework.data.domain.Page;

@Mapper(componentModel = "spring")
public interface ContractLocationMapper {

    @Mappings({
            @Mapping(target = "contractLocationId", source = "contractLocationId"),
            @Mapping(target = "sourceSiteId", source = "sourceSiteId"),
            @Mapping(target = "addressTypeCode", source = "addressType.addressTypeCode"),
            @Mapping(target = "addressTypeDesc", source = "addressType.addressTypeDesc"),
            @Mapping(target = "customerContractId", source = "customerContract.customerContractId"),
            @Mapping(target = "contractBasisType", source = "customerContract.contractBasisType"),
            @Mapping(target = "contractEndDate", source = "customerContract.contractEndDate"),
            @Mapping(target = "customerBuid", source = "customerContract.customerBuid"),
            @Mapping(target = "customerNumber", source = "customerContract.customerNumber"),
            @Mapping(target = "activeAddress", source = "activeAddress"),
            @Mapping(target = "address1", source = "address1"),
            @Mapping(target = "address2", source = "address2"),
            @Mapping(target = "address3", source = "address3"),
            @Mapping(target = "address4", source = "address4"),
            @Mapping(target = "cityName", source = "cityName"),
            @Mapping(target = "county", source = "county"),
            @Mapping(target = "postalCode", source = "postalCode"),
            @Mapping(target = "isoCountryCode", source = "isoCountryCode"),
            @Mapping(target = "subdivisionCode", source = "subdivisionCode"),
            @Mapping(target = "companyName", source = "companyName"),
            @Mapping(target = "geoCode", source = "geoCode"),

    })
    ContractLocationDTO map(SearchContractLocationKeyFields source);

    default Page<ContractLocationDTO> map(Page<SearchContractLocationKeyFields> page){
        return page.map(this::map);
    }

}
