package com.exp.services.gp.repository.partylocation;


import com.exp.services.gp.domain.Address;
import com.exp.services.gp.services.partylocation.mapper.SearchAddressKeyFields;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
@RefreshScope
public interface GetAddressRepository extends PagingAndSortingRepository<Address, Long> {
    Page<SearchAddressKeyFields> findByAddressId(Long addressId, Pageable pageable);
}
