package com.common_dto;
import lombok.Data;

@Data
public class HotelDTO {
    private Long hotelId;
    private String name;
    private String location;
    private Double rating; // e.g., 4.5 out of 5.0
}