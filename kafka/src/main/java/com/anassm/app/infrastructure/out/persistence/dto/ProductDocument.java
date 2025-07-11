package com.anassm.app.infrastructure.out.persistence.dto;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "product")
@Data
public class ProductDocument {
    @Id
    private String id;
    private String name;
    private double price;
    private int quantity;
}
