package com.example.springapp.deniservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springapp.denimodel.deniStudent;
import com.example.springapp.denirepository.deniStudentRepository;

@Service
public class deniStudentService {
    @Autowired
    deniStudentRepository studentRepository;
    public deniStudent addStudents(deniStudent student)
    {
        return studentRepository.save(student);
    }
    public List<deniStudent>getStudent()
    {
        return studentRepository.findAll();
    }
    public List<deniStudent>getStudentInner()
    {
        return studentRepository.getStudentInner();
    }
    public List<deniStudent>getStudentLeftOuter()
    {
        return studentRepository.getStudentsLeftOuter();
    }
    
}
