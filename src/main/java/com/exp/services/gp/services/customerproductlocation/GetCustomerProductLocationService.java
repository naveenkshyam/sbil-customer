package com.exp.services.gp.services.customerproductlocation;

import com.exp.services.gp.repository.customerproductlocation.GetCustomerProductLocationRepository;
import com.exp.services.gp.services.customerproductlocation.dto.CustomerProductLocationDTO;
import com.exp.services.gp.services.customerproductlocation.mapper.CustomerProductLocationMapper;
import com.exp.services.gp.services.customerproductlocation.mapper.SearchCustomerProductLocationKeyFields;
import com.exp.services.gp.services.customerproductlocation.response.CustomerProductLocationResponse;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Slf4j
public class GetCustomerProductLocationService {
    GetCustomerProductLocationRepository getCustomerProductLocationRepository;
    private CustomerProductLocationMapper customerProductLocationMapper;

    public CustomerProductLocationResponse byCustomerProductId(Long customerProductId, Pageable pageable) {
        Page<SearchCustomerProductLocationKeyFields> customerProductLocationKeyFields = getCustomerProductLocationRepository.findByCustomerProductId(customerProductId, pageable);
        CustomerProductLocationResponse response = new CustomerProductLocationResponse();
        Page<CustomerProductLocationDTO> customerProductLocationDataPage = customerProductLocationMapper.map(customerProductLocationKeyFields);
        response.setCustomerProductLocationDataPage(customerProductLocationDataPage);
        log.info("Returning response back to calling service");
        return response;
    }
}
