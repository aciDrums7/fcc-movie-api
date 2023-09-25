package org.freecodecamp.acidrums7.fccmovieapi.services.impl;

import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.freecodecamp.acidrums7.fccmovieapi.mappers.ReviewMapper;
import org.freecodecamp.acidrums7.fccmovieapi.persistence.repositories.ReviewRepository;
import org.freecodecamp.acidrums7.fccmovieapi.services.dto.ReviewDto;
import org.freecodecamp.acidrums7.fccmovieapi.services.interfaces.ReviewService;
import org.springframework.stereotype.Service;

@Service
public class ReviewServiceImpl implements ReviewService {

    private final ReviewRepository reviewRepository;
    private final ReviewMapper reviewMapper;

    public ReviewServiceImpl(ReviewRepository reviewRepository, ReviewMapper reviewMapper) {
        this.reviewRepository = reviewRepository;
        this.reviewMapper = reviewMapper;
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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'post'");
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
