package com.exp.services.gp.web.customerproductlocation;

import com.exp.services.gp.services.customerproductlocation.GetCustomerProductService;
import com.exp.services.gp.services.customerproductlocation.response.CustomerProductResponse;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class GetCustomerProductController {
    private final GetCustomerProductService getCustomerProductService;

    @RequestMapping(value = "/customerProduct/{customerNumber}", method = RequestMethod.GET, params = {"customerBuid"})
    public CustomerProductResponse byCustomerNumberAndBuid(@PathVariable("customerNumber") String customerNumber, @RequestParam("customerBuid") String customerBuid, Pageable pageable) {
        return getCustomerProductService.byCustomerNumberAndBuid(Long.valueOf(customerNumber), Long.valueOf(customerBuid), pageable);
    }

}
