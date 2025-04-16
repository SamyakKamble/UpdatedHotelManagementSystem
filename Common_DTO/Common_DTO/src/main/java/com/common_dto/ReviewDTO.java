package com.common_dto;

import lombok.Data;

@Data
public class ReviewDTO {
    private Long reviewId;
    private Long userId;
    private Long hotelId;
    private String reviewText;
    private int rating; // 1 to 5 stars
}