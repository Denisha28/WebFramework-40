package com.example.bidirection.Deniicontroller;

import org.springframework.web.bind.annotation.RestController;

import com.example.bidirection.model.DeniStudent;
import com.example.bidirection.model.DeniStudentInfo;
import com.example.bidirection.service.DeniStudentService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class DeniStudentController {
    public DeniStudentService studentService;
    public DeniStudentController(DeniStudentService studentService)
    {
        this.studentService = studentService;
    }
    @PostMapping("/api/poststudent")
    public DeniStudent postMethodName(@RequestBody DeniStudent student) {
        return studentService.saveStudent(student);
    }
    @PostMapping("/api/poststudentinfo")
    public DeniStudentInfo postMethodName(@RequestBody DeniStudentInfo studentInfo) {
        return studentService.saveStudentInfo(studentInfo);
    }
    @GetMapping("/api/student")
    public List<DeniStudent> getMethodName() {
        return studentService.getStudents();
    }
    
}