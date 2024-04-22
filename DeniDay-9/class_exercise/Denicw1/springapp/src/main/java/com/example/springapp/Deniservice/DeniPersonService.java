package com.example.springapp.Deniservice;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.springapp.Denimodel.DeniPerson;
import com.example.springapp.Denirepository.DeniPersonRepo;

@Service
public class DeniPersonService {
    public DeniPersonRepo personRepo;

    public DeniPersonService(DeniPersonRepo personRepo) {
        this.personRepo = personRepo;
    }

    public boolean savePerson(DeniPerson person) {
        try {
            personRepo.save(person);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public List<DeniPerson> getPersonByAge(int age) {
        return personRepo.findByAge(age);
    }
}
