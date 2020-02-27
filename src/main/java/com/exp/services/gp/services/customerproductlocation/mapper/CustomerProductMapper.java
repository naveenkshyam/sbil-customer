package com.exp.services.gp.services.customerproductlocation.mapper;

import com.exp.services.gp.services.customerproductlocation.dto.CustomerProductDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.springframework.data.domain.Page;

@Mapper(componentModel = "spring")
public interface CustomerProductMapper {

    @Mappings({
            @Mapping(target = "customerProductId", source = "customerProductId"),
            @Mapping(target = "sourceSiteId", source = "sourceSiteId"),
            @Mapping(target = "customerProductStatusId", source = "customerProductStatus.customerProductStatusId"),
            @Mapping(target = "customerProductStatusDesc", source = "customerProductStatus.customerProductStatusDesc"),
            @Mapping(target = "activeFlag", source = "customerProductStatus.activeFlag"),
            @Mapping(target = "orderBuid", source = "orderBuid"),
            @Mapping(target = "assetTag", source = "assetTag"),
            @Mapping(target = "barCode", source = "barCode"),
            @Mapping(target = "customerBuid", source = "customerBuid"),
            @Mapping(target = "customerNumber", source = "customerNumber"),
            @Mapping(target = "endOfLeaseFlag", source = "endOfLeaseFlag"),
            @Mapping(target = "itemClass", source = "itemClass"),
            @Mapping(target = "lobGrpId", source = "lobGrpId"),
            @Mapping(target = "locationGrpId", source = "locationGrpId"),
            @Mapping(target = "locationNum", source = "locationNum"),
            @Mapping(target = "machineType", source = "machineType"),
            @Mapping(target = "orderNum", source = "orderNum"),
            @Mapping(target = "mfgSerialNum", source = "mfgSerialNum"),
            @Mapping(target = "svcTagId", source = "svcTagId"),
            @Mapping(target = "shippedDate", source = "shippedDate"),
            @Mapping(target = "partSourceSiteId", source = "partSourceSiteId"),
            @Mapping(target = "localChannel", source = "localChannel"),
            @Mapping(target = "orderTieNum", source = "orderTieNum"),
            @Mapping(target = "intlBusUnitId", source = "intlBusUnitId"),
            @Mapping(target = "orderCompanyNum", source = "orderCompanyNum"),
            @Mapping(target = "orderSourceType", source = "orderSourceType"),
            @Mapping(target = "cfiFormatFlag", source = "cfiFormatFlag"),
            @Mapping(target = "cfiNum", source = "cfiNum"),
            @Mapping(target = "originalOrderCompanyNum", source = "originalOrderCompanyNum"),
            @Mapping(target = "masterOrderConfigId", source = "masterOrderConfigId"),
            @Mapping(target = "maxSourceDetailSeqNum", source = "maxSourceDetailSeqNum"),
            @Mapping(target = "machineTypeId", source = "machineTypeId"),
            @Mapping(target = "originalCustomerBuid", source = "originalCustomerBuid"),
            @Mapping(target = "originalCustomerNum", source = "originalCustomerNum"),
            @Mapping(target = "tiedToAssetFlag", source = "tiedToAssetFlag"),
            @Mapping(target = "installDate", source = "installDate"),
            @Mapping(target = "deInstallDate", source = "deInstallDate"),


    })
    CustomerProductDTO map(SearchCustomerProductKeyFields source);

    default Page<CustomerProductDTO> map(Page<SearchCustomerProductKeyFields> page){
        return page.map(this::map);
    }
}
