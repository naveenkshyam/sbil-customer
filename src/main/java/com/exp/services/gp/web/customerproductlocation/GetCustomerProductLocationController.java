package com.exp.services.gp.web.customerproductlocation;

import com.exp.services.gp.services.customerproductlocation.GetCustomerProductLocationService;
import com.exp.services.gp.services.customerproductlocation.response.CustomerProductLocationResponse;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@AllArgsConstructor
public class GetCustomerProductLocationController {

    private final GetCustomerProductLocationService getCustomerProductLocationService;

    @RequestMapping(value = "/customerProductLocation/{customerProductId}", method = RequestMethod.GET)
    public CustomerProductLocationResponse byCustomerProductId(@PathVariable("customerProductId") Long customerProductId, Pageable pageable) {
        return getCustomerProductLocationService.byCustomerProductId(customerProductId, pageable);
    }

}
