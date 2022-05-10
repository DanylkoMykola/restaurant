package com.team3.restaurant.dao.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "restaurant")
public class Restaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private String location;
}
