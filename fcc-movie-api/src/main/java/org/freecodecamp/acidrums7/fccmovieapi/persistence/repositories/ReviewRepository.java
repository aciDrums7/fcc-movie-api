package org.freecodecamp.acidrums7.fccmovieapi.persistence.repositories;

import org.bson.types.ObjectId;
import org.freecodecamp.acidrums7.fccmovieapi.persistence.entities.ReviewEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepository extends MongoRepository<ReviewEntity, ObjectId> {

}
