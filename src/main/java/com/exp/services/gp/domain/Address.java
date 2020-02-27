package com.exp.services.gp.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "ADDRESS", schema = "SDR")
@Data
public class Address implements Serializable {

    @Id
    @Column(name = "ADDRESS_ID", unique = true, nullable = false, precision = 22, scale = 0)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "sequence")
    @SequenceGenerator(name = "sequence", sequenceName = "ADDRESS_SEQ")
    private Long addressId;

    @Column(name = "LINE_1", nullable = false, length = 200)
    private String line1;

    @Column(name = "LINE_2", length = 200)
    private String line2;

    @Column(name = "LINE_3", length = 200)
    private String line3;

    @Column(name = "LINE_4", length = 200)
    private String line4;

    @Column(name = "CITY", length = 200)
    private String city;

    @Column(name = "COUNTY", length = 100)
    private String county;

    @Column(name = "PROVINCE", length = 50)
    private String province;

    @Column(name = "ISO_COUNTRY_CODE", length = 2)
    private String isoCountryCode;

    @Column(name = "POSTAL_CODE", length = 50)
    private String postalCode;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "LANGUAGE_ID")
    private Language language;
}
