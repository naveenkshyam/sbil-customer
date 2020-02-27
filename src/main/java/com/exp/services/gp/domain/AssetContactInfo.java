package com.exp.services.gp.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "ASSET_CONTACT_INFO", schema = "sdr_stat")
@Data
public class AssetContactInfo  implements Serializable {

    @Id
    @Column(name = "CUSTOMER_PRODUCT_LOCATION_ID",unique = true, nullable = false)
    private Long customerProductLocationId;

    @Column(name = "CONTACT_FIRST_NAME",length = 150)
    private String contactFirstName;

    @Column(name = "CONTACT_MIDDLE_INITIAL",length = 150)
    private String contactMiddleInitial;

    @Column(name = "CONTACT_LAST_NAME",length = 150)
    private String contactLastName;

    @Column(name = "CUSTOMER_EXTERNAL_ID",length = 50)
    private String customerExternalId;

    @Column(name = "EMAIL_ADDRESS",length = 200)
    private String emailAddress;

    @Column(name = "PRIMARY_PHONE",length = 60)
    private String primaryPhone;

    @Column(name = "PHONE_NUMBER_EXTENSION",length = 20)
    private String phoneNumberExtension;

    @Column(name = "COUNTRY_CODE_PHONE",length = 10)
    private String countryCodePhone;

}
