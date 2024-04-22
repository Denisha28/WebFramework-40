package com.example.day6cw3.Deniservice;

import java.util.List;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.day6cw3.Denimodel.DeniProduct;
import com.example.day6cw3.Denirepository.DeniProductRepo;

@Service
public class DeniProductService {
    public DeniProductRepo productRepo;
    public DeniProductService(DeniProductRepo productRepo)
    {
        this.productRepo = productRepo;
    }
    public boolean postProduct(DeniProduct product)
    {
        try{

            productRepo.save(product);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public List<DeniProduct> pagination(int offset,int size)
    {
        return productRepo.findAll(PageRequest.of(offset, size)).getContent();
    }
    public List<DeniProduct> sortPagination(int offset,int size,String field)
    {
        return productRepo.findAll(PageRequest.of(offset, size, Sort.by(field))).getContent();
    }
    public DeniProduct getProductById(int id)
    {
        return productRepo.findById(id).orElse(null);
    }
}
