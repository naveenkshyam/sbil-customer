package com.exp.services.gp.services.customerproductlocation.dto;

import lombok.Data;
import lombok.ToString;

import java.util.Calendar;


@Data
@ToString
public class CustomerProductDTO {
    private Long customerProductId;
    private Long sourceSiteId;
    private Long customerProductStatusId;
    private String customerProductStatusDesc;
    private String activeFlag;
    private Long orderBuid;
    private String assetTag;
    private String barCode;
    private Long customerBuid;
    private Long customerNumber;
    private String endOfLeaseFlag;
    private Long installGrpId;
    private String itemClass;
    private Long lobGrpId;
    private Long locationGrpId;
    private String locationNum;
    private String machineType;
    private String orderNum;
    private String mfgSerialNum;
    private String svcTagId;
    private Calendar shippedDate;
    private Long partSourceSiteId;
    private String localChannel;
    private Long orderTieNum;
    private Short intlBusUnitId;
    private String orderCompanyNum;
    private String orderSourceType;
    private String cfiFormatFlag;
    private String cfiNum;
    private String originalOrderCompanyNum;
    private Long masterOrderConfigId;
    private Long orderSetId;
    private Long maxSourceDetailSeqNum;
    private Long machineTypeId;
    private Long originalCustomerBuid;
    private Long originalCustomerNum;
    private String tiedToAssetFlag;
    private Calendar installDate;
    private Calendar deInstallDate;
}
