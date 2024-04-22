package com.examly.Denicw2.Denicontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.examly.Denicw2.Denimodel.DeniCourse;
import com.examly.Denicw2.Deniservice.DeniCourseService;

@RestController
public class DeniCourseController {

     @Autowired
     public DeniCourseService CourseService;

     @PostMapping("/api/course")
     public ResponseEntity<DeniCourse> postMethodName(@RequestBody DeniCourse entity) {

          DeniCourse inst = CourseService.SaveEntity(entity);

          return new ResponseEntity<DeniCourse>(inst, HttpStatus.CREATED);

     }

     @GetMapping("/api/course")
     public ResponseEntity<List<DeniCourse>> getMethodName() {

          List<DeniCourse> show = CourseService.getDetails();
          if (!show.isEmpty()) {
               return new ResponseEntity<List<DeniCourse>>(show, HttpStatus.OK);
          } else {
               return new ResponseEntity<List<DeniCourse>>(show, HttpStatus.NOT_FOUND);
          }
     }

     @GetMapping("api/course/{courseName}")
     public List<DeniCourse> custom(@PathVariable String courseName) {
          return CourseService.findByCourseName(courseName);

     }
}