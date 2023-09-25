package org.freecodecamp.acidrums7.fccmovieapi.services.impl;

import java.util.List;

import org.bson.types.ObjectId;
import org.freecodecamp.acidrums7.fccmovieapi.mappers.MoviesMapper;
import org.freecodecamp.acidrums7.fccmovieapi.persistence.repositories.MovieRepository;
import org.freecodecamp.acidrums7.fccmovieapi.services.dto.MovieDto;
import org.freecodecamp.acidrums7.fccmovieapi.services.interfaces.MovieService;
import org.springframework.stereotype.Service;

@Service
public class MovieServiceImpl implements MovieService {

    private final MovieRepository movieRepository;
    private final MoviesMapper moviesMapper;

    public MovieServiceImpl(MovieRepository movieRepository, MoviesMapper moviesMapper) {
        this.movieRepository = movieRepository;
        this.moviesMapper = moviesMapper;
    }

    @Override
    public List<MovieDto> getAll() {
        return movieRepository.findAll()
                .stream()
                .map(moviesMapper::toDto)
                .toList();
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
