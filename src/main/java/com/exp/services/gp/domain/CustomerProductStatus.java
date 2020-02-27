package com.exp.services.gp.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "CUSTOMER_PRODUCT_STATUS", schema = "SDR")
@Data
public class CustomerProductStatus implements Serializable {

    @Id
    @Column(name = "CUSTOMER_PRODUCT_STATUS_ID", unique = true, nullable = false, precision = 22, scale = 0)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "sequence")
    @SequenceGenerator(name = "sequence", sequenceName = "CUSTOMER_PRODUCT_STATUS_SEQ")
    private Long customerProductStatusId;

    @Column(name = "CUSTOMER_PRODUCT_STATUS_DESC", length = 600)
    private String customerProductStatusDesc;

    @Column(name = "ACTIVE_FLAG", nullable = false, length = 4)
    private String activeFlag;

    @Column(name = "CUSTOMER_PRODUCT_STATUS_CODE", length = 4)
    private String customerProductStatusCode;
}
