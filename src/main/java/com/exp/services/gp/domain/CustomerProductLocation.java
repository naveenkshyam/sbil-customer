package com.exp.services.gp.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name="CUSTOMER_PRODUCT_LOCATION", schema = "SDR")
@Data
public class CustomerProductLocation implements Serializable {
    @Id
    @Column(name="CUSTOMER_PRODUCT_LOCATION_ID")
    private Long customerProductLocationId;

    @Column(name="ADDRESS_SEQ_NUM")
    private Long addressSeqNum;

    @Column(name="ADDRESS_TYPE_CODE")
    private String addressTypeCode;

    @Column(name="ALT_CONTACT_NAME")
    private String altContactName;

    @Column(name="CUSTOMER_PRODUCT_ID")
    private Long customerProductId;

    @Column(name="EMAIL_ADDRESS")
    private String emailAddress;

    @Column(name="PHONE_NUM")
    private String phoneNum;

    @Column(name="SOURCE_SITE_ID")
    private Long sourceSiteId;

}
