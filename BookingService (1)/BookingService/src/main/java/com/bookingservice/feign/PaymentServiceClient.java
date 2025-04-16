package com.bookingservice.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.common_dto.PaymentDTO;



@FeignClient(name = "payment-service")
public interface PaymentServiceClient {

    @GetMapping("/api/payments/{paymentId}")
    PaymentDTO getPaymentDetails(@PathVariable Long paymentId);
}