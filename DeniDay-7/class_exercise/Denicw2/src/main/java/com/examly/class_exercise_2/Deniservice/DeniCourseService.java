package com.examly.Denicw2.Deniservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.examly.Denicw2.Denimodel.DeniCourse;
import com.examly.Denicw2.Denirepository.DeniCourseRepo;

@Service
public class DeniCourseService {

     @Autowired
     public DeniCourseRepo courseRepo;

     public DeniCourse SaveEntity(DeniCourse entity) {
          return courseRepo.save(entity);

     }

     public List<DeniCourse> getDetails() {
          return courseRepo.findAll();

     }

     public List<DeniCourse> findByCourseName(String courseName) {
          return courseRepo.findByCourseName(courseName);
     }

}
