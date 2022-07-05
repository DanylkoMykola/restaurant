package com.team3.restaurant.dao.entity;

import com.team3.restaurant.dao.enums.Measurement;

import java.math.BigDecimal;
import java.time.Duration;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Table(name = "goods")
@Entity
public class Goods {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name_of_product",nullable = false)
    private String nameOfProduct;

    @Column(nullable = false, name = "price_per_unit")
    private BigDecimal price;

    @Enumerated(EnumType.STRING)
    private Measurement measurementUnit;

    @Column(nullable = false, name = "freshness_hours")
    private Duration hoursOfFreshness;

}
