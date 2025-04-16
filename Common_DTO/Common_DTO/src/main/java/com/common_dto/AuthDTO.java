package com.common_dto;


import lombok.Data;

@Data
public class AuthDTO {
    private String username;
    private String token;
    private String role;
}