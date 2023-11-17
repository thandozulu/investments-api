package com.example.investmentsapi.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
public class Address {
    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    @Getter
    private long id;

    @Column
    @Getter
    @Setter
    private String streetNumber;

    @Column
    @Getter
    @Setter
    private String streetName;

    @Column
    @Getter
    @Setter
    private String city;

    @Column
    @Getter
    @Setter
    private String code;

    @OneToOne(mappedBy = "address")
    private Investor investor;
}
