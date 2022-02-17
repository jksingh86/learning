package com.knoldus.learning.java.entity;

import javax.persistence.*;

@Entity
@Table(name = "contact")
public class Contact {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, unique = true, length = 10)
    private Long number;

    @Column(nullable = false, unique = true, length = 10)
    private Long email;

}
