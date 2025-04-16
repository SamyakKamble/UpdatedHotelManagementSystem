package com.common_dto;

import lombok.Data;

@Data
public class UserDTO {
    private Long userId;
    private String username;
    private String email;
    private String role; // e.g., ADMIN, USER, GUEST
}