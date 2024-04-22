package com.example.Denishaday5cw1.Denirepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.day5cw1.model.Product;

@Repository
public interface DeniProductRepo extends JpaRepository<DeniProduct,Integer>{
    
}
