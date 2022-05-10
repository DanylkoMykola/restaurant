package com.team3.restaurant.dao.repo;


import com.team3.restaurant.dao.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AddressRepo extends JpaRepository<Address, Long> {

    @Override
    Optional<Address> findById(Long address_id);

    List<Address> findByCity(String city);

    List<Address> findByStreet(String street);
}
