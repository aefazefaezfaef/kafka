package com.anassm.app.infrastructure.out.persistence;

import com.anassm.app.infrastructure.out.persistence.dto.ProductDocument;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends MongoRepository<ProductDocument, String> {
}
