package com.exp.services.gp.web.customerproductlocation;

import com.exp.services.gp.services.partylocation.GetAddressService;
import com.exp.services.gp.services.partylocation.GetPartyService;
import com.exp.services.gp.services.partylocation.dto.PartyDTO;
import com.exp.services.gp.services.partylocation.response.AddressResponse;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class GetPartyController {
    GetPartyService getPartyService;
    GetAddressService getAddressService;

    @RequestMapping(value = "/party/{partyId}", method = RequestMethod.GET)
    public PartyDTO byCustomerNumberAndBuid(@PathVariable("partyId") String partyId) {
        return getPartyService.byPartyId(Long.valueOf(partyId));
    }

    @RequestMapping(value = "/address/{addressId}", method = RequestMethod.GET)
    public AddressResponse byCustomerNumberAndBuid(@PathVariable("addressId") String addressId, Pageable pageable) {
        return getAddressService.byAddressId(Long.valueOf(addressId), pageable);
    }
}
