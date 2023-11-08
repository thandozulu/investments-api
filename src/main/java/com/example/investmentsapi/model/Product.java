package com.example.investmentsapi.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Set;

@Entity
public class Product {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    private long id;

    @Column
    private String name;

    @Column
    private BigDecimal balance;

    @OneToMany(mappedBy = "product")
    private Set<Withdrawal> withdrawals;

    @Column
    private String productType;

    @ManyToOne
    @JoinColumn
    private Investor investor;

    @OneToMany(mappedBy = "product")
    private Set<Withdrawal> withdrawal;
}
