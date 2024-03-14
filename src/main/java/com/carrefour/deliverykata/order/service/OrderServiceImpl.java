package com.carrefour.deliverykata.order.service;

import com.carrefour.deliverykata.order.dao.OrderRepository;
import com.carrefour.deliverykata.order.model.Order;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;
    @Override
    public Mono<Order> createOrder(Order order) {
        return Mono.fromCallable(() -> orderRepository.save(order));
    }
}
