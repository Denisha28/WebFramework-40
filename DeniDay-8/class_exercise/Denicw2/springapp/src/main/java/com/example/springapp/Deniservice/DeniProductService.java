package com.example.springapp.Deniservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.springapp.Denimodel.DeniProduct;
import com.example.springapp.Denirepository.DeniProductRepo;

@Service
public class DeniProductService {
    @Autowired
    private DeniProductRepo rep;

    @SuppressWarnings("null")
    public boolean post(DeniProduct person)
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

    public List<DeniProduct> start(String value)
    {
        return rep.findByProductNameStartingWith(value);
    }

    public List<DeniProduct> end(String value)
    {
        return rep.findByProductNameEndingWith(value);
    }
    public List<DeniProduct> sort()
    {
        return rep.findAll(Sort.by("price"));
    }
    
}
