package com.example.Denicw2.Deniservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.Denicw2.Denimodel.DeniStudent;
import com.example.Denicw2.Denirepository.DeniStudentRepo;

@Service
public class DeniStudentService {

     @Autowired
     public DeniStudentRepo studentRepo;

     public List<DeniStudent> getAll() {
          return studentRepo.findAll();
     }

     public DeniStudent post(DeniStudent student) {
          return studentRepo.save(student);
     }

     public List<DeniStudent> sortedDetails(String field) {
          return studentRepo.findAll(Sort.by(Sort.Direction.DESC, field));
     }
}
