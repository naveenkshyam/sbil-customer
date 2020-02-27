package com.exp.services.gp.domain;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "EMAIL_ADDRESS", schema = "SDR")
@Data
public class EmailAddress implements java.io.Serializable {

    @Id
    @Column(name = "EMAIL_ADDRESS_ID", unique = true, nullable = false, precision = 22, scale = 0)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "sequence")
    @SequenceGenerator(name = "sequence", sequenceName = "EMAIL_ADDRESS_SEQ")
    private Long emailAddressId;

    @Column(name = "EMAIL_ADDRESS", nullable = false, length = 400)
    private String emailAddress;

    @Column(name = "ACTIVE_FLAG", nullable = false, length = 4)
    private String activeFlag;

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((emailAddressId == null) ? 0 : emailAddressId.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (!(obj instanceof EmailAddress))
            return false;
        EmailAddress other = (EmailAddress) obj;
        if (emailAddressId == null) {
            if (other.emailAddressId != null)
                return false;
        } else if (!emailAddressId.equals(other.emailAddressId))
            return false;
        return true;
    }

}
