package com.example.employee.service;

import com.example.employee.Employee;
import com.example.employee.dao.EmployeeDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeDAO employeeDAO;

    public List<Employee> getAllEmployees() {
        return employeeDAO.findAll();
    }

    public Employee getEmployeeById(int id) {
        return employeeDAO.findById(id);
    }

    public void createEmployee(Employee employee) {
        employeeDAO.save(employee);
    }

    public void updateEmployee(Employee employee) {
        employeeDAO.update(employee);
    }

    public void deleteEmployee(int id) {
        employeeDAO.deleteById(id);
    }
}
