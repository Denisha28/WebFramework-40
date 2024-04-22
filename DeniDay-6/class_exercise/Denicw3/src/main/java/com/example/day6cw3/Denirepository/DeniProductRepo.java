package com.example.day6cw3.Denirepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.day6cw3.Denimodel.DeniProduct;

@Repository
public interface DeniProductRepo extends JpaRepository<DeniProduct,Integer>{
    
}
