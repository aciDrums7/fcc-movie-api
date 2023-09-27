package org.freecodecamp.acidrums7.fccmovieapi.controllers.impl;

import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.freecodecamp.acidrums7.fccmovieapi.controllers.api.ReviewController;
import org.freecodecamp.acidrums7.fccmovieapi.services.dto.ReviewDto;
import org.freecodecamp.acidrums7.fccmovieapi.services.interfaces.ReviewService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.server.ResponseStatusException;

@Controller
@RequestMapping("/api/v1/review")
public class ReviewControllerImpl implements ReviewController {

    private final ReviewService reviewService;

    public ReviewControllerImpl(ReviewService reviewService) {
        this.reviewService = reviewService;
    }

    @Override
    public ResponseEntity<List<ReviewDto>> findAll() {
        return ResponseEntity.ok(this.reviewService.findAll());
    }

    @Override
    public ResponseEntity<ReviewDto> findById(ObjectId id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    @Override
    public ResponseEntity<ReviewDto> post(ReviewDto body) {
        Optional<ReviewDto> reviewDto = reviewService.post(body);
        if(reviewDto.isPresent()) {
            return new ResponseEntity<>(reviewDto.get(), HttpStatus.CREATED);
        } else {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR,
                    "Creation of review failed");
        }
    }

    @Override
    public ResponseEntity<ReviewDto> put(ObjectId id, ReviewDto body) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'put'");
    }

    @Override
    public ResponseEntity<Void> delete(ObjectId id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

}
