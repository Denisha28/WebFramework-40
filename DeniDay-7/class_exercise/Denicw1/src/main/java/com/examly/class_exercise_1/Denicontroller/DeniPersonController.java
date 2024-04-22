package com.examly.Denicw1.Denicontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.examly.Denicw1.Denimodel.DeniPerson;
import com.examly.Denicw1.Deniservice.DeniPersonService;

@RestController
public class DeniPersonController {

     @Autowired
     public DeniPersonService personService;

     @PostMapping("/api/person")
     public ResponseEntity<DeniPerson> postMethodName(@RequestBody DeniPerson entity) {

          DeniPerson inst = personService.SaveEntity(entity);

          return new ResponseEntity<DeniPerson>(inst, HttpStatus.CREATED);

     }

     @GetMapping("/api/person")
     public ResponseEntity<List<DeniPerson>> getMethodName() {

          List<DeniPerson> show = personService.getDetails();
          if (!show.isEmpty()) {
               return new ResponseEntity<List<DeniPerson>>(show, HttpStatus.OK);
          } else {
               return new ResponseEntity<List<DeniPerson>>(show, HttpStatus.NOT_FOUND);
          }
     }

     @GetMapping("api/person/byAge")
     public List<DeniPerson> custom(@RequestParam int byAge) {
          return personService.findByAge(byAge);

     }
}