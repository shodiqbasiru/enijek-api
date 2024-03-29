package com.enigma.enijek.model.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BrandResponse {
    private Integer id;
    private String brandName;
    private String modelName;
    private List<BrandInfoResponse> driverList;
}
