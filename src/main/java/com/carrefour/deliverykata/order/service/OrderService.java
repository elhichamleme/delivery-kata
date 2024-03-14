package com.carrefour.deliverykata.order.service;

import com.carrefour.deliverykata.order.model.Order;
import reactor.core.publisher.Mono;

public interface OrderService {
    Mono<Order> createOrder(Order order);

}
