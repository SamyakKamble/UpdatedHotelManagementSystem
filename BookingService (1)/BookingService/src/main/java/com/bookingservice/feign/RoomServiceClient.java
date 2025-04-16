package com.bookingservice.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.common_dto.RoomDTO;


@FeignClient(name = "room-service")
public interface RoomServiceClient {

    @GetMapping("/api/rooms/{roomId}")
    RoomDTO getRoomDetails(@PathVariable Long roomId);
}