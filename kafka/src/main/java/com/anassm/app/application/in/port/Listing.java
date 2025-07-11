package com.anassm.app.application.in.port;

import com.anassm.app.application.domain.Product;

import java.util.List;

public interface Listing {
    String createProduct(Product product);
    Product getProduct(String id);
    List<Product> listProducts();
}
