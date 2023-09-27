package org.freecodecamp.acidrums7.fccmovieapi.services.impl;

import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.freecodecamp.acidrums7.fccmovieapi.mappers.ReviewMapper;
import org.freecodecamp.acidrums7.fccmovieapi.persistence.entities.MovieEntity;
import org.freecodecamp.acidrums7.fccmovieapi.persistence.entities.ReviewEntity;
import org.freecodecamp.acidrums7.fccmovieapi.persistence.repositories.ReviewRepository;
import org.freecodecamp.acidrums7.fccmovieapi.services.dto.ReviewDto;
import org.freecodecamp.acidrums7.fccmovieapi.services.interfaces.ReviewService;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

@Service
public class ReviewServiceImpl implements ReviewService {

    private final ReviewRepository reviewRepository;
    private final ReviewMapper reviewMapper;
    private final MongoTemplate mongoTemplate;

    public ReviewServiceImpl(ReviewRepository reviewRepository, ReviewMapper reviewMapper,
            MongoTemplate mongoTemplate) {
        this.reviewRepository = reviewRepository;
        this.reviewMapper = reviewMapper;
        this.mongoTemplate = mongoTemplate;
    }

    @Override
    public List<ReviewDto> findAll() {
        return reviewRepository.findAll().stream().map(reviewMapper::toDto).toList();
    }

    @Override
    public Optional<ReviewDto> findById(ObjectId id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    @Override
    public Optional<ReviewDto> post(ReviewDto body) {
        ReviewEntity savedReview = reviewRepository.save(reviewMapper.toEntity(body));

        if (!savedReview.getBody().equalsIgnoreCase("")) {
            mongoTemplate.update(MovieEntity.class)
                    .matching(Criteria.where("imdbId").is(body.getImdbId()))
                    .apply(new Update().push("reviewIds").value(savedReview))
                    .first();
            ReviewDto reviewDto = reviewMapper.toDto(savedReview);
            reviewDto.setImdbId(body.getImdbId());
            return Optional.of(reviewDto);
        } else {
            return Optional.empty();
        }
    }

    @Override
    public Optional<ReviewDto> put(ObjectId id, ReviewDto body) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'put'");
    }

    @Override
    public Void delete(ObjectId id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

}
