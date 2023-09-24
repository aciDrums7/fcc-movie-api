package org.freecodecamp.acidrums7.fccmovieapi.persistence.entities;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collation = "reviews")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReviewEntity {

    @Id
    private ObjectId id;

    private String body;
}
