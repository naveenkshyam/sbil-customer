package com.exp.services.gp.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Calendar;
@Entity
@Table(name = "CUSTOMER_PRODUCT", schema="SDR")
@Data
public class CustomerProduct implements Serializable {
    @Id
    @Column(name = "CUSTOMER_PRODUCT_ID", unique = true, nullable = false, precision = 22)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "sequence")
    @SequenceGenerator(name = "sequence", sequenceName = "CUST_PROD_SEQ")
    private Long customerProductId;

    @Column(name = "SOURCE_SITE_ID", unique = true, nullable = false, precision = 22)
    private Long sourceSiteId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CUSTOMER_PRODUCT_STATUS_ID")
    private CustomerProductStatus customerProductStatus;

    @Column(name = "ORDER_BUSINESS_UNIT_ID", unique = true, nullable = false, precision = 22)
    private Long orderBuid;

    @Column(name = "ASSET_TAG", length = 80)
    private String assetTag;

    @Column(name = "BAR_CODE", length = 80)
    private String barCode;

    @Column(name = "CUSTOMER_BUSINESS_UNIT_ID", precision = 22)
    private Long customerBuid;

    @Column(name = "CUSTOMER_NUM", nullable = false, precision = 22)
    private Long customerNumber;

    @Column(name = "END_OF_LEASE_FLAG", length = 4)
    private String endOfLeaseFlag;

    @Column(name = "INSTALL_GRP_ID", precision = 22)
    private Long installGrpId;

    @Column(name = "ITEM_CLASS", length = 20)
    private String itemClass;

    @Column(name = "LOB_GRP_ID", precision = 220)
    private Long lobGrpId;

    @Column(name = "LOCATION_GRP_ID", precision = 22)
    private Long locationGrpId;

    @Column(name = "LOCATION_NUM", length = 8)
    private String locationNum;

    @Column(name = "MACHINE_TYPE", length = 32)
    private String machineType;

    @Column(name = "ORDER_NUM", nullable = false, length = 72)
    private String orderNum;

    @Column(name = "MFG_SERIAL_NUM", length = 120)
    private String mfgSerialNum;

    @Column(name = "SVC_TAG_ID", unique = true, length = 48)
    private String svcTagId;

    @Column(name = "SHIPPED_DATE")
    private Calendar shippedDate;

    @Column(name = "PART_SOURCE_SITE_ID", nullable = false, precision = 22)
    private Long partSourceSiteId;

    @Column(name = "LOCAL_CHANNEL", length = 20)
    private String localChannel;

    @Column(name = "SDR_CREATE_DATE")
    private Calendar sdrCreateDate;

    @Column(name = "SDR_UPDATE_DATE")
    private Calendar sdrUpdateDate;

    @Column(name = "ORDER_TIE_NUM", precision = 22)
    private Long orderTieNum;

    @Column(name = "INTL_BUS_UNIT_ID", precision = 4)
    private Short intlBusUnitId;

    @Column(name = "ORDER_COMPANY_NUM", length = 40)
    private String orderCompanyNum;

    @Column(name = "ORDER_SOURCE_TYPE", length = 24)
    private String orderSourceType;

    @Column(name = "CFI_FORMAT_FLAG", nullable = false, length = 4)
    private String cfiFormatFlag;

    @Column(name = "CFI_NUM", length = 24)
    private String cfiNum;

    @Column(name = "ORIGINAL_ORDER_COMPANY_NUM", length = 40)
    private String originalOrderCompanyNum;

    @Column(name = "MASTER_ORDER_CONFIG_ID", precision = 22)
    private Long masterOrderConfigId;

    @Column(name = "ORDER_SET_ID", precision = 22)
    private Long orderSetId;

    @Column(name = "MAX_SOURCE_DETAIL_SEQ_NUM", precision = 22)
    private Long maxSourceDetailSeqNum;

    @Column(name = "MACHINE_TYPE_ID", precision = 22)
    private Long machineTypeId;

    @Column(name = "ORIGINAL_CUSTOMER_BUID", precision = 22)
    private Long originalCustomerBuid;

    @Column(name = "ORIGINAL_CUSTOMER_NUM", precision = 22)
    private Long originalCustomerNum;

    @Column(name = "TIED_TO_ASSET_FLAG", length = 4)
    private String tiedToAssetFlag;

    @Column(name = "INSTALL_DATE")
    private Calendar installDate;

    @Column(name = "DE_INSTALL_DATE")
    private Calendar deInstallDate;

}
