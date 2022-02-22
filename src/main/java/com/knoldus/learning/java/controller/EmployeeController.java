package com.knoldus.learning.java.controller;

import com.knoldus.learning.java.entity.Employee;
import com.knoldus.learning.java.repository.EmployeeRepository;
import com.knoldus.learning.java.service.EmployeeService;
import com.knoldus.learning.java.view.EmployeeView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/save")
    public EmployeeView setEmployee(@RequestBody Employee employeeModel) {

        return employeeService.save(employeeModel);
    }

    @GetMapping("/get")
    public List<Employee> fetchEmployee() {
        return employeeService.showEmployee();
    }

    @DeleteMapping("delete/{id}")
    public void delete(@PathVariable("id") int id) {
        employeeService.delete(id);
    }

    @GetMapping("get/{id}")
    public Optional<Employee> fetchEmployeeById(@PathVariable("id") int id) {
        return employeeService.getEmployeeById(id);
    }

//    @GetMapping("/get")
//    public List<Employee> fetchEmployee() {
//        return employeeService.showEmployee();
//    }
//
//    @DeleteMapping("delete/{id}")
//    public void delete(@PathVariable("id") int id) {
//        employeeService.delete(id);
//    }
//
//    @GetMapping("get/{id}")
//    public Optional<Employee> fetchEmployeeById(@PathVariable("id") int id) {
//        return employeeService.getEmployeeById(id);
//    }
}
