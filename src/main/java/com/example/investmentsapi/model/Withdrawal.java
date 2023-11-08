package com.example.investmentsapi.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
public class Withdrawal {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    private long id;

    @Column
    private BigDecimal amount;

    @Column
    private LocalDateTime dateTime;

    @Column
    private Boolean isSuccessful;

    @ManyToOne
    @JoinColumn
    private Product product;
}
