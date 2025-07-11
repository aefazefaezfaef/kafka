package com.anassm.app.application;

import com.anassm.app.application.domain.Product;
import com.anassm.app.application.in.port.Listing;
import com.anassm.app.application.out.port.Products;

import java.util.List;

@Business
public class ManageProducts implements Listing {

    private final Products products;

    public ManageProducts(Products products) {
        this.products = products;
    }

    @Override
    public String createProduct(Product product) {
        return products.save(product).getId();
    }

    @Override
    public Product getProduct(String id) {
        return products.findById(id);
    }

    @Override
    public List<Product> listProducts() {
        return products.findAll();
    }
}
