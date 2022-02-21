package com.knoldus.learning.java.view;

import lombok.AllArgsConstructor;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeView {

    private int id;

    private String name;

    private String departmentType;

    private int salary;

    private String type;

    private List<Integer> number;

    private List<String> email;

    private List<String> address;

    private List<Integer> pinCode;

}
