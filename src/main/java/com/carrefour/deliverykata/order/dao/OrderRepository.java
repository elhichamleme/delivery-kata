package com.carrefour.deliverykata.order.dao;

import com.carrefour.deliverykata.order.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {
}
