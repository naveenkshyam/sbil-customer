package com.exp.services.gp.services.customerproductlocation.mapper;

import com.exp.services.gp.services.customerproductlocation.dto.CustomerProductChannelHistoryDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.springframework.data.domain.Page;

@Mapper(componentModel = "spring")
public interface CustomerProductChannelHistoryMapper {

    @Mappings({
            @Mapping(target = "channelTypeId", source = "channelType.channelTypeId"),
            @Mapping(target = "channelTypeName", source = "channelType.channelTypeName"),
            @Mapping(target = "customerBuid", source = "customerBuid"),
            @Mapping(target = "customerNum", source = "customerNum"),
            @Mapping(target = "customerProductId", source = "customerProduct.customerProductId"),
            @Mapping(target = "customerProductChannelHistId", source = "customerProductChannelHistId"),
            @Mapping(target = "orderBuid", source = "orderBuid"),
            @Mapping(target = "orderNumber", source = "orderNumber"),
            @Mapping(target = "partyId", source = "partyId"),
            @Mapping(target = "userAccountId", source = "userAccountId"),
            @Mapping(target = "userAddress", source = "userAddress"),
            @Mapping(target = "userCity", source = "userCity"),
            @Mapping(target = "userCountry", source = "userCountry"),
            @Mapping(target = "userName", source = "userName"),
            @Mapping(target = "userState", source = "userState"),
            @Mapping(target = "userStoreId", source = "userStoreId"),
            @Mapping(target = "userStoreName", source = "userStoreName"),
            @Mapping(target = "userZipCode", source = "userZipCode"),

    })
    CustomerProductChannelHistoryDTO map(SearchCustomerProductChannelHistoryKeyFields source);

    default Page<CustomerProductChannelHistoryDTO> map(Page<SearchCustomerProductChannelHistoryKeyFields> page){
        return page.map(this::map);
    }
}
