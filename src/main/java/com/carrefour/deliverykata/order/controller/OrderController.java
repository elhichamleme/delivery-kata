package com.carrefour.deliverykata.order.controller;

import com.carrefour.deliverykata.order.mapper.OrderMapper;
import com.carrefour.deliverykata.order.model.Order;
import com.carrefour.deliverykata.order.service.OrderService;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import reactor.core.publisher.Mono;

import java.net.URI;

@RestController
@RequestMapping("/api/v1/orders")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;
    private final OrderMapper orderMapper;

    @PostMapping
    @ApiOperation(value = "Create an order")
    public Mono<ResponseEntity<EntityModel<Order>>> createOrder(@RequestBody OrderDto orderDto) {
        return orderService.createOrder(orderMapper.orderDtoToOrder(orderDto))
                .map(createdOrder -> {
                    String uri = ServletUriComponentsBuilder.fromCurrentRequest()
                            .path("/{id}")
                            .buildAndExpand(createdOrder.getId())
                            .toUriString();
                    EntityModel<Order> orderModel = EntityModel.of(createdOrder,
                            WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(OrderController.class).createOrder(orderDto)).withSelfRel());
                    return ResponseEntity.created(URI.create(uri)).body(orderModel);
                });
    }
}
