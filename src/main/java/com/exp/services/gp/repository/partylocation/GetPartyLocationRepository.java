package com.exp.services.gp.repository.partylocation;


import com.exp.services.gp.domain.PartyLocation;
import com.exp.services.gp.services.partylocation.mapper.SearchPartyLocationKeyFields;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
@RefreshScope
public interface GetPartyLocationRepository  extends PagingAndSortingRepository<PartyLocation, Long> {
    SearchPartyLocationKeyFields findByPartyLocationId(Long partyLocationId);
}
