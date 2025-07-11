package com.anassm.app.infrastructure.config;

import com.anassm.app.infrastructure.DomainConfig;
import com.anassm.app.application.out.port.Orders;
import com.anassm.app.application.out.port.Products;
import com.anassm.app.application.stub.InMemoryOrders;
import com.anassm.app.application.stub.InMemoryProducts;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;

@TestConfiguration
@Import(DomainConfig.class)
public class TestConfig {

    @Bean
    Orders orders() {
        return new InMemoryOrders();
    }

    @Bean
    Products products() {
        return new InMemoryProducts();
    }
}
