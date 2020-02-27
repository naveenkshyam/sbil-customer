package com.exp.services.gp.services.contract.mapper;

import com.exp.services.gp.services.contract.dto.CustomerContractDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.springframework.data.domain.Page;

@Mapper(componentModel = "spring")
public interface CustomerContractMapper {

    @Mappings({
            @Mapping(target = "customerContractId", source = "customerContractId"),
            @Mapping(target = "vendorId", source = "vendorId"),
            @Mapping(target = "sourceSiteId", source = "sourceSiteId"),
            @Mapping(target = "originalOrderBuid", source = "originalOrderBuid"),
            @Mapping(target = "orderBuid", source = "orderBuid"),
            @Mapping(target = "contractBasisType", source = "contractBasisType"),
            @Mapping(target = "contractEndDate", source = "contractEndDate"),
            @Mapping(target = "contractLaborType", source = "contractLaborType"),
            @Mapping(target = "contractStartDate", source = "contractStartDate"),
            @Mapping(target = "initialContractCode", source = "initialContractCode"),
            @Mapping(target = "intlBusUnitId", source = "intlBusUnitId"),
            @Mapping(target = "itemNum", source = "itemNum"),
            @Mapping(target = "orderNum", source = "orderNum"),
            @Mapping(target = "originalOrderNum", source = "originalOrderNum"),
            @Mapping(target = "customerBuid", source = "customerBuid"),
            @Mapping(target = "customerNumber", source = "customerNumber"),
            @Mapping(target = "contractStatusChangedDts", source = "contractStatusChangedDts"),

    })
    CustomerContractDTO map(SearchCustomerContractKeyFields source);

    default Page<CustomerContractDTO> map(Page<SearchCustomerContractKeyFields> page){
        return page.map(this::map);
    }
}
