package com.anassm.app.infrastructure.in.rest;

import com.anassm.app.application.out.port.Orders;
import com.anassm.app.application.out.port.Products;
import com.anassm.app.application.stub.Factory;
import com.anassm.app.infrastructure.config.RestResourceTest;
import com.anassm.app.infrastructure.in.rest.converter.OrderDtoMapper;
import com.anassm.app.infrastructure.in.rest.converter.ProductDtoMapper;
import com.anassm.app.infrastructure.in.rest.dto.ProductDto;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;

import static org.hamcrest.Matchers.hasSize;
import static org.mockito.ArgumentMatchers.anyString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RestResourceTest
public class ControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private Orders orders;
    @Autowired
    private OrderDtoMapper orderDtoMapper;

    @Autowired
    private Products products;
    @Autowired
    private ProductDtoMapper productDtoMapper;

    @Test
    void list_products() throws Exception {
        var product = products.save(productDtoMapper.dtoToEntity(
                Factory.product("P1", 1, 10)
        ));

        System.out.println("++++++++++++++++" + products.findAll().stream().toList());

        mockMvc.perform(get("/api/products"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$", hasSize(1)))
                .andExpect(jsonPath("$[0].name").value(product.getName()));
    }

    @Test
    void get_product() throws Exception {
        List<ProductDto> list = List.of(
                Factory.product("P1", 1, 10),
                Factory.product("P2", 2, 20)
        );
        var product = products.save(productDtoMapper.dtoToEntity(list.get(0)));
        var product2 = products.save(productDtoMapper.dtoToEntity(list.get(1)));

        mockMvc.perform(get("/api/products/{id}", product2.getId()))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.name").value("P2"))
                .andExpect(content().json(new ObjectMapper().writeValueAsString(
                        productDtoMapper.entityToDTO(product2)
                )));
    }

    @Test
    void no_product_must_throw_exception() throws Exception {
        mockMvc.perform(get("/api/products/{id}", anyString()))
                .andExpect(status().isNotFound());
    }

    @Test
    void create_product() throws Exception {
        ProductDto dto = Factory.product("P3", 3, 30);

        mockMvc.perform(post("/api/products")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(new ObjectMapper().writeValueAsString(
                                dto
                        )))
                .andExpect(status().isOk())
                .andExpect(content().string(dto.getId()));
    }

    @AfterEach
    void empty_database() {
        products.emptyDatabase();
    }

}
