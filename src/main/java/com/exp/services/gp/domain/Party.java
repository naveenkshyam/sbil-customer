package com.exp.services.gp.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "PARTY", schema = "SDR")
@Data
public class Party implements Serializable {

    @Id
    @Column(name = "PARTY_ID", unique = true, nullable = false, precision = 22, scale = 0)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "sequence")
    @SequenceGenerator(name = "sequence", sequenceName = "PARTY_SEQ")
    private Long partyId;

    @Column(name = "TITLE", nullable = true)
    private String title;

    @Column(name = "DEPARTMENT", nullable = true)
    private String department;

    @Column(name = "ORGANIZATION_NAME", nullable = true)
    private String organizationName;

    @Column(name = "GIVEN_NAME", nullable = true)
    private String givenName;

    @Column(name = "LAST_NAME", nullable = true)
    private String lastName;

    @Column(name = "MIDDLE_NAME", nullable = true)
    private String middleName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "LANGUAGE_ID", nullable = true)
    private Language language;

    @Column(name = "STATUS_ID")
    private Long statusId;

    @Column(name = "ALT_CONTACT_NAME", nullable = true)
    private String altContactName;

    @Column(name = "ALT_GIVEN_NAME", nullable = true)
    private String altGivenName;

    @Column(name = "ALT_MIDDLE_NAME", nullable = true)
    private String altMiddleName;

    @Column(name = "ALT_LAST_NAME", nullable = true)
    private String altLastName;
}
