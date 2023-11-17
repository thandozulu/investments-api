package com.example.investmentsapi.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Set;

@Entity
@Getter
@Setter
public class Investor {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    private long id;
    private String name;

    @Column
    private String surname;

    @Column
    private LocalDate birthDate;

    @Column
    private String mobileNumber;

    @Column
    private String emailAddress;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "addressId", referencedColumnName = "id")
    private Address address;

    @OneToMany(mappedBy = "investor")
    private Set<Product> products;


}
