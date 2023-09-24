package org.freecodecamp.acidrums7.fccmovieapi.services.interfaces;

import java.util.List;

public interface GenericService<T, ID> {

    public List<T> getAll();

    public T getById(ID id);

    public T post(T body);

    public T put(ID id, T body);

    public Void delete(ID id);
}
