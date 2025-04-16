package com.hotelservice.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.common_dto.AdminDTO;



@FeignClient(name = "admin-service")
public interface AdminServiceClient {

    @GetMapping("/api/admins/{adminId}")
    AdminDTO getAdminDetails(@PathVariable Long adminId);
}