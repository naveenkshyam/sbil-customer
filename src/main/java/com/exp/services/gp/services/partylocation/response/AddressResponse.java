package com.exp.services.gp.services.partylocation.response;

import com.exp.services.gp.services.partylocation.dto.AddressDTO;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.domain.Page;

@Data
@ToString
public class AddressResponse {
    Page<AddressDTO> addressDTO;
}
