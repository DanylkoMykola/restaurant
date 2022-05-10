package com.team3.restaurant.dao.repo;


import com.team3.restaurant.dao.entity.Ingredients;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IngredientsRepo extends JpaRepository<Ingredients, Long> {


    List<Ingredients> getAllByAmountIsNotNull();
}
