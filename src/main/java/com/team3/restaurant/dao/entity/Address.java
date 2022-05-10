package com.team3.restaurant.dao.entity;

import lombok.Data;

import javax.persistence.*;

@Table(name = "address")
@Entity
@Data
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String city;

    @Column
    private String street;

    @Column
    private String building_number;

    @Column
    private String flat_number;

    @ManyToOne
    @JoinColumn(name = "addresses")
    private Customer customer;


}