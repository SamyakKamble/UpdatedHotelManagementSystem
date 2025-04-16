package com.roomservice.RoomService.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.common_dto.HotelDTO;


@FeignClient(name = "hotel-service")
public interface HotelServiceClient {

    @GetMapping("/api/hotels/{hotelId}")
    HotelDTO getHotelDetails(@PathVariable Long hotelId);
}