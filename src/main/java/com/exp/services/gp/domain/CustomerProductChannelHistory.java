package com.exp.services.gp.domain;

import java.io.Serializable;

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
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;


@SuppressWarnings("serial")
@Entity
@Table(name = "CUSTOMER_PRODUCT_CHANNEL_HIST", schema = "SDR")
@Data
public class CustomerProductChannelHistory implements Serializable {

    @ManyToOne(targetEntity = ChannelType.class)
    @Fetch(FetchMode.SELECT)
    @JoinColumn(name = "CHANNEL_TYPE_ID", nullable = false)
    @NotFound(action = NotFoundAction.IGNORE)
    private ChannelType channelType;

    @Column(name = "CUSTOMER_BUSINESS_UNIT_ID", nullable = true, precision = 22)
    private Long customerBuid;

    @Column(name = "CUSTOMER_NUM", nullable = true, precision = 22)
    private Long customerNum;

    @ManyToOne(fetch = FetchType.LAZY, targetEntity = CustomerProduct.class)
    @JoinColumn(name = "CUSTOMER_PRODUCT_ID", nullable = false)
    @Fetch(FetchMode.SELECT)
    private CustomerProduct customerProduct;

    @Id
    @Column(name = "CUSTOMER_PROD_CHANNEL_HIST_ID", unique = true, nullable = false, precision = 22)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "sequence")
    @SequenceGenerator(name = "sequence", sequenceName = "CUST_PROD_CHANNEL_HIST_SEQ")
    private Long customerProductChannelHistId;

    @Column(name = "ORDER_BUID", nullable = true, precision = 22)
    private Long orderBuid;

    @Column(name = "ORDER_NUM", nullable = true, precision = 72)
    private String orderNumber;

    @Column(name = "PARTY_ID", nullable = true, precision = 22)
    private Long partyId;

    @Column(name = "USER_ACCT_ID", nullable = true, precision = 400)
    private String userAccountId;

    @Column(name = "USER_ADDR", nullable = true, precision = 600)
    private String userAddress;

    @Column(name = "USER_CITY", nullable = true, precision = 600)
    private String userCity;

    @Column(name = "USER_COUNTRY", nullable = true, precision = 600)
    private String userCountry;

    @Column(name = "USER_NAME", nullable = true, precision = 600)
    private String userName;

    @Column(name = "USER_STATE", nullable = true, precision = 600)
    private String userState;

    @Column(name = "USER_STORE_ID", nullable = true, precision = 600)
    private String userStoreId;

    @Column(name = "USER_STORE_NAME", nullable = true, precision = 1200)
    private String userStoreName;

    @Column(name = "USER_ZIP_CODE", nullable = true, precision = 600)
    private String userZipCode;

}
