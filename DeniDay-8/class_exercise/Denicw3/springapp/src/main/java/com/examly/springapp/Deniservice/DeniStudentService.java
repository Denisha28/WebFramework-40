package com.examly.springapp.Deniservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examly.springapp.Denimodel.DeniStudent;
import com.examly.springapp.Denirepository.DeniStudentRepo;

@Service
public class DeniStudentService {
    @Autowired
    private DeniStudentRepo studentRepo;

    public boolean post(DeniStudent student) {
        try {
            studentRepo.save(student);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public List<DeniStudent> start(int mark) {
        return studentRepo.findByMarksGreaterThan(mark);
    }

    public List<DeniStudent> end(int mark) {
        return studentRepo.findByMarksLessThan(mark);
    }

}
