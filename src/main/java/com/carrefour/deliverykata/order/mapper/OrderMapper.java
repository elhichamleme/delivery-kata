package com.carrefour.deliverykata.order.mapper;

import com.carrefour.deliverykata.order.controller.OrderDto;
import com.carrefour.deliverykata.order.model.DeliveryMode;
import com.carrefour.deliverykata.order.model.Order;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface OrderMapper {
    OrderMapper INSTANCE = Mappers.getMapper(OrderMapper.class);

    @Mapping(source = "deliveryMode", target = "deliveryMode", qualifiedByName = "deliveryModeToString")
    OrderDto orderToOrderDto(Order order);

    @Mapping(source = "deliveryMode", target = "deliveryMode", qualifiedByName = "stringToDeliveryMode")
    Order orderDtoToOrder(OrderDto orderDto);

    default String deliveryModeToString(DeliveryMode deliveryMode) {
        return deliveryMode.name();
    }

    default DeliveryMode stringToDeliveryMode(String deliveryMode) {
        return DeliveryMode.valueOf(deliveryMode);
    }
}
