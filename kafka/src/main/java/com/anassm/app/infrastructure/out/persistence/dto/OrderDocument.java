package com.anassm.app.infrastructure.out.persistence.dto;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "order")
@Data
public class OrderDocument {
    @Id
    private String id;
    private String product_id;
    private Date date;
    private int quantity;
}
