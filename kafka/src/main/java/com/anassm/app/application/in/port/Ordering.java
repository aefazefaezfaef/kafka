package com.anassm.app.application.in.port;

import com.anassm.app.application.domain.Order;

public interface Ordering {
    String makeOrder(Order order);
    Order getOrder(String id);
}
