package com.exp.services.gp.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "PURPOSE", schema = "SDR")
@Data
public class Purpose implements Serializable {

    @Id
    @Column(name = "PURPOSE_ID", unique = true, nullable = false, precision = 22)
    private Long purposeId;

    @Column(name = "PURPOSE_NAME", nullable = false)
    private String purposeName;
}
