package com.exp.services.gp.services.customerproductlocation;

import com.exp.services.gp.repository.customerproductlocation.GetCustomerProductRepository;
import com.exp.services.gp.services.customerproductlocation.dto.CustomerProductDTO;
import com.exp.services.gp.services.customerproductlocation.mapper.CustomerProductMapper;
import com.exp.services.gp.services.customerproductlocation.mapper.SearchCustomerProductKeyFields;
import com.exp.services.gp.services.customerproductlocation.response.CustomerProductResponse;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Slf4j
public class GetCustomerProductService {
    GetCustomerProductRepository getCustomerProductRepository;
    CustomerProductMapper customerProductMapper;

    public CustomerProductResponse byCustomerNumberAndBuid(Long customerNumber, Long customerBuid, Pageable pagaable) {
        CustomerProductResponse customerProductResponse = new CustomerProductResponse();
        Page<SearchCustomerProductKeyFields> customerProductDatas = getCustomerProductRepository.findByCustomerNumberAndCustomerBuid(customerNumber, customerBuid, pagaable);
        Page<CustomerProductDTO> customerProducts = customerProductMapper.map(customerProductDatas);
        customerProductResponse.setCustomerProducts(customerProducts);
        log.info("Returning Response back to calling service");
        return customerProductResponse;
    }
}
