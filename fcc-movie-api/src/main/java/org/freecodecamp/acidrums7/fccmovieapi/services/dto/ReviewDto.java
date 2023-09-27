package org.freecodecamp.acidrums7.fccmovieapi.services.dto;

import org.bson.types.ObjectId;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReviewDto {
    
    private ObjectId id;
    
    private String body;

    private String imdbId;
}
