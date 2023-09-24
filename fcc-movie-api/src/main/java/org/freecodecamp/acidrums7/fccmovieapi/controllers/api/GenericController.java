package org.freecodecamp.acidrums7.fccmovieapi.controllers.api;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface GenericController<T, ID> {

    @GetMapping(produces = "application/json")
    public ResponseEntity<List<T>> getAll();

    @GetMapping(value = "/{id}", produces = "application/json")
    public ResponseEntity<T> getById(@PathVariable ID id);

    @PostMapping(consumes = "application/json", produces = "application/json")
    public ResponseEntity<T> post(@RequestBody T body);

    @PutMapping(value = "/{id}", consumes = "application/json", produces = "application/json")
    public ResponseEntity<T> put(@PathVariable ID id, @RequestBody T body);

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable ID id);
}
