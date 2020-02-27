package com.exp.services.gp.domain;

import lombok.Data;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Calendar;


@SuppressWarnings("serial")
@Entity
@Table(name = "CUSTOMER_CONTRACT", schema = "SDR", uniqueConstraints = @UniqueConstraint(columnNames = {"CUSTOMER_CONTRACT_ID", "CONTRACT_START_DATE", "CONTRACT_END_DATE"}))
@Data
public class CustomerContract implements java.io.Serializable {

    @Id
    @Column(name = "CUSTOMER_CONTRACT_ID", unique = true, nullable = false, precision = 22)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "sequence")
    @SequenceGenerator(name = "sequence", sequenceName = "CUST_CONTRACT_SEQ")
    private Long customerContractId;

    @Column(name = "VENDOR_ID", unique = true, nullable = false, precision = 22)
    private Long vendorId;

    @Column(name = "SOURCE_SITE_ID", unique = true, nullable = false, precision = 22)
    private Long sourceSiteId;

    @Column(name = "ORIGINAL_ORDER_BUID", nullable = false, precision = 22)
    private Long originalOrderBuid;

    @Column(name = "ORDER_BUSINESS_UNIT_ID", unique = true, nullable = false, precision = 22)
    private Long orderBuid;

    @Column(name = "CONTRACT_BASIS_TYPE", nullable = false, length = 4)
    private String contractBasisType;

    @Column(name = "CONTRACT_END_DATE")
    private Calendar contractEndDate;

    @Column(name = "CONTRACT_LABOR_TYPE", nullable = false, length = 4)
    private String contractLaborType;

    @Column(name = "CONTRACT_START_DATE")
    private Calendar contractStartDate;

    @Column(name = "INITIAL_CONTRACT_CODE", nullable = false, length = 8)
    private String initialContractCode;

    @Column(name = "INTL_BUS_UNIT_ID", precision = 4, scale = 0)
    private Short intlBusUnitId;

    @Column(name = "ITEM_NUM", length = 100)
    private String itemNum;

    @Column(name = "ORDER_NUM", nullable = false, length = 72)
    private String orderNum;

    @Column(name = "ORIGINAL_ORDER_NUM", nullable = false, length = 72)
    private String originalOrderNum;

    @Column(name = "CUSTOMER_BUSINESS_UNIT_ID", nullable = false, precision = 22)
    private Long customerBuid;

    @Column(name = "CUSTOMER_NUM", nullable = false, precision = 22)
    private Long customerNumber;

    @Column(name = "CONTRACT_STATUS_CHANGED_DTS")
    private Calendar contractStatusChangedDts;

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((customerContractId == null) ? 0 : customerContractId.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (!(obj instanceof CustomerContract))
            return false;
        CustomerContract other = (CustomerContract) obj;
        if (customerContractId == null) {
            if (other.customerContractId != null)
                return false;
        } else if (!customerContractId.equals(other.customerContractId))
            return false;
        return true;
    }

}
