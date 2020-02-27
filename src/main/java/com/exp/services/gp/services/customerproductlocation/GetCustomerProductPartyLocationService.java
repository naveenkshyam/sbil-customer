package com.exp.services.gp.services.customerproductlocation;


import com.exp.services.gp.repository.customerproductlocation.GetCustomerProductPartyLocationRepository;
import com.exp.services.gp.services.customerproductlocation.dto.CustomerProductPartyLocationDTO;
import com.exp.services.gp.services.customerproductlocation.mapper.CustomerProductPartyLocationMapper;
import com.exp.services.gp.services.customerproductlocation.mapper.SearchCustomerProductPartyLocationKeyFields;
import com.exp.services.gp.services.customerproductlocation.response.CustomerProductPartyLocationResponse;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class GetCustomerProductPartyLocationService {
    GetCustomerProductPartyLocationRepository getCustomerProdPartyLoc;
    CustomerProductPartyLocationMapper customerProductPartyLocationMapper;

    public CustomerProductPartyLocationResponse byCustomerProductId(Long customerProductId, Pageable pageable) {
        Page<SearchCustomerProductPartyLocationKeyFields> searchCustomerProductLocationData = getCustomerProdPartyLoc.findByCustomerProductCustomerProductId(customerProductId, pageable);
        Page<CustomerProductPartyLocationDTO> customerProductPartyLocationDTOS = customerProductPartyLocationMapper.map(searchCustomerProductLocationData);
        CustomerProductPartyLocationResponse customerProductPartyLocationResponse = new CustomerProductPartyLocationResponse();
        customerProductPartyLocationResponse.setCustomerProductPartyLocationDTOS(customerProductPartyLocationDTOS);
        return customerProductPartyLocationResponse;
    }
}
