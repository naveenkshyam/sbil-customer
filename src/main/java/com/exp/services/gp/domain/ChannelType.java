package com.exp.services.gp.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@SuppressWarnings("serial")
@Entity
@Table(name = "CHANNEL_TYPE", schema = "SDR")
@Data
public class ChannelType implements java.io.Serializable {

    @Id
    @Column(name = "CHANNEL_TYPE_ID", unique = true, nullable = false, precision = 22)
    private Long channelTypeId;

    @Column(name = "CHANNEL_TYPE_NAME", nullable = false, length = 250)
    private String channelTypeName;

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((channelTypeId == null) ? 0 : channelTypeId.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (!(obj instanceof ChannelType))
            return false;
        ChannelType other = (ChannelType) obj;
        if (channelTypeId == null) {
            if (other.channelTypeId != null)
                return false;
        } else if (!channelTypeId.equals(other.channelTypeId))
            return false;
        return true;
    }

}
