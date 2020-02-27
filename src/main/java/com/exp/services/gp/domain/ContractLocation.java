package com.exp.services.gp.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@SuppressWarnings("serial")
@Entity
@Table(name = "CONTRACT_LOCATION", schema = "SDR")
@Data
public class ContractLocation implements java.io.Serializable {

    @Id
    @Column(name = "CONTRACT_LOCATION_ID", unique = true, nullable = false, precision = 22, scale = 0)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "sequence")
    @SequenceGenerator(name = "sequence", sequenceName = "CONTRACT_LOCATION_SEQ")
    private Long contractLocationId;

    @Column(name = "SOURCE_SITE_ID", unique = true, nullable = false, precision = 22)
    private Long sourceSiteId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ADDRESS_TYPE_CODE", nullable = false)
    private AddressType addressType;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CUSTOMER_CONTRACT_ID", nullable = false)
    private CustomerContract customerContract;

    @Column(name = "ACTIVE_ADDRESS", length = 4)
    private String activeAddress;

    @Column(name = "ADDRESS_1", length = 1200)
    private String address1;

    @Column(name = "ADDRESS_2", length = 1200)
    private String address2;

    @Column(name = "ADDRESS_3", length = 1200)
    private String address3;

    @Column(name = "ADDRESS_4", length = 1200)
    private String address4;

    @Column(name = "CITY_NAME", length = 1200)
    private String cityName;

    @Column(name = "COUNTY", length = 1200)
    private String county;

    @Column(name = "POSTAL_CODE", length = 1200)
    private String postalCode;

    @Column(name = "ISO_COUNTRY_CODE", length = 8)
    private String isoCountryCode;

    @Column(name = "SUBDIVISION_CODE", length = 20)
    private String subdivisionCode;

    @Column(name = "COMPANY_NAME", length = 600)
    private String companyName;

    @Column(name = "GEO_CODE", length = 40)
    private String geoCode;

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((contractLocationId == null) ? 0 : contractLocationId.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (!(obj instanceof ContractLocation))
            return false;
        ContractLocation other = (ContractLocation) obj;
        if (contractLocationId == null) {
            if (other.contractLocationId != null)
                return false;
        } else if (!contractLocationId.equals(other.contractLocationId))
            return false;
        return true;
    }

}
