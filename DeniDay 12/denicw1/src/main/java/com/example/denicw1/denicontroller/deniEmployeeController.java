package com.example.denicw1.denicontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.denicw1.denimodel.deniEmployee;
import com.example.denicw1.deniservice.deniEmployeeService;

@RestController
public class deniEmployeeController {
    @Autowired
    deniEmployeeService employeeService;

    @PostMapping("/employee")
    public deniEmployee setMethod(@RequestBody deniEmployee employee)
    {
        return employeeService.setEmployee(employee);
    }

    @GetMapping("/employees-inner-join")
    public List<deniEmployee> getInnerMethod()
    {
        return employeeService.getInnerEmployee();
    }

    @GetMapping("/employees-left-outer-join")
    public List<deniEmployee> getLeftMethod()
    {
        return employeeService.getLeftOuterEmployee();
    }
}
