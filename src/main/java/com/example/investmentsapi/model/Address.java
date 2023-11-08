package com.example.investmentsapi.model;

import jakarta.persistence.*;

@Entity
public class Address {
    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    private long id;

    @Column
    private String streetNumber;

    @Column
    private String streetName;

    @Column
    private String city;

    @Column
    private String code;

    @OneToOne(mappedBy = "address")
    private Investor investor;
}
