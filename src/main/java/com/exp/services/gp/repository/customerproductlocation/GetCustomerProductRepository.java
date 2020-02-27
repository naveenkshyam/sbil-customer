package com.exp.services.gp.repository.customerproductlocation;


import com.exp.services.gp.domain.CustomerProduct;
import com.exp.services.gp.services.customerproductlocation.mapper.SearchCustomerProductKeyFields;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
@RefreshScope
public interface GetCustomerProductRepository extends PagingAndSortingRepository<CustomerProduct, Long> {
   Page<SearchCustomerProductKeyFields> findByCustomerNumberAndCustomerBuid(Long customerNumber, Long customerBuid, Pageable pagaable);
}
