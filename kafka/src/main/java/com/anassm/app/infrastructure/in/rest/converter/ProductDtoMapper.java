package com.anassm.app.infrastructure.in.rest.converter;

import com.anassm.app.application.domain.Product;
import com.anassm.app.infrastructure.ObjectMapper;
import com.anassm.app.infrastructure.in.rest.dto.ProductDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductDtoMapper extends ObjectMapper<Product, ProductDto> {
}
