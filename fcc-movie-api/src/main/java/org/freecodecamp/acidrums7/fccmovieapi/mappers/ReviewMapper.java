package org.freecodecamp.acidrums7.fccmovieapi.mappers;

import org.freecodecamp.acidrums7.fccmovieapi.persistence.entities.ReviewEntity;
import org.freecodecamp.acidrums7.fccmovieapi.services.dto.ReviewDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ReviewMapper extends GenericMapper<ReviewEntity, ReviewDto> {

}
