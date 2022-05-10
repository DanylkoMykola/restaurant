package com.team3.restaurant.dao.entity;


import com.team3.restaurant.dao.enums.DeliveryType;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;


@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(fetch = FetchType.LAZY)
    @ToString.Exclude
    private OrderProductList OrderProductList;

    @ManyToOne
    private Customer customers;

    @Enumerated(EnumType.STRING)
    private DeliveryType deliveryType;

}
