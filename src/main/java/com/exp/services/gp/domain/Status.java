package com.exp.services.gp.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "STATUS", schema = "SDR")
@Data
public class Status implements java.io.Serializable{

    @Id
    @Column(name = "STATUS_ID", unique = true, nullable = false)
    private Long statusId;

    @Column(name = "STATUS_CODE", nullable = false, length = 5)
    private String statusCode;

    @Column(name = "STATUS_DESC", length = 60)
    private String statusDesc;
}
