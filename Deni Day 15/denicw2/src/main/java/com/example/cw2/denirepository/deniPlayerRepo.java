package com.example.cw2.denirepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.cw2.denimodel.deniPlayer;

public interface deniPlayerRepo extends JpaRepository<deniPlayer, Integer>{
    
}
