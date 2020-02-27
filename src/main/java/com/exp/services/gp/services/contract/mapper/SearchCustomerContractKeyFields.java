package com.exp.services.gp.services.contract.mapper;

import java.util.Calendar;

public interface SearchCustomerContractKeyFields {
    Long getCustomerContractId();

    Long getVendorId();

    Long getSourceSiteId();

    Long getOriginalOrderBuid();

    Long getOrderBuid();

    String getContractBasisType();

    Calendar getContractEndDate();

    String getContractLaborType();

    Calendar getContractStartDate();

    String getInitialContractCode();

    Short getIntlBusUnitId();

    String getItemNum();

    String getOrderNum();

    String getOriginalOrderNum();

    Long getCustomerBuid();

    Long getCustomerNumber();

    Calendar getContractStatusChangedDts();
}
