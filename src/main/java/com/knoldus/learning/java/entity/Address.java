package com.knoldus.learning.java.entity;

import javax.persistence.*;

@Entity
@Table(name = "address")
public class Address {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, length = 48)
    private String address;

    @Column(nullable = false, length = 8)
    private String pinCode;

}
