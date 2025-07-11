package com.anassm.app.application.out.port;

import com.anassm.app.application.domain.Order;

public interface Orders {
    Order findById(String id);
    Order save(Order order);
}
