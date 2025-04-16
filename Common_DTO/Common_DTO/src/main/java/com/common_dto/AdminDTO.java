package com.common_dto;

import lombok.Data;

@Data
public class AdminDTO {
    private Long adminId;
    private String username;
    private String email;
    private String role; // e.g., SUPER_ADMIN, ADMIN
}