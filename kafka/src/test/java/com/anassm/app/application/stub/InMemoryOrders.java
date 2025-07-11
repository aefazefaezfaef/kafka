package com.anassm.app.application.stub;

import com.anassm.app.application.domain.Order;
import com.anassm.app.application.out.port.Orders;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class InMemoryOrders implements Orders {

    private final Map<String, Order> entities = new HashMap<>();

    @Override
    public Order findById(String id) {
        var order = entities.get(id);
        if (order == null) {
            throw new RuntimeException();
        }
        return order;
    }

    @Override
    public Order save(Order order) {
        entities.put(order.getId(), order);
        return order;
    }
}
