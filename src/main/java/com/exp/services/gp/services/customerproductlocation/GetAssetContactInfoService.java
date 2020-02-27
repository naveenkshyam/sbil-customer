package com.exp.services.gp.services.customerproductlocation;


import com.exp.services.gp.repository.customerproductlocation.GetAssetContactInfoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class GetAssetContactInfoService {
    GetAssetContactInfoRepository getAssetContactInfoRepository;
}
