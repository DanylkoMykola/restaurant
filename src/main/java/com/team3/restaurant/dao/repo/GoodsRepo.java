package com.team3.restaurant.dao.repo;

import com.team3.restaurant.dao.entity.Goods;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GoodsRepo extends JpaRepository<Goods, Long> {

    @Query(value = "select id from Goods")
    List<Long> getALlIds();
}
