package com.exp.services.gp.repository.contract;


import com.exp.services.gp.domain.CustomerContract;
import com.exp.services.gp.services.contract.mapper.SearchCustomerContractKeyFields;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
@RefreshScope
public interface GetCustomerContractRepository extends PagingAndSortingRepository<CustomerContract, Long> {
    Page<SearchCustomerContractKeyFields> findByCustomerNumberAndCustomerBuid(Long customerNumber, Long customerBuid, Pageable pageable);
}
