package com.knoldus.learning.java.repo;

import com.knoldus.learning.java.entity.Employee;
import java.util.List;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, String> {

    List<Employee>findById(Long Id);
    Optional<Employee>findByName(String name);
}
