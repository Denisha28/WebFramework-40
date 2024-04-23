package com.example.bidirection.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.bidirection.model.DeniStudent;
import com.example.bidirection.model.DeniStudentInfo;
import com.example.bidirection.repository.DeniStudentInfoRepository;
import com.example.bidirection.repository.DeniStudentRepository;

@Service
public class DeniStudentService {
    public DeniStudentRepository studentRepository;
    public DeniStudentInfoRepository studentInfoRepository;
    public DeniStudentService(DeniStudentRepository studentRepository,DeniStudentInfoRepository studentInfoRepository)
    {
        this.studentRepository = studentRepository;
        this.studentInfoRepository = studentInfoRepository;
    }
    public DeniStudent saveStudent(DeniStudent student)
    {
        return studentRepository.save(student);
    }
    public DeniStudentInfo saveStudentInfo(DeniStudentInfo studentInfo)
    {
        return studentInfoRepository.save(studentInfo);
    }
    public List<DeniStudent> getStudents()
    {
        return studentRepository.findAll();
    }
}
