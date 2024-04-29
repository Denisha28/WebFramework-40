package com.example.denicw1.denirepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.denicw1.denimodel.deniPayroll;

@Repository
public interface deniPayrollRepo extends JpaRepository<deniPayroll,Long> {
    
}
