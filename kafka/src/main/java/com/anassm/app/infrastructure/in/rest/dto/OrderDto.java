package com.anassm.app.infrastructure.in.rest.dto;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Builder
@Data
public class OrderDto {
    private String id;
    private String product_id;
    private Date date;
    private int quantity;
}
