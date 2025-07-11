package com.anassm.app.infrastructure;

public interface ObjectMapper<E, DTO> {

    E dtoToEntity(DTO dto);

    DTO entityToDTO(E entity);
}
