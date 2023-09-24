package org.freecodecamp.acidrums7.fccmovieapi.controllers.impl;

import java.util.List;

import org.bson.types.ObjectId;
import org.freecodecamp.acidrums7.fccmovieapi.controllers.api.MovieController;
import org.freecodecamp.acidrums7.fccmovieapi.services.dto.MovieDto;
import org.freecodecamp.acidrums7.fccmovieapi.services.interfaces.MovieService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/v1/movies")
public class MovieControllerImpl implements MovieController {

    private final MovieService movieService;

    public MovieControllerImpl(MovieService movieService) {
        this.movieService = movieService;
    }

    @Override
    public ResponseEntity<List<MovieDto>> getAll() {
        return ResponseEntity.ok(movieService.getAll());
    }

    @Override
    public ResponseEntity<MovieDto> getById(ObjectId id) {
        return null;
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

}
