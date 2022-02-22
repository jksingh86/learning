package com.knoldus.learning.java.entity;

import com.knoldus.learning.java.view.EmployeeView;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "employee")
@Builder
public class Employee {

    @Id
    @Column
    @SequenceGenerator(
            name = "employee_sequence",
            sequenceName = "employee_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "employee_sequence"
    )
    private int id;
    @Column(nullable = false, length = 16)
    private String name;
    @Column(nullable = false)

    @OneToMany(
            cascade = CascadeType.ALL
    )
    @JoinColumn(
            name = "employee_id",
            referencedColumnName = "id"
    )
    private List<Contact> contact;
    @Column(nullable = false, length = 16)
    private String departmentType;
    @Column(nullable = false, length = 16)
    private int salary;
    @Column(nullable = false, length = 12)
    private String type;
    @Column(nullable = false)
    @OneToMany(
            cascade = CascadeType.ALL
    )
    @JoinColumn(
            name = "employee_id",
            referencedColumnName = "id"
    )
    private List<Address> address;

}
