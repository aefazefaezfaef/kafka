package com.anassm.app.application;

import com.anassm.app.application.domain.Order;
import com.anassm.app.application.in.port.Ordering;
import com.anassm.app.application.out.port.Orders;

@Business
public class ManageOrders implements Ordering {

    private final Orders orders;

    public ManageOrders(Orders orders) {
        this.orders = orders;
    }

    @Override
    public String makeOrder(Order order) {
        return "";
    }

    @Override
    public Order getOrder(String id) {
        return null;
    }
}
