package com.exp.services.gp.repository.customerproductlocation;


import com.exp.services.gp.domain.CustomerProductPartyLocation;
import com.exp.services.gp.services.customerproductlocation.mapper.SearchCustomerProductPartyLocationKeyFields;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
@RefreshScope
public interface GetCustomerProductPartyLocationRepository  extends PagingAndSortingRepository<CustomerProductPartyLocation, Long> {

    Page<SearchCustomerProductPartyLocationKeyFields> findByCustomerProductCustomerProductId(Long customerProductId, Pageable pageable);
}
