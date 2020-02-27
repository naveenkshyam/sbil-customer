package com.exp.services.gp.repository.partylocation;


import com.exp.services.gp.domain.Party;
import com.exp.services.gp.services.partylocation.mapper.SearchPartyKeyFields;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
@RefreshScope
public interface GetPartyRepository  extends PagingAndSortingRepository<Party, Long> {
    SearchPartyKeyFields findByPartyId(Long partyId);
}
