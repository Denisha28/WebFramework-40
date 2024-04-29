package com.example.denicw1.deniservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.denicw1.denimodel.deniEmployee;
import com.example.denicw1.denirepository.deniEmployeeRepo;

@Service
public class deniEmployeeService {
    @Autowired
    deniEmployeeRepo employeeRepo;

    @SuppressWarnings("null")
    public deniEmployee setEmployee(deniEmployee employee)
    {
        return employeeRepo.save(employee);
    }

    public List<deniEmployee> getInnerEmployee()
    {
        return employeeRepo.getByInnerEmployees();
    }

    public List<deniEmployee> getLeftOuterEmployee()
    {
        return employeeRepo.getByLeftOuterEmployees();
    }
}
