package org.freecodecamp.acidrums7.fccmovieapi.controllers.api;

import org.bson.types.ObjectId;
import org.freecodecamp.acidrums7.fccmovieapi.services.dto.ReviewDto;

public interface ReviewController extends GenericController<ReviewDto, ObjectId> {
    
}
