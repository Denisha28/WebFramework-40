package com.example.denicw2.denirepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.denicw2.denimodel.deniBook;

@Repository
public interface deniBookRepo extends JpaRepository<deniBook,Integer> {
    
}
