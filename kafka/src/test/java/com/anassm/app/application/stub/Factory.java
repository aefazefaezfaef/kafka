package com.anassm.app.application.stub;

import com.anassm.app.infrastructure.in.rest.dto.OrderDto;
import com.anassm.app.infrastructure.in.rest.dto.ProductDto;

import java.time.Instant;
import java.util.Date;
import java.util.UUID;

public class Factory {

    public static ProductDto product(String name, double price, int quantity) {
        return ProductDto.builder()
                .id(UUID.randomUUID().toString())
                .name(name)
                .price(price)
                .quantity(quantity)
                .build();
    }

    public static OrderDto order(String product_id, int quantity) {
        return OrderDto.builder()
                .id(UUID.randomUUID().toString())
                .product_id(product_id)
                .quantity(quantity)
                .date(Date.from(Instant.now()))
                .build();
    }
}
