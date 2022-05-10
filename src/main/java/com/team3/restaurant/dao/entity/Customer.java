package com.team3.restaurant.dao.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Table(name = "customer")
@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String first_name;

    @Column
    private String surname;

    @Column
    private String email;

    @Column
    private Double discount;

    @OneToMany(mappedBy = "customer", fetch = FetchType.LAZY)
    private List<Address> addresses;
}
