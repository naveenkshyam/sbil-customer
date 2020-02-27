package com.exp.services.gp.repository.customerproductlocation;

import com.exp.services.gp.domain.CustomerProductChannelHistory;
import com.exp.services.gp.services.customerproductlocation.mapper.SearchCustomerProductChannelHistoryKeyFields;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
@RefreshScope
public interface GetCustomerProductChannelHistoryRepository extends PagingAndSortingRepository<CustomerProductChannelHistory, Long> {
    Page<SearchCustomerProductChannelHistoryKeyFields> findByCustomerProductCustomerProductId(Long customerProductId, Pageable pageable);
}
