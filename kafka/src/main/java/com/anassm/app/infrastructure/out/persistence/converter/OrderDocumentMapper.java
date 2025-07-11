package com.anassm.app.infrastructure.out.persistence.converter;

import com.anassm.app.application.domain.Order;
import com.anassm.app.infrastructure.ObjectMapper;
import com.anassm.app.infrastructure.out.persistence.dto.OrderDocument;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OrderDocumentMapper extends ObjectMapper<Order, OrderDocument> {
}
