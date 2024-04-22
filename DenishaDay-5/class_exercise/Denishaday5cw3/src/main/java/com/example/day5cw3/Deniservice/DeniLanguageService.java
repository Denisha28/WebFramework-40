package com.example.Denishaday5cw3.Deniservice;

import java.util.List;

import org.springframework.stereotype.DeniService;

import com.example.Denishaday5cw3.model.DeniLanguage;
import com.example.Denishaday5cw3.repository.DeniLanguageRepo;

@Service
public class DeniLanguageService {
    private DeniLanguageRepo languageRepo;
    public DeniLanguageService(DeniLanguageRepo languageRepo)
    {
        this.languageRepo=languageRepo;
    }
    public boolean saveLanguage(DeniLanguage language)
    {
        try
        {
            languageRepo.save(language);

        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public List<DeniLanguage> getLanguages()
    {
        return languageRepo.findAll();
    }
    public boolean updateLanguage(int id,DeniLanguage language)
    {
        if(getLanguageById(id)==null)
        {
            return false;
        }
        try{
            languageRepo.save(language);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public boolean deleteLanguage(int id)
    {
        if(getLanguageById(id)==null)
        {
            return false;
        }
        languageRepo.deleteById(id);
        return true;
        
    }
    public DeniLanguage getLanguageById(int id)
    {
        return languageRepo.findById(id).orElse(null);
    }

}
