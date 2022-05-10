package com.team3.restaurant.dao.repo;


import com.team3.restaurant.dao.entity.OrderProductList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderProductListRepo extends JpaRepository<OrderProductList, Long> {
}
