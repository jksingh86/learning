package com.knoldus.learning.java.entity;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Builder
@Table(name = "contact")
public class Contact {

    @Id
    @Column
    @SequenceGenerator(
            name = "contact_sequence",
            sequenceName = "contact_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "contact_sequence"
    )
    private int id;

    @Column(nullable = false, length = 10)
    private int number;

    @Column(nullable = false, length = 48)
    private String email;

    public Contact() {
    }

    public Contact(int id, int number, String email) {
        this.id = id;
        this.number = number;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "id=" + id +
                ", number=" + number +
                ", email=" + email +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
