package com.team3.restaurant.dao.repo;


import com.team3.restaurant.dao.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Long> {
    @Query(value = "select id from Customer")
    List<Long> getALlIds();

    @Query(value = "select discount from Customer where id = :customerId")
    Double getDiscountById(@Param("customerId") Long customerId);
}
