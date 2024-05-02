package com.employee.employee.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employee.employee.Model.Employee;
import com.employee.employee.Service.EmployeeService;

@RestController
public class ApiController {
    @Autowired
    public EmployeeService employeeService;

    @PostMapping("/")
    public Boolean postData(@RequestBody Employee employee)
    {
        return employeeService.postData(employee);
    }

    @GetMapping("/getnotcontains/{name}")
    public List<Employee> getNotContains(@PathVariable String name)
    {
        return employeeService.getNotContains(name);
    }
    @GetMapping("/getnotcontaining/{name}")
    public List<Employee> getNotContaining(@PathVariable String name)
    {
        return employeeService.getNotContaining(name);
    }
    @GetMapping("/getnotLike/{name}")
    public List<Employee> getNotLike(@PathVariable String name)
    {
        return employeeService.getNotLike(name);
    }


}
