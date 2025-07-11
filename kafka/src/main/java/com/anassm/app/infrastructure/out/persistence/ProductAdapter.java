package com.anassm.app.infrastructure.out.persistence;

import com.anassm.app.application.domain.Product;
import com.anassm.app.application.out.port.Products;
import com.anassm.app.infrastructure.out.persistence.converter.ProductDocumentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductAdapter implements Products {

    @Autowired
    private ProductRepo productRepo;
    @Autowired
    private ProductDocumentMapper productDocumentMapper;

    @Override
    public Product findById(String id) {
        return productDocumentMapper.dtoToEntity(
                productRepo.findById(id).get()
        );
    }

    @Override
    public List<Product> findAll() {
        return List.of();
    }

    @Override
    public Product save(Product product) {
        return productDocumentMapper.dtoToEntity(
                productRepo.save(productDocumentMapper.entityToDTO(product))
        );
    }

    @Override
    public void emptyDatabase() {
        // TODO
    }
}
