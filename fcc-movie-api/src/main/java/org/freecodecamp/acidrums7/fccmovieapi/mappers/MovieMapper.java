package org.freecodecamp.acidrums7.fccmovieapi.mappers;

import org.freecodecamp.acidrums7.fccmovieapi.persistence.entities.MovieEntity;
import org.freecodecamp.acidrums7.fccmovieapi.services.dto.MovieDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MovieMapper extends GenericMapper<MovieEntity, MovieDto> {

}
