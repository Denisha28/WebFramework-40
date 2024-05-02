package com.example.cw4.deniservice;

import com.example.cw4.denimodel.deniEmployee;
import com.example.cw4.denirepository.deniEmployeeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class deniEmployeeService {

    @Autowired
    private deniEmployeeRepository employeeRepository;

    public List<deniEmployee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public deniEmployee getEmployeeById(int id) {
        return employeeRepository.findById(id).orElse(null);
    }

    public deniEmployee addEmployee(deniEmployee employee) {
        return employeeRepository.save(employee);
    }
}