package org.freecodecamp.acidrums7.fccmovieapi.services.dto;

import java.util.List;

import org.bson.types.ObjectId;
import org.freecodecamp.acidrums7.fccmovieapi.persistence.entities.ReviewEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MovieDto {

    private ObjectId id;

    private String imdbId;

    private String title;

    private String releaseDate;

    private String trailerLink;

    private String poster;

    private List<String> genres;

    private List<String> backdrops;

    private List<ReviewEntity> reviewIds;
}
