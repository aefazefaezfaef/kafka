package com.anassm.app.infrastructure.in.rest.converter;

import com.anassm.app.application.domain.Order;
import com.anassm.app.infrastructure.ObjectMapper;
import com.anassm.app.infrastructure.in.rest.dto.OrderDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OrderDtoMapper extends ObjectMapper<Order, OrderDto> {
}
