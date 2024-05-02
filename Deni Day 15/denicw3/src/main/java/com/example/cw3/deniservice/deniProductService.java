package com.example.cw3.deniservice;

import com.example.cw3.denimodel.deniProduct;
import com.example.cw3.denirepository.deniProductRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class deniProductService {

    @Autowired
    private deniProductRepo productRepo;

    public List<deniProduct> getAllProducts() {
        return productRepo.findAll();
    }

    public deniProduct getProductById(int id) {
        return productRepo.findById(id).orElse(null);
    }

    public deniProduct addProduct(deniProduct product) {
        return productRepo.save(product);
    }
}