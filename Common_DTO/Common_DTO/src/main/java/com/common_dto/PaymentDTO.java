package com.common_dto;

import lombok.Data;

@Data
public class PaymentDTO {
    private Long paymentId;
    private Long userId;
    private Double amount;
    private String status; // e.g., SUCCESS, FAILED, PENDING
}