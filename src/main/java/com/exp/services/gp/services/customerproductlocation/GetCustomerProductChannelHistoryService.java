package com.exp.services.gp.services.customerproductlocation;


import com.exp.services.gp.repository.customerproductlocation.GetCustomerProductChannelHistoryRepository;
import com.exp.services.gp.services.customerproductlocation.dto.CustomerProductChannelHistoryDTO;
import com.exp.services.gp.services.customerproductlocation.mapper.CustomerProductChannelHistoryMapper;
import com.exp.services.gp.services.customerproductlocation.mapper.SearchCustomerProductChannelHistoryKeyFields;
import com.exp.services.gp.services.customerproductlocation.response.CustomerProductChannelHistoryResponse;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class GetCustomerProductChannelHistoryService {
    GetCustomerProductChannelHistoryRepository getCustomerProductChannelHistoryRepository;
    CustomerProductChannelHistoryMapper customerProductChannelHistoryMapper;

    public CustomerProductChannelHistoryResponse byCustomerProductId(Long customerProductId, Pageable pageable) {
        Page<SearchCustomerProductChannelHistoryKeyFields> customerProductChannelHistoryData = getCustomerProductChannelHistoryRepository.findByCustomerProductCustomerProductId(customerProductId, pageable);
        CustomerProductChannelHistoryResponse customerProductChannelHistoryResponse = new CustomerProductChannelHistoryResponse();
        Page<CustomerProductChannelHistoryDTO> customerProductChannelHistoryDTO = customerProductChannelHistoryMapper.map(customerProductChannelHistoryData);
        customerProductChannelHistoryResponse.setChannelHistoryDTO(customerProductChannelHistoryDTO);
        return customerProductChannelHistoryResponse;
    }
}
