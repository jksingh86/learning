package com.knoldus.learning.java.repository;

import com.knoldus.learning.java.entity.Address;
import com.knoldus.learning.java.entity.Contact;
import com.knoldus.learning.java.entity.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class EmployeeRepositoryTest {

    @Autowired
    private EmployeeRepository employeeRepository;


    @Test
    void save() {

    Address address1 = Address.builder()
            .pinCode(267856)
            .address("Gorakhpur")
            .build();

    Address address2 = Address.builder()
            .pinCode(256867)
            .address("Lucknow")
            .build();

    Contact contacts = Contact.builder()
            .number(96217295)
            .email("krishna@gmail.com")
            .build();

    Employee employee = Employee.builder()
            .departmentType("IT")
            .name("KRISHNA JAISWAL")
            .type("FullTime")
            .salary(400000000)
            .address(List.of(address1, address2))
            .contact(List.of(contacts))
            .build();

    employeeRepository.save(employee);

    }

    @Test
    void deleteEmployee() {

        employeeRepository.deleteById(25);

    }



}