package com.example.cw4.deniservice;

import com.example.cw4.denimodel.deniCompany;
import com.example.cw4.denirepository.deniCompanyRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class deniCompanyService {

    @Autowired
    private deniCompanyRepository companyRepository;

    public List<deniCompany> getAllCompanies() {
        return companyRepository.findAll();
    }

    public deniCompany getCompanyById(int id) {
        return companyRepository.findById(id).orElse(null);
    }

    public deniCompany addCompany(deniCompany company) {
        return companyRepository.save(company);
    }
}