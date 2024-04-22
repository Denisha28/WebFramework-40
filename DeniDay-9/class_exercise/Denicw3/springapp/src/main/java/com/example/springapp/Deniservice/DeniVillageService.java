package com.example.springapp.Deniservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springapp.Denimodel.DeniVillage;
import com.example.springapp.Denirepository.DeniVillageRepo;

@Service
public class DeniVillageService {
    @Autowired
    private DeniVillageRepo rep;

    public boolean post(DeniVillage person)
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

    public DeniVillage start(String lastname)
    {
        return rep.findByName(lastname);
    }
    public DeniVillage get3(int id)
    {
        return rep.findById(id);
    }

    public List<DeniVillage> end(int population)
    {
        return rep.findByPopulation(population);
    }
    
}
