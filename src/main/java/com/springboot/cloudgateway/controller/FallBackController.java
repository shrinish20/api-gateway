package com.springboot.cloudgateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class FallBackController {

    @GetMapping("/restaurantServiceFallBack")
    public String restaurantServiceFallBackMethod() {
        return "Something went wrong.. Restaurant Service is taking longer than expected. Please try again later";
    }

    @GetMapping("/orderServiceFallBack")
    public String orderServiceFallBackMethod() {
        return "Something went wrong.. Order Service is taking longer than expected. Please try again later";
    }
}
