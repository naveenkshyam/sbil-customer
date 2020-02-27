package com.exp.services.gp.repository.customerproductlocation;


import com.exp.services.gp.domain.AssetContactInfo;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
@RefreshScope
public interface GetAssetContactInfoRepository extends PagingAndSortingRepository<AssetContactInfo, Long> {
}
