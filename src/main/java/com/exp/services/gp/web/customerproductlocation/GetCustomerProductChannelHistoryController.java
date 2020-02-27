package com.exp.services.gp.web.customerproductlocation;

import com.exp.services.gp.services.customerproductlocation.GetCustomerProductChannelHistoryService;
import com.exp.services.gp.services.customerproductlocation.response.CustomerProductChannelHistoryResponse;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class GetCustomerProductChannelHistoryController {
    GetCustomerProductChannelHistoryService getCustomerProductChannelHistoryService;

    @RequestMapping(value = "/customerProductChannelHistory/{customerProductId}", method = RequestMethod.GET)
    public CustomerProductChannelHistoryResponse byCustomerProductId(@PathVariable("customerProductId") String customerProductId, Pageable pageable) {
        return getCustomerProductChannelHistoryService.byCustomerProductId(Long.valueOf(customerProductId), pageable);
    }
}
