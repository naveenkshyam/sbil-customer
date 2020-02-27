package com.exp.services.gp.services.customerproductlocation.response;

import com.exp.services.gp.services.customerproductlocation.dto.CustomerProductPartyLocationDTO;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.domain.Page;

@Data
@ToString
public class CustomerProductPartyLocationResponse {
    private Page<CustomerProductPartyLocationDTO> customerProductPartyLocationDTOS;
}
