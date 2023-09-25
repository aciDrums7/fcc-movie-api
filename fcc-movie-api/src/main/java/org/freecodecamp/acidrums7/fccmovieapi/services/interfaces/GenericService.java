package org.freecodecamp.acidrums7.fccmovieapi.services.interfaces;

import java.util.List;
import java.util.Optional;

public interface GenericService<T, ID> {

    public List<T> findAll();

    public Optional<T> findById(ID id);

    public Optional<T> post(T body);

    public Optional<T> put(ID id, T body);

    public Void delete(ID id);
}
