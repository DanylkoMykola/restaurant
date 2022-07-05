package com.team3.restaurant.controller;

import com.team3.restaurant.service.dto.OrderDto;
import com.team3.restaurant.service.producer.ProducerService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProducerController {

    private final ProducerService producerService;

    public ProducerController(ProducerService producerService) {
        this.producerService = producerService;
    }

    @GetMapping("/recieve-order")
    public ResponseEntity<List<OrderDto>> getOrdersForAllCustomers(){
        List<OrderDto> orders = producerService.generateOrders();
        return ResponseEntity.status(HttpStatus.OK).body(orders);
    }
}
