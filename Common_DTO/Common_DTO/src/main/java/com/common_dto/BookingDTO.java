package com.common_dto;

import lombok.Data;

import java.util.Date;

@Data
public class BookingDTO {
    private Long bookingId;
    private Long userId;
    private Long roomId;
    private Date checkInDate;
    private Date checkOutDate;
    private String status; // e.g., CONFIRMED, CANCELLED, PENDING
}