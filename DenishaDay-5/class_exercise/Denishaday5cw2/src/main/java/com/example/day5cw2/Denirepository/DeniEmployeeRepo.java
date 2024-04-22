package com.example.Denishaday5cw2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Denishaday5cw2.model.DeniEmployee;


@Repository
public interface DeniEmployeeRepo extends JpaRepository<DeniEmployee,Integer>{
    
}
