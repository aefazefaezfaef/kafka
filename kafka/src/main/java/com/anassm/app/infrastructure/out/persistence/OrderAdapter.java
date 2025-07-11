package com.anassm.app.infrastructure.out.persistence;

import com.anassm.app.application.domain.Order;
import com.anassm.app.application.out.port.Orders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderAdapter implements Orders {

    @Autowired
    private OrderRepo orderRepo;

    @Override
    public Order findById(String id) {
        return null;
    }

    @Override
    public Order save(Order order) {
        return null;
    }
}
