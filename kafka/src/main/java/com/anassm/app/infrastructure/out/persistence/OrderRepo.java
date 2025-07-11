package com.anassm.app.infrastructure.out.persistence;

import com.anassm.app.infrastructure.out.persistence.dto.OrderDocument;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepo extends MongoRepository<OrderDocument, String> {
}
