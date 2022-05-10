package com.team3.restaurant.dao.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Table(name = "order_product_list")
@Entity
public class OrderProductList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Product product;

    @OneToOne
    private Order order;

    @Column
    private Double amount;
}
