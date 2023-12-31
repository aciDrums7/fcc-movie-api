package org.freecodecamp.acidrums7.fccmovieapi.controllers.api;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

public interface GenericController<T, ID> {

    @CrossOrigin
    @GetMapping(value = "/", produces = "application/json")
    public ResponseEntity<List<T>> findAll();

    @CrossOrigin
    @GetMapping(value = "/{id}", produces = "application/json")
    public ResponseEntity<T> findById(@PathVariable ID id);

    @CrossOrigin
    @PostMapping(value = "/", consumes = "application/json", produces = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<T> post(@RequestBody T body);

    @CrossOrigin
    @PutMapping(value = "/{id}", consumes = "application/json", produces = "application/json")
    public ResponseEntity<T> put(@PathVariable ID id, @RequestBody T body);

    @CrossOrigin
    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public ResponseEntity<Void> delete(@PathVariable ID id);
}
