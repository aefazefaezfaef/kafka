package com.anassm.app.application.out.port;

import com.anassm.app.application.domain.Order;
import com.anassm.app.application.domain.Product;

import java.util.List;

public interface Products {
    Product findById(String id);
    List<Product> findAll();
    Product save(Product product);
    void emptyDatabase();
}
