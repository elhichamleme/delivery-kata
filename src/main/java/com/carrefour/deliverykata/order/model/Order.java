package com.carrefour.deliverykata.order.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "orders")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "order_sequence")
    @SequenceGenerator(name = "order_sequence", sequenceName = "order_seq", allocationSize = 1)
    private Long id;
    @Column(name = "customer_name")
    private String customerName;
    private String address;
    @Column(name = "delivery_mode")
    @Enumerated(EnumType.STRING)
    private DeliveryMode deliveryMode;
}