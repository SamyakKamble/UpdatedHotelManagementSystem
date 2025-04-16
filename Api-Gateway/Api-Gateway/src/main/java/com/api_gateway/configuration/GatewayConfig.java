package com.api_gateway.configuration;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {

    @Bean
    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("user_service", r -> r.path("/users/**")
                        .uri("lb://user-service"))
                .route("booking_service", r -> r.path("/bookings/**")
                        .uri("lb://booking-service"))
                .route("payment_service", r -> r.path("/payments/**")
                        .uri("lb://payment-service"))
                .route("review_service", r -> r.path("/reviews/**")
                        .uri("lb://review-service"))
                .route("notification_service", r -> r.path("/notifications/**")
                        .uri("lb://notification-service"))
                .route("admin_service", r -> r.path("/admins/**")
                        .uri("lb://admin-service"))
                .build();
    }
}