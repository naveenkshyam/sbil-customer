package com.exp.services.gp.repository.contract;


import com.exp.services.gp.domain.ContractLocation;
import com.exp.services.gp.services.contract.mapper.SearchContractLocationKeyFields;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
@RefreshScope
public interface GetContractLocationRepository extends PagingAndSortingRepository<ContractLocation, Long> {
    Page<SearchContractLocationKeyFields> findByCustomerContractCustomerContractId(Long customerContractId, Pageable pageable);
}
