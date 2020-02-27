package com.exp.services.gp.services.partylocation;

import com.exp.services.gp.repository.partylocation.GetAddressRepository;
import com.exp.services.gp.services.partylocation.dto.AddressDTO;
import com.exp.services.gp.services.partylocation.mapper.AddressMapper;
import com.exp.services.gp.services.partylocation.mapper.SearchAddressKeyFields;
import com.exp.services.gp.services.partylocation.response.AddressResponse;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class GetAddressService {
    GetAddressRepository getAddressRepository;
    AddressMapper addressMapper;

    public AddressResponse byAddressId(Long addressId, Pageable pageable) {
        Page<SearchAddressKeyFields> searchAddresses = getAddressRepository.findByAddressId(addressId, pageable);
        Page<AddressDTO> addresses = addressMapper.map(searchAddresses);
        AddressResponse addressResponse = new AddressResponse();
        addressResponse.setAddressDTO(addresses);
        return addressResponse;
    }
}
