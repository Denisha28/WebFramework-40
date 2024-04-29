package com.example.denicw1.denicontroller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.denicw1.denimodel.deniPayroll;
import com.example.denicw1.deniservice.deniPayrollService;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
public class deniPayrollController {
    @Autowired
    deniPayrollService PayrollService;

    @PutMapping("/employee/{employeeId}/payroll")
    public deniPayroll addPayroll(@PathVariable Long employeeId,@RequestBody deniPayroll payroll) {
        return PayrollService.addPayroll(employeeId,payroll);
    }

    @GetMapping("/employee/{employeeId}/payroll")
    public Optional<deniPayroll> getMethodName(@PathVariable Long employeeId) {
        return PayrollService.getPayroll(employeeId);
    }
    
    
}
