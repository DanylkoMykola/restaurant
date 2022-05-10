package com.team3.restaurant.dao.entity;


import com.team3.restaurant.dao.enums.Category;
import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Data
@Table(name = "product")
@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private BigDecimal price;

    @ManyToMany(fetch = FetchType.LAZY)
    private List<Ingredients> ingredients;

    @Enumerated(EnumType.STRING)
    private Category category;

    @Column
    private String imagePath;

    @Column
    private BigDecimal cost;

    @Column
    private Double weight;

    @OneToOne(fetch = FetchType.LAZY)
    private OrderProductList OrderProductList;
}
