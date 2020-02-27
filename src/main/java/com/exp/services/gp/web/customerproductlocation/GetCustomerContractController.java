package com.exp.services.gp.web.customerproductlocation;

import com.exp.services.gp.services.contract.GetContractLocationService;
import com.exp.services.gp.services.contract.GetCustomerContractService;
import com.exp.services.gp.services.contract.response.ContractLocationResponse;
import com.exp.services.gp.services.contract.response.CustomerContractResponse;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class GetCustomerContractController {
    GetCustomerContractService getCustomerContractService;
    GetContractLocationService getContractLocationService;

    @RequestMapping(value = "/customerContract/{customerNumber}", method = RequestMethod.GET, params = {"customerBuid"})
    public CustomerContractResponse byCustomerNumberAndBuid(@PathVariable("customerNumber") String customerNumber, @RequestParam("customerBuid") String customerBuid, Pageable pageable) {
        return getCustomerContractService.byCustomerNumberAndBuid(Long.valueOf(customerNumber), Long.valueOf(customerBuid), pageable);
    }

    @RequestMapping(value = "/contract/{customerContractId}", method = RequestMethod.GET)
    public ContractLocationResponse byCustomerNumberAndBuid(@PathVariable("customerContractId") String customerContractId, Pageable pageable) {
        return getContractLocationService.byCustomerContractId(Long.valueOf(customerContractId), pageable);
    }
}
