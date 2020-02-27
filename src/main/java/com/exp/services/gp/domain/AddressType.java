package com.exp.services.gp.domain;
// Generated Mar 4, 2016 3:32:44 PM by Hibernate Tools 4.3.1.Final

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "ADDRESS_TYPE", schema = "SDR")
@Data
public class AddressType  implements java.io.Serializable {

    @Id
    @Column(name = "ADDRESS_TYPE_CODE", unique = true, nullable = false, length = 12)
    private String addressTypeCode;
    @Column(name = "ADDRESS_TYPE_DESC", length = 60)
    private String addressTypeDesc;

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((addressTypeCode == null) ? 0 : addressTypeCode.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (!(obj instanceof AddressType))
            return false;
        AddressType other = (AddressType) obj;
        if (addressTypeCode == null) {
            if (other.addressTypeCode != null)
                return false;
        } else if (!addressTypeCode.equals(other.addressTypeCode))
            return false;
        return true;
    }

}
