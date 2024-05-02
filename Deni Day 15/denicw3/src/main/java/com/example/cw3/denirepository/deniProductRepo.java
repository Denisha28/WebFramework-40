package com.example.cw3.denirepository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.cw3.denimodel.deniProduct;

public interface deniProductRepo extends JpaRepository<deniProduct, Integer>{
    
}