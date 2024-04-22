package com.example.Denicw2.Denirepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Denicw2.Denimodel.DeniStudent;

@Repository
public interface DeniStudentRepo extends JpaRepository<DeniStudent, Integer> {

}