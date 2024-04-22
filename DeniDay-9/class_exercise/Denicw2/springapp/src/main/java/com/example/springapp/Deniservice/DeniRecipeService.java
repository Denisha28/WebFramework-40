package com.example.springapp.Deniservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springapp.Denimodel.DeniRecipe;
import com.example.springapp.Denirepository.DeniRecipeRepo;

@Service
public class DeniRecipeService {
    @Autowired
    private DeniRecipeRepo rep;

  
    @SuppressWarnings("null")
    public boolean post(DeniRecipe recipe)
    {
        try
        {
            rep.save(recipe);
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }

    public DeniRecipe getByid(int id)
    {
        return rep.findById(id).orElse(null);
    }

    public List<DeniRecipe> filter(String name)
    {
        return rep.findByProduct(name);
    }
    
    
}
