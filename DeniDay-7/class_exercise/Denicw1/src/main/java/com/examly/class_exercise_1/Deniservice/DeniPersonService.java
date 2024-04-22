package com.examly.Denicw1.Deniservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.examly.Denicw1.Denimodel.DeniPerson;
import com.examly.Denicw1.Denirepository.DeniPersonRepo;

@Service
public class DeniPersonService {

     @Autowired
     public DeniPersonRepo personRepo;

     public DeniPerson SaveEntity(DeniPerson entity) {
          return personRepo.save(entity);

     }

     public List<DeniPerson> getDetails() {
          return personRepo.findAll();

     }

     public List<DeniPerson> findByAge(int byAge) {
          return personRepo.findByAge(byAge);
     }

}
