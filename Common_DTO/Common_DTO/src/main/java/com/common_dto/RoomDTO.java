package com.common_dto;

import lombok.Data;

@Data
public class RoomDTO {
    private Long roomId;
    private String roomType; // e.g., SINGLE, DOUBLE, SUITE
    private Double price;
    private boolean availability; // true if available, false otherwise
}