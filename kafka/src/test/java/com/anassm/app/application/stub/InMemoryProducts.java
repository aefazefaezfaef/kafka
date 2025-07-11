package com.anassm.app.application.stub;

import com.anassm.app.application.domain.Order;
import com.anassm.app.application.domain.Product;
import com.anassm.app.application.out.port.Products;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class InMemoryProducts implements Products {

    private final Map<String, Product> entities = new HashMap<>();

    @Override
    public Product findById(String id) {
        return Optional.ofNullable(entities.get(id)).orElseThrow(RuntimeException::new);
    }

    @Override
    public List<Product> findAll() {
        return entities.values().stream().toList();
    }

    @Override
    public Product save(Product product) {
        entities.put(product.getId(), product);
        return product;
    }

    @Override
    public void emptyDatabase() {
        entities.clear();
    }
}
