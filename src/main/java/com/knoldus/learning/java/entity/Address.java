package com.knoldus.learning.java.entity;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;

@Entity
@Builder
@Table(name = "address")
public class Address {

    @Id
    @Column
    @SequenceGenerator(
            name = "address_sequence",
            sequenceName = "address_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "address_sequence"
    )
    private int id;

    @Column(nullable = false, length = 48)
    private String address;

    @Column(nullable = false, length = 8)
    private int pinCode;

    public Address() {
    }

    public Address(int id, String address, int pinCode) {
        this.id = id;
        this.address = address;
        this.pinCode = pinCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", address='" + address + '\'' +
                ", pinCode='" + pinCode + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }
}
