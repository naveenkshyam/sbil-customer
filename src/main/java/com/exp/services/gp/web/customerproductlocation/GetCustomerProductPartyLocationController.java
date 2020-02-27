package com.exp.services.gp.web.customerproductlocation;

import com.exp.services.gp.services.customerproductlocation.GetCustomerProductPartyLocationService;
import com.exp.services.gp.services.customerproductlocation.response.CustomerProductPartyLocationResponse;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class GetCustomerProductPartyLocationController {
    private final GetCustomerProductPartyLocationService getCustomerProductPartyLocationService;

    @RequestMapping(value = "/customerProductPartyLocation/{customerProductId}", method = RequestMethod.GET)
    public CustomerProductPartyLocationResponse byCustomerProductId(@PathVariable("customerProductId") Long customerProductId, Pageable pageable) {
        return getCustomerProductPartyLocationService.byCustomerProductId(customerProductId, pageable);
    }

}
