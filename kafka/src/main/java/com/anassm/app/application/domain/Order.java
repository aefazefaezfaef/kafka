package com.anassm.app.application.domain;

import lombok.Data;

import java.util.Date;

@Data
public class Order {
    private String id;
    private String product_id;
    private Date date;
    private int quantity;
}
