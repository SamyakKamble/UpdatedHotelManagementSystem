package com.authservice.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.common_dto.UserDTO;

@FeignClient(name = "user-service")
public interface UserServiceClient {

    @GetMapping("/api/users/{username}")
    UserDTO getUserByUsername(@PathVariable String username);
}