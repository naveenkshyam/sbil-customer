package com.exp.services.gp.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "LANGUAGE", schema = "SDR")
@Data
public class Language implements Serializable {

    @Id
    @Column(name = "LANGUAGE_ID", unique = true, nullable = false, precision = 22)
    private Long languageId;

    @Column(name = "LANGUAGE_DESC", length = 400)
    private String languageDesc;

    @Column(name = "ORIG_LANGUAGE_DESC", length = 400)
    private String origLanguageDesc;

    @Column(name = "LANGUAGE_CODE", length = 10)
    private String languageCode;

}
