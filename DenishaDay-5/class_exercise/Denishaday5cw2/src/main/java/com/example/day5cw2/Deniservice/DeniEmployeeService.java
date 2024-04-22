package com.example.Denishaday5cw2.service;

import org.springframework.stereotype.Service;

import com.example.Denishaday5cw2.model.DeniEmployee;
import com.example.Denishaday5cw2.repository.DeniEmployeeRepo;

@Service
public class DeniEmployeeService {
    public DeniEmployeeRepo employeeRepo;
    public DeniEmployeeService(DeniEmployeeRepo employeeRepo)
    {
        this.employeeRepo = employeeRepo;
    }
    public boolean saveEmployee(DeniEmployee employee)
    {
        try
        {
            employeeRepo.save(employee);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public boolean updateDetails(int id,DeniEmployee employee)
    {
        if(this.getEmployeeById(id)==null)
        {
            return false;
        }
        try{
            employeeRepo.save(employee);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public boolean deleteEmployee(int id)
    {
        if(this.getEmployeeById(id) == null)
        {
            return false;
        }
        employeeRepo.deleteById(id);
        return true;
    }
    public DeniEmployee getEmployeeById(int id)
    {
        return employeeRepo.findById(id).orElse(null);
    }
}
