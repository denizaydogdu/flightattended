package com.flightattend.api_gateway;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fallback")
public class FallbackController {

    @GetMapping("/flights")
    public ResponseEntity<String> flightServiceFallback() {
        return ResponseEntity.status(HttpStatus.SERVICE_UNAVAILABLE)
                .body("Flight Service is currently unavailable. Please try again later.");
    }

    @GetMapping("/bookings")
    public ResponseEntity<String> bookingServiceFallback() {
        return ResponseEntity.status(HttpStatus.SERVICE_UNAVAILABLE)
                .body("Booking Service is currently unavailable. Please try again later.");
    }
}
