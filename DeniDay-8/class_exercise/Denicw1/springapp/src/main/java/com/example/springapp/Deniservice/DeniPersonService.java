package com.example.springapp.Deniservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springapp.Denimodel.DeniPerson;
import com.example.springapp.Denirepository.DeniPersonRepo;

@Service
public class DeniPersonService {
    @Autowired
    private DeniPersonRepo rep;

    public boolean post(DeniPerson person)
    {
        try
        {
            rep.save(person);
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }

    public List<DeniPerson> start(String value)
    {
        return rep.findByNameStartingWith(value);
    }

    public List<DeniPerson> end(String value)
    {
        return rep.findByNameEndingWith(value);
    }
    
}
