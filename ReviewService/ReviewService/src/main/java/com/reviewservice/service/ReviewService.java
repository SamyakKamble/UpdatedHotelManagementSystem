package com.reviewservice.service;

import com.reviewservice.model.Review;
import com.reviewservice.repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class ReviewService {

    @Autowired
    private ReviewRepository reviewRepository;

    public List<Review> getAllReviews() {
        return reviewRepository.findAll();
    }

    public List<Review> getReviewsByEntity(Long entityId, String entityType) {
        return reviewRepository.findByEntityIdAndEntityType(entityId, entityType);
    }

    public List<Review> getReviewsByUser(Long userId) {
        return reviewRepository.findByUserId(userId);
    }

    public Review createReview(Review review) {
        review.setTimestamp(LocalDateTime.now().toString());
        return reviewRepository.save(review);
    }

    public Review updateReview(Long id, Review updatedReview) {
        Review review = reviewRepository.findById(id).orElseThrow(() -> new RuntimeException("Review not found"));
        review.setReviewText(updatedReview.getReviewText());
        review.setRating(updatedReview.getRating());
        review.setTimestamp(LocalDateTime.now().toString());
        return reviewRepository.save(review);
    }

    public void deleteReview(Long id) {
        reviewRepository.deleteById(id);
    }
}