package com.example.cw1.deniservice;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cw1.denimodel.deniPerson;
import com.example.cw1.denirepository.deniPersonRepo;

@Service
public class deniPersonService {
    @Autowired
    private deniPersonRepo repo;

    public deniPerson createPerson(deniPerson person) {
        return repo.save(person);
    }

    public List<deniPerson> getAllPersons() {
        return repo.findAll();
    }
}
