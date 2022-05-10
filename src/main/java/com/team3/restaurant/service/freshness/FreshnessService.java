package com.team3.restaurant.service.freshness;


import com.team3.restaurant.dao.entity.Ingredients;
import com.team3.restaurant.dao.repo.IngredientsRepo;
import com.team3.restaurant.service.dto.FreshnessDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FreshnessService {



    private final IngredientsRepo ingredientsRepo;
    private final ModelMapper modelMapper;


    public FreshnessService(IngredientsRepo ingredientsRepo,
                            ModelMapper modelMapper) {
        this.ingredientsRepo = ingredientsRepo;
        this.modelMapper = modelMapper;
    }

    public List<FreshnessDto> getProductFreshness() {
        List<Ingredients> ingredientsList = ingredientsRepo.getAllByAmountIsNotNull();
        return ingredientsList.stream()
                .map(ingredients ->  modelMapper.map(ingredients, FreshnessDto.class))
                .collect(Collectors.toList());
    }
}
