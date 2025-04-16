package com.notificationservice.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "notifications")
public class Notification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Long userId;

    @Column(nullable = false)
    private String type; // e.g., "Email", "SMS"

    @Column(nullable = false)
    private String message;

    @Column(nullable = false)
    private String status; // e.g., "Sent", "Pending", "Failed"

    @Column(nullable = false)
    private String timestamp;
}