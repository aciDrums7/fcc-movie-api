package org.freecodecamp.acidrums7.fccmovieapi.mappers;

import java.util.List;

public interface GenericMapper<E, D> {

    D toDto(E entity);

    E toEntity(D dto);

    List<D> toDtoList(List<E> entityList);

    List<E> toEntityList(List<D> dtoList);
}
