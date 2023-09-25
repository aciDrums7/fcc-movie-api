package org.freecodecamp.acidrums7.fccmovieapi.controllers.api;

import org.bson.types.ObjectId;
import org.freecodecamp.acidrums7.fccmovieapi.services.dto.MovieDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public interface MovieController extends GenericController<MovieDto, ObjectId> {

    @GetMapping(value = "/imdb/{imdbId}", produces = "application/json")
    ResponseEntity<MovieDto> findByImdbId(@PathVariable("imdbId") String imbdId);
}
