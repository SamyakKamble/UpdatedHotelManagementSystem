package com.reviewservice.repository;

import com.reviewservice.model.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Long> {
    List<Review> findByEntityIdAndEntityType(Long entityId, String entityType);
    List<Review> findByUserId(Long userId);
}