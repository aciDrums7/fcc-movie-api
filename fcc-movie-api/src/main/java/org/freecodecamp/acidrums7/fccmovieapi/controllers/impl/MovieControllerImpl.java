package org.freecodecamp.acidrums7.fccmovieapi.controllers.impl;

import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.freecodecamp.acidrums7.fccmovieapi.controllers.api.MovieController;
import org.freecodecamp.acidrums7.fccmovieapi.services.dto.MovieDto;
import org.freecodecamp.acidrums7.fccmovieapi.services.interfaces.MovieService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.server.ResponseStatusException;

@Controller
@RequestMapping("/api/v1/movies")
public class MovieControllerImpl implements MovieController {

    private final MovieService movieService;

    public MovieControllerImpl(MovieService movieService) {
        this.movieService = movieService;
    }

    @Override
    public ResponseEntity<List<MovieDto>> findAll() {
        return ResponseEntity.ok(movieService.findAll());
    }

    @Override
    public ResponseEntity<MovieDto> findById(ObjectId id) {
        Optional<MovieDto> movieDtoOptional = movieService.findById(id);
        if (movieDtoOptional.isPresent()) {
            return ResponseEntity.ok(movieDtoOptional.get());
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,
                    String.format("Movie with id: %s not found", id));
        }
    }

    @Override
    public ResponseEntity<MovieDto> post(MovieDto body) {
        return null;
    }

    @Override
    public ResponseEntity<MovieDto> put(ObjectId id, MovieDto body) {
        return null;
    }

    @Override
    public ResponseEntity<Void> delete(ObjectId id) {
        return null;
    }

    @Override
    public ResponseEntity<MovieDto> findByImdbId(String imbdId) {
        Optional<MovieDto> movieDtoOptional = movieService.findByImdbId(imbdId);
        if (movieDtoOptional.isPresent()) {
            return ResponseEntity.ok(movieDtoOptional.get());
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,
                    String.format("Movie with imdbId: %s not found", imbdId));
        }
    }

}
