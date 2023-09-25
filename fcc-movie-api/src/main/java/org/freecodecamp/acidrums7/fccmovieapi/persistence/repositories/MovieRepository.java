package org.freecodecamp.acidrums7.fccmovieapi.persistence.repositories;

import org.bson.types.ObjectId;
import org.freecodecamp.acidrums7.fccmovieapi.persistence.entities.MovieEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface MovieRepository extends MongoRepository<MovieEntity, ObjectId> {

    Optional<MovieEntity> findByImdbId(String imdbId);
}
