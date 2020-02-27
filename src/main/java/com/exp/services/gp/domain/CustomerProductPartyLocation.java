package com.exp.services.gp.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "CUSTOMER_PRODUCT_PARTY_LOC", schema = "SDR")
@Data
public class CustomerProductPartyLocation implements Serializable {

    @Id
    @Column(name = "CUSTOMER_PRODUCT_PARTY_LOC_ID", unique = true, nullable = false, precision = 22, scale = 0)
    private Long customerProductPartyLocationId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CUSTOMER_PRODUCT_ID", nullable = false)
    private CustomerProduct customerProduct;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PARTY_ID", nullable = true)
    private Party party;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PURPOSE_ID", nullable = false)
    private Purpose purpose;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ADDRESS_ID", nullable = true)
    private Address address;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PARTY_LOCATION_ID", nullable = false)
    private PartyLocation partyLocation;

    @Column(name = "SEQUENCE_NUM")
    private Long sequenceNum;

    @Column(name = "ROUTE_TO_MARKET")
    private String routeToMarket;

    @Column(name = "RANK", precision = 22, scale = 0)
    private Long rank;

}
