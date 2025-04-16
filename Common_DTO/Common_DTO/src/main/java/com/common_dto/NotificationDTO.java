package com.common_dto;

import lombok.Data;

@Data
public class NotificationDTO {
    private Long notificationId;
    private Long userId;
    private String type; // e.g., EMAIL, SMS, PUSH
    private String message;
    private String status; // e.g., SENT, FAILED, PENDING
}