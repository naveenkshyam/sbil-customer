package com.exp.services.gp.services.customerproductlocation.mapper;

import com.exp.services.gp.services.customerproductlocation.dto.CustomerProductLocationDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.springframework.data.domain.Page;

@Mapper(componentModel = "spring")
public interface CustomerProductLocationMapper {

    @Mappings({
            @Mapping(target = "customerProductLocationId", source = "customerProductLocationId"),
            @Mapping(target = "addressSeqNum", source = "addressSeqNum"),
            @Mapping(target = "addressTypeCode", source = "addressTypeCode"),
            @Mapping(target = "altContactName", source = "altContactName"),
            @Mapping(target = "emailAddress", source = "emailAddress"),
            @Mapping(target = "phoneNum", source = "phoneNum"),
            @Mapping(target = "sourceSiteId", source = "sourceSiteId"),
    })
    CustomerProductLocationDTO map(SearchCustomerProductLocationKeyFields source);

    default Page<CustomerProductLocationDTO> map(Page<SearchCustomerProductLocationKeyFields> page){
        return page.map(this::map);
    }
}
