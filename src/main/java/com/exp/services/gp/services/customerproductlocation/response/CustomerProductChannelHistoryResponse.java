package com.exp.services.gp.services.customerproductlocation.response;

import com.exp.services.gp.services.customerproductlocation.dto.CustomerProductChannelHistoryDTO;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.domain.Page;

@Data
@ToString
public class CustomerProductChannelHistoryResponse {
    Page<CustomerProductChannelHistoryDTO> channelHistoryDTO;
}
