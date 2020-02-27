package com.exp.services.gp.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "PARTY_LOCATION", schema = "SDR")
@Data
public class PartyLocation implements Serializable {

    @Id
    @Column(name = "PARTY_LOCATION_ID", unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "sequence")
    @SequenceGenerator(name = "sequence", sequenceName = "PARTY_LOCATION_SEQ")
    private Long partyLocationId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PARTY_ID", nullable = true)
    private Party party;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ADDRESS_ID", nullable = true)
    private Address address;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PURPOSE_ID", nullable = true)
    private Purpose purpose;

    @Column(name = "CAM_LOCATION_ID")
    private Long camLocId;

    @Column(name = "CUSTOMER_NUM", length = 100)
    private String customerNumber;

    @Column(name = "CUSTOMER_BUSINESS_UNIT_ID")
    private Long customerBuid;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "STATUS_ID")
    private Status status;

    @Column(name = "AFFINITY_ID", length = 100)
    private String affinityId;

}
