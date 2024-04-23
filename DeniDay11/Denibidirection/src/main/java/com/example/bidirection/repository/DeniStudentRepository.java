package com.example.bidirection.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bidirection.model.DeniStudent;



@Repository
public interface DeniStudentRepository extends JpaRepository<DeniStudent,Integer>{
    
}
