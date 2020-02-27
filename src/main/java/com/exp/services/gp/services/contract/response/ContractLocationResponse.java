package com.exp.services.gp.services.contract.response;

import com.exp.services.gp.services.contract.dto.ContractLocationDTO;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.domain.Page;

@Data
@ToString
public class ContractLocationResponse {
    Page<ContractLocationDTO> contractLocationDTOs;
}
