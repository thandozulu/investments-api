package com.example.investmentsapi.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Set;

@Entity
public class Product {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    @Getter
    private long id;

    @Column
    @Getter
    @Setter
    private String name;

    @Column
    @Getter
    @Setter
    private BigDecimal balance;

    @OneToMany(mappedBy = "product")
    @Getter
    @Setter
    private Set<Withdrawal> withdrawals;

    @Column
    @Getter
    @Setter
    private String productType;

    @ManyToOne
    @JoinColumn
    private Investor investor;

    @OneToMany(mappedBy = "product")
    @Getter
    @Setter
    private Set<Withdrawal> withdrawal;
}
