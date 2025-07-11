package com.anassm.app.infrastructure.in.rest;

import com.anassm.app.application.in.port.Listing;
import com.anassm.app.application.in.port.Ordering;
import com.anassm.app.infrastructure.in.rest.converter.OrderDtoMapper;
import com.anassm.app.infrastructure.in.rest.converter.ProductDtoMapper;
import com.anassm.app.infrastructure.in.rest.dto.OrderDto;
import com.anassm.app.infrastructure.in.rest.dto.ProductDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class Controller {

    @Autowired
    private Listing listing;
    @Autowired
    private ProductDtoMapper productDtoMapper;

    @Autowired
    private Ordering ordering;
    @Autowired
    private OrderDtoMapper orderDtoMapper;

    @GetMapping("/products")
    private List<ProductDto> list() {
        return listing.listProducts()
                .stream()
                .map(product -> productDtoMapper.entityToDTO(product))
                .toList();
    }

    @GetMapping("/products/{id}")
    private ProductDto get(@PathVariable String id) {
        return productDtoMapper.entityToDTO(listing.getProduct(id));
    }

    @PostMapping("/products")
    private String create(@RequestBody ProductDto productDto) {
        return listing.createProduct(productDtoMapper.dtoToEntity(productDto));
    }

    @GetMapping("/orders/{id}")
    private OrderDto getOrder(@PathVariable String id) {
        return null;
    }

    @PostMapping("/orders")
    private String makeOrder(@RequestBody OrderDto orderDto) {
        return null;
    }
}
