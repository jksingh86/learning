package com.knoldus.learning.java.controller;

import com.knoldus.learning.java.entity.Employee;
import com.knoldus.learning.java.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EmployeeController {

    @Autowired
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping(value = "/add")
    public String addEmployee(Model model) {
        model.addAttribute("Employee", new Employee());
        return "add";
    }


    @RequestMapping(value = "/Save", method = RequestMethod.POST)
    public String saveEmployee(Model model){
        model.addAttribute("Employee",new Employee());
            return "addEmployee";
        }
    }