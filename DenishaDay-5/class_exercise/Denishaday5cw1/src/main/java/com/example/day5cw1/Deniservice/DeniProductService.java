package com.example.Denishaday5cw1.Deniservice;

import org.springframework.stereotype.DeniService;

import com.example.Denishaday5cw1.model.DeniProduct;
import com.example.Denishaday5cw1.repository.DeniProductRepo;

@Service
public class DeniProductService {
    public DeniProductRepo productRepo;
    public DeniProductService(DeniProductRepo productRepo)
    {
        this.productRepo = productRepo;
    }
    public boolean saveProduct(DeniProduct product)
    {
        try
        {
            productRepo.save(product);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public boolean updateDetails(int id,DeniProduct product)
    {
        if(this.getProductById(id)==null)
        {
            return false;
        }
        try{
            productRepo.save(product);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public boolean deleteProduct(int id)
    {
        if(this.getProductById(id) == null)
        {
            return false;
        }
        productRepo.deleteById(id);
        return true;
    }
    public DeniProduct getProductById(int id)
    {
        return productRepo.findById(id).orElse(null);
    }
}
