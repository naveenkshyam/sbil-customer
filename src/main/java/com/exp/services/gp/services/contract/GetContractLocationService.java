package com.exp.services.gp.services.contract;

import com.exp.services.gp.repository.contract.GetContractLocationRepository;
import com.exp.services.gp.services.contract.dto.ContractLocationDTO;
import com.exp.services.gp.services.contract.mapper.ContractLocationMapper;
import com.exp.services.gp.services.contract.mapper.SearchContractLocationKeyFields;
import com.exp.services.gp.services.contract.response.ContractLocationResponse;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class GetContractLocationService {
    GetContractLocationRepository getContractLocationRepository;
    ContractLocationMapper contractLocationMapper;
    public ContractLocationResponse byCustomerContractId(Long customerContractId, Pageable pageable){
        Page<SearchContractLocationKeyFields> contractLocationData = getContractLocationRepository.findByCustomerContractCustomerContractId(customerContractId, pageable);
        ContractLocationResponse contractLocationResponse = new ContractLocationResponse();
        Page<ContractLocationDTO> contractLocationDTOs = contractLocationMapper.map(contractLocationData);
        contractLocationResponse.setContractLocationDTOs(contractLocationDTOs);
        return contractLocationResponse;
    }
}
