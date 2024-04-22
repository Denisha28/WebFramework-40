package com.example.Denicw2.Denicontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.Denicw2.Denimodel.DeniStudent;
import com.example.Denicw2.Deniservice.DeniStudentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class DeniStudentController {

     @Autowired
     public DeniStudentService studentService;

     @GetMapping("/api/student")
     public ResponseEntity<List<DeniStudent>> getDetails() {
          List<DeniStudent> list = studentService.getAll();
          if (list.isEmpty()) {
               return new ResponseEntity<List<DeniStudent>>(list, HttpStatus.NOT_FOUND);
          }
          return new ResponseEntity<List<DeniStudent>>(list, HttpStatus.OK);

     }

     @PostMapping("/api/student")
     public ResponseEntity<DeniStudent> postMethodName(@RequestBody DeniStudent student) {

          DeniStudent postData = studentService.post(student);
          return new ResponseEntity<>(postData, HttpStatus.OK);
     }

     @GetMapping("/api/student/sort/{field}")
     public ResponseEntity<List<DeniStudent>> sortedDetails(@PathVariable String field) {
          List<DeniStudent> list = studentService.sortedDetails(field);
          if (list.isEmpty()) {
               return new ResponseEntity<List<DeniStudent>>(list, HttpStatus.NOT_FOUND);
          }
          return new ResponseEntity<List<DeniStudent>>(list, HttpStatus.OK);

     }
}
