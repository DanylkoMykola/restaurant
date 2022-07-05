package com.team3.restaurant.service.dto;

import java.time.LocalDateTime;
import java.util.List;

import lombok.Data;

@Data
public class OrderDto {

    private Long customerId;

    private LocalDateTime orderDateTime;

    private Double discount;

    private List<GoodsDto> goodsList;

}
