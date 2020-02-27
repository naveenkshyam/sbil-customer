package com.exp.services.gp.services.partylocation;

import com.exp.services.gp.repository.partylocation.GetPartyLocationRepository;
import com.exp.services.gp.services.partylocation.dto.PartyLocationDTO;
import com.exp.services.gp.services.partylocation.mapper.PartyLocationMapper;
import com.exp.services.gp.services.partylocation.mapper.SearchPartyLocationKeyFields;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class GetPartyLocationService {
    GetPartyLocationRepository getPartyLocationRepository;
    PartyLocationMapper partyLocationMapper;

    public PartyLocationDTO byPartyLocationId(Long partyLocationId) {
        SearchPartyLocationKeyFields searchPartyLocationData = getPartyLocationRepository.findByPartyLocationId(partyLocationId);
        PartyLocationDTO partyLocationDTO = partyLocationMapper.map(searchPartyLocationData);
        return partyLocationDTO;

    }
}
