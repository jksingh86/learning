package com.knoldus.learning.java.service;

import com.knoldus.learning.java.entity.Contact;
import com.knoldus.learning.java.entity.Employee;
import com.knoldus.learning.java.repository.EmployeeRepository;
import com.knoldus.learning.java.util.Utility;
import com.knoldus.learning.java.view.EmployeeView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    List<Employee> employeeList = new ArrayList<>();

    public EmployeeView save(Employee employeeModel) {
        Employee employee =  employeeRepository.save(employeeModel);
        Utility utility = new Utility();
        List<Integer> numberList = utility.utilNumber(employee.getContact());
        List<String> emailList = utility.utilEmail(employee.getContact());
        List<Integer> pinCodeList = utility.utilPinCode(employee.getAddress());
        List<String> addressList = utility.utilAddress(employee.getAddress());

        EmployeeView employeeView = new EmployeeView(
                employee.getId(),
                employee.getName(),
                employee.getDepartmentType(),
                employee.getSalary(),
                employee.getType(),
                numberList,
                emailList,
                addressList,
                pinCodeList);

        return employeeView;
    }

    public List<Employee> showEmployee() {
        employeeList = (List<Employee>) employeeRepository.findAll();
        return employeeList;
    }

    public Optional<Employee> getEmployeeById(int id) {
        return employeeRepository.findById(id);
    }

    public void delete(int id) {
        employeeRepository.deleteById(id);
    }
}
