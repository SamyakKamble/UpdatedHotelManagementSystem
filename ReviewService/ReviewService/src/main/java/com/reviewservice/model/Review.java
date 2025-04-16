package com.reviewservice.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "reviews")
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Long userId;

    @Column(nullable = false)
    private Long entityId; // Hotel or Room ID

    @Column(nullable = false)
    private String entityType; // e.g., "Hotel" or "Room"

    @Column(nullable = false)
    private String reviewText;

    @Column(nullable = false)
    private int rating; // e.g., 1 to 5 stars

    @Column(nullable = false)
    private String timestamp;
}