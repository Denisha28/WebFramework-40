package com.example.springapp.deniservice;

//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springapp.denimodel.deniStudentDetail;
import com.example.springapp.denirepository.deniStudentDetailRepository;
import com.example.springapp.denirepository.deniStudentRepository;

@Service
public class deniStudentDetailService {
    @Autowired
    deniStudentDetailRepository studentDetailRepository;
    @Autowired
    deniStudentRepository studentRepository;
    public deniStudentDetail addStudentDetail(int id,deniStudentDetail studentDetail)
    {
        if(studentRepository.existsById(id))
        {
            studentDetailRepository.addStudentDetail(studentDetail.getAddress(),studentDetail.getPhoneNumber(),id);
            return studentDetail;
        }
        else
        return null;
    }

}
