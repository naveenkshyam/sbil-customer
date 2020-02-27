package com.exp.services.gp.web.customerproductlocation;

import com.exp.services.gp.services.partylocation.GetPartyLocationService;
import com.exp.services.gp.services.partylocation.dto.PartyLocationDTO;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class GetPartyLocationController {
    GetPartyLocationService getPartyLocationService;

    @RequestMapping(value = "/partyLocation/{partyLocationId}", method = RequestMethod.GET)
    public PartyLocationDTO byCustomerNumberAndBuid(@PathVariable("partyLocationId") String partyLocationId) {
        return getPartyLocationService.byPartyLocationId(Long.valueOf(partyLocationId));
    }
}
