package com.knoldus.learning.java.entity;

import javax.persistence.*;

@Entity
@Table(name = "employee")
public class Employee {

//    @Id
//    @Column
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int id;
//    @Column(nullable = false, length = 16)
//    private String name;
//    @Column(nullable = false, length = 10)
//    private Contact contact;
//    @Column(nullable = false, length = 16)
//    private String departmentType;
//    @Column(nullable = false, length = 16)
//    private Long salary;
//    @Column(nullable = false, length = 12)
//    private String type;
//    @Column(nullable = false, length = 12)
//    private Address address;
//
//    public Employee() {
//    }
//
//    public Employee(int id, String name, Contact contact, String departmentType, Long salary, String type, Address address) {
//        this.id = id;
//        this.name = name;
//        this.contact = contact;
//        this.departmentType = departmentType;
//        this.salary = salary;
//        this.type = type;
//        this.address = address;
//    }
//
//    @Override
//    public String toString() {
//        return "Employee{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", contact=" + contact +
//                ", departmentType='" + departmentType + '\'' +
//                ", salary=" + salary +
//                ", type='" + type + '\'' +
//                ", address=" + address +
//                '}';
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public Contact getContact() {
//        return contact;
//    }
//
//    public void setContact(Contact contact) {
//        this.contact = contact;
//    }
//
//    public String getDepartmentType() {
//        return departmentType;
//    }
//
//    public void setDepartmentType(String departmentType) {
//        this.departmentType = departmentType;
//    }
//
//    public Long getSalary() {
//        return salary;
//    }
//
//    public void setSalary(Long salary) {
//        this.salary = salary;
//    }
//
//    public String getType() {
//        return type;
//    }
//
//    public void setType(String type) {
//        this.type = type;
//    }
//
//    public Address getAddress() {
//        return address;
//    }
//
//    public void setAddress(Address address) {
//        this.address = address;
//    }

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false, length = 16)
    private String name;
    @Column(nullable = false, length = 10)
    private String contact;
    @Column(nullable = false, length = 16)
    private String departmentType;
    @Column(nullable = false, length = 16)
    private Long salary;
    @Column(nullable = false, length = 12)
    private String type;

    public Employee() {
    }

    public Employee(int id, String name, String contact, String departmentType, Long salary, String type) {
        this.id = id;
        this.name = name;
        this.contact = contact;
        this.departmentType = departmentType;
        this.salary = salary;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", contact='" + contact + '\'' +
                ", departmentType='" + departmentType + '\'' +
                ", salary=" + salary +
                ", type='" + type + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getDepartmentType() {
        return departmentType;
    }

    public void setDepartmentType(String departmentType) {
        this.departmentType = departmentType;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
