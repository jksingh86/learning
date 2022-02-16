package com.knoldus.learning.java.services;

import com.knoldus.learning.java.entity.Employee;
import com.knoldus.learning.java.repo.EmployeeRepository;
import java.util.Collections;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository empRepo;

        public  void save(final Employee employee){
            empRepo.save(employee);
        }

        public Employee get(double Id){
            return empRepo.findById(String.valueOf(Id)).get();

            }
            @Transactional
            public Optional<Employee>findByEmployeeName(String name){
            return  empRepo.findByName(name);

}
}
