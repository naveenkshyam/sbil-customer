package com.exp.services.gp.repository.customerproductlocation;


import com.exp.services.gp.domain.CustomerProductLocation;
import com.exp.services.gp.services.customerproductlocation.mapper.SearchCustomerProductLocationKeyFields;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
@RefreshScope
public interface GetCustomerProductLocationRepository extends PagingAndSortingRepository<CustomerProductLocation, Long> {

   Page<SearchCustomerProductLocationKeyFields> findByCustomerProductId(Long customerProductId, Pageable pageable);
}
