package com.exp.services.gp.services.contract;

import com.exp.services.gp.repository.contract.GetCustomerContractRepository;
import com.exp.services.gp.services.contract.dto.CustomerContractDTO;
import com.exp.services.gp.services.contract.mapper.CustomerContractMapper;
import com.exp.services.gp.services.contract.mapper.SearchCustomerContractKeyFields;
import com.exp.services.gp.services.contract.response.CustomerContractResponse;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class GetCustomerContractService {
    GetCustomerContractRepository getCustomerContractRepository;
    CustomerContractMapper customerContractMapper;
    public CustomerContractResponse byCustomerNumberAndBuid(Long customerNumber, Long customerBuid, Pageable pageable){
        Page<SearchCustomerContractKeyFields> searchData = getCustomerContractRepository.findByCustomerNumberAndCustomerBuid(customerNumber, customerBuid, pageable);
        Page<CustomerContractDTO> customerContractDTOs = customerContractMapper.map(searchData);
        CustomerContractResponse customerContractResponse = new CustomerContractResponse();
        customerContractResponse.setCustomerContractDTOS(customerContractDTOs);
        return customerContractResponse;
    }
}
