package org.freecodecamp.acidrums7.fccmovieapi.services.interfaces;

import org.bson.types.ObjectId;
import org.freecodecamp.acidrums7.fccmovieapi.services.dto.MovieDto;

public interface MovieService extends GenericService<MovieDto, ObjectId> {
    
}
