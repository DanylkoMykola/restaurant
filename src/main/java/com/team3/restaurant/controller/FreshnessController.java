package com.team3.restaurant.controller;


import com.team3.restaurant.service.dto.FreshnessDto;
import com.team3.restaurant.service.freshness.FreshnessService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FreshnessController {

    private final FreshnessService freshnessService;

    public FreshnessController(FreshnessService freshnessService) {
        this.freshnessService = freshnessService;
    }

    @GetMapping("/get")
    public ResponseEntity<List<FreshnessDto>> getFreshness() {
        return ResponseEntity.status(HttpStatus.OK).body(freshnessService.getProductFreshness());
    }
    @GetMapping
    public ResponseEntity<String> test() {
        return ResponseEntity.status(HttpStatus.OK).body("Hello");
    }
    @GetMapping("/test")
    public String test1() {
        return "Hello";
    }
}
