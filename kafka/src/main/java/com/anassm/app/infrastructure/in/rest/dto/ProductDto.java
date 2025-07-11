package com.anassm.app.infrastructure.in.rest.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ProductDto {
    private String id;
    private String name;
    private double price;
    private int quantity;
}
