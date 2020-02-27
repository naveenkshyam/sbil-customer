package com.exp.services.gp.services.customerproductlocation.mapper;

import java.util.Calendar;

public interface SearchCustomerProductKeyFields {
     Long getCustomerProductId();
     CustomerProductStatus getCustomerProductStatus();

     interface CustomerProductStatus{
          Long getCustomerProductStatusId();
          String getCustomerProductStatusDesc();
          String getActiveFlag();
          //String getCustomerProductStatusCode();
     }

     Long getCustomerBuid();
     Long getCustomerNumber();
     String getAssetTag();
     String getOrderNum();
     String getSvcTagId();
     String getEndOfLeaseFlag();
     Long getInstallGrpId();
     String getItemClass();
     Long getLobGrpId();
     Long getLocationGrpId();
     String getLocationNum();
     String getMachineType();
     String getMfgSerialNum();
     Calendar getShippedDate();
     Long getSourceSiteId();
     Long getPartSourceSiteId();
     String getLocalChannel();
     Long getOrderTieNum();
     Short getIntlBusUnitId();
     Long getOrderBuid();
     String getOrderCompanyNum();
     String getOrderSourceType();
     String getCfiFormatFlag();
     String getCfiNum();
     String getOriginalOrderCompanyNum();
     Long getMasterOrderConfigId();
     Long getOrderSetId();
     Long getMaxSourceDetailSeqNum();
     Long getMachineTypeId();
     Long getOriginalCustomerBuid();
     Long getOriginalCustomerNum();
     String getTiedToAssetFlag();
     Calendar getInstallDate();
     Calendar getDeInstallDate();
     String getBarCode();

}
