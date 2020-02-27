package com.exp.services.gp.services.customerproductlocation.dto;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class CustomerProductChannelHistoryDTO {
    private Long channelTypeId;

    private String channelTypeName;

    private Long customerBuid;

    private Long customerNum;

    private Long customerProductId;

    private Long customerProductChannelHistId;

    private Long orderBuid;

    private String orderNumber;

    private Long partyId;

    private String userAccountId;

    private String userAddress;

    private String userCity;

    private String userCountry;

    private String userName;

    private String userState;

    private String userStoreId;

    private String userStoreName;

    private String userZipCode;
}
