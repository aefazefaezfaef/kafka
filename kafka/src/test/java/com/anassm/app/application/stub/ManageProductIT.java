package com.anassm.app.application.stub;

import com.anassm.app.application.out.port.Products;
import com.anassm.app.infrastructure.config.TestConfig;
import com.anassm.app.infrastructure.in.rest.converter.ProductDtoMapper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrowsExactly;
import static org.mockito.ArgumentMatchers.anyString;

@SpringBootTest
@Import(TestConfig.class)
public class ManageProductIT {

    private static final Logger log = LogManager.getLogger(ManageProductIT.class);
    @Autowired
    private Products products;
    @Autowired
    private ProductDtoMapper productDtoMapper;

    @Test
    void test_get_product() {
        var product = products.save(productDtoMapper.dtoToEntity(
                Factory.product("P1", 1, 10)
        ));

        assertThrowsExactly(RuntimeException.class, () -> products.findById(anyString()));

        var p1 = products.findById(product.getId());
        assertThat(p1).isEqualTo(product);
    }
}
