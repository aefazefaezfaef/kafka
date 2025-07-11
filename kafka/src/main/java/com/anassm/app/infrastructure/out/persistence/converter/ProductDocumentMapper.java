package com.anassm.app.infrastructure.out.persistence.converter;

import com.anassm.app.application.domain.Product;
import com.anassm.app.infrastructure.ObjectMapper;
import com.anassm.app.infrastructure.out.persistence.dto.ProductDocument;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductDocumentMapper extends ObjectMapper<Product, ProductDocument> {
}
