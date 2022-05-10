package com.team3.restaurant.dao.repo;


import com.team3.restaurant.dao.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepo extends JpaRepository<Product, Long> {

    @Override
    Optional<Product> findById(Long product_id);


    Optional<Product> findByName(String name);

    @Override
    List<Product> findAll();

}
