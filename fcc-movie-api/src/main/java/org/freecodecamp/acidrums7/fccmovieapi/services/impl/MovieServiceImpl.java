package org.freecodecamp.acidrums7.fccmovieapi.services.impl;

import java.util.Collections;
import java.util.List;

import org.bson.types.ObjectId;
import org.freecodecamp.acidrums7.fccmovieapi.services.dto.MovieDto;
import org.freecodecamp.acidrums7.fccmovieapi.services.interfaces.MovieService;
import org.springframework.stereotype.Service;

@Service
public class MovieServiceImpl implements MovieService {

    @Override
    public List<MovieDto> getAll() {
        return Collections.nCopies(3, new MovieDto());
    }

    @Override
    public MovieDto getById(ObjectId id) {
        return null;
    }

    @Override
    public MovieDto post(MovieDto body) {
        return null;
    }

    @Override
    public MovieDto put(ObjectId id, MovieDto body) {
        return null;
    }

    @Override
    public Void delete(ObjectId id) {
        return null;
    }

}
