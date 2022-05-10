package com.team3.restaurant.dao.entity;

import com.team3.restaurant.dao.enums.Measurement;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Table(name = "ingredients")
@Entity
public class Ingredients {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private Double amount;

    @Enumerated(EnumType.STRING)
    private Measurement measurement;

    @Column
    private BigDecimal price;

    @Column
    private LocalDateTime buyDate;

    @Column
    private LocalDateTime expiration;

    @ManyToMany(fetch = FetchType.LAZY)
    private List<Product> products;

}