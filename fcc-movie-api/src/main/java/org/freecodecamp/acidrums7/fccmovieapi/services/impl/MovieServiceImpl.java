package org.freecodecamp.acidrums7.fccmovieapi.services.impl;

import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.freecodecamp.acidrums7.fccmovieapi.mappers.MovieMapper;
import org.freecodecamp.acidrums7.fccmovieapi.persistence.entities.MovieEntity;
import org.freecodecamp.acidrums7.fccmovieapi.persistence.repositories.MovieRepository;
import org.freecodecamp.acidrums7.fccmovieapi.services.dto.MovieDto;
import org.freecodecamp.acidrums7.fccmovieapi.services.interfaces.MovieService;
import org.springframework.stereotype.Service;

@Service
public class MovieServiceImpl implements MovieService {

    private final MovieRepository movieRepository;
    private final MovieMapper movieMapper;

    public MovieServiceImpl(MovieRepository movieRepository, MovieMapper moviesMapper) {
        this.movieRepository = movieRepository;
        this.movieMapper = moviesMapper;
    }

    @Override
    public List<MovieDto> findAll() {
        return movieRepository.findAll()
                .stream()
                .map(movieMapper::toDto)
                .toList();
    }

    @Override
    public Optional<MovieDto> findById(ObjectId id) {
        Optional<MovieEntity> movieEntityOptional = movieRepository.findById(id);
        if (movieEntityOptional.isPresent()) {
            return Optional.of(movieMapper.toDto(movieEntityOptional.get()));
        } else {
            return Optional.empty();
        }
    }

    @Override
    public Optional<MovieDto> post(MovieDto body) {
        return Optional.empty();
    }

    @Override
    public Optional<MovieDto> put(ObjectId id, MovieDto body) {
        return Optional.empty();
    }

    @Override
    public Void delete(ObjectId id) {
        return null;
    }

    @Override
    public Optional<MovieDto> findByImdbId(String imdbId) {
        Optional<MovieEntity> movieEntityOptional = movieRepository.findByImdbId(imdbId);
        if (movieEntityOptional.isPresent()) {
            return Optional.of(movieMapper.toDto(movieEntityOptional.get()));
        } else {
            return Optional.empty();
        }
    }

}
