package com.bookingservice.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "bookings")
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Long userId; // Reference to the user who made the booking

    @Column(nullable = false)
    private Long roomId; // Reference to the room being booked

    @Column(nullable = false)
    private LocalDate checkInDate; // Check-in date

    @Column(nullable = false)
    private LocalDate checkOutDate; // Check-out date

    @Column(nullable = false)
    private Double totalPrice; // Total price for the booking
}