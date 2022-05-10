package com.team3.restaurant.service.dto;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class FreshnessDto {

    private String productName;

    private Double amount;

    private String measurement;

    private LocalDateTime expirationDate;

    private Long dayLeft;

    private Long hoursLeft;
}
