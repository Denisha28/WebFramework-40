package com.example.denicw1.deniservice;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.denicw1.denimodel.deniEmployee;
import com.example.denicw1.denirepository.deniEmployeeRepo;

@Service

public class deniEmployeeService {
    @Autowired
    deniEmployeeRepo employeeRepo;

    public deniEmployee addEmployee(deniEmployee employee)
    {
        return employeeRepo.save(employee);
    }

    public List<deniEmployee> getEmployees()
    {
        return employeeRepo.findAll();
    }

    public Optional<deniEmployee> getEmployee(Long employeeId)
    {
        return employeeRepo.findById(employeeId);
    }

}
