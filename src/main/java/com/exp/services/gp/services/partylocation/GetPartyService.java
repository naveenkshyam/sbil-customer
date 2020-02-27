package com.exp.services.gp.services.partylocation;

import com.exp.services.gp.repository.partylocation.GetPartyRepository;
import com.exp.services.gp.services.partylocation.dto.PartyDTO;
import com.exp.services.gp.services.partylocation.mapper.PartyMapper;
import com.exp.services.gp.services.partylocation.mapper.SearchPartyKeyFields;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class GetPartyService {
    GetPartyRepository getPartyRepository;
    PartyMapper partyMapper;

    public PartyDTO byPartyId(Long partyId) {
        SearchPartyKeyFields searchPartyData = getPartyRepository.findByPartyId(partyId);
        return partyMapper.map(searchPartyData);
    }
}
