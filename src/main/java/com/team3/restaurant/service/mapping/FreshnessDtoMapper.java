package com.team3.restaurant.service.mapping;


import com.team3.restaurant.dao.entity.Ingredients;
import com.team3.restaurant.service.dto.FreshnessDto;
import org.modelmapper.AbstractConverter;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.LocalDateTime;

@Component
public class FreshnessDtoMapper extends AbstractConverter<Ingredients, FreshnessDto> {

    @Override
    protected FreshnessDto convert(Ingredients ingredients) {
        return FreshnessDto.builder()
                .productName(ingredients.getName())
                .amount(ingredients.getAmount())
                .measurement(ingredients.getMeasurement().name())
                .expirationDate(ingredients.getExpiration())
                .build();
    }
}
