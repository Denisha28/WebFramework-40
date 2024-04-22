package com.example.springapp.Denirepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.springapp.Denimodel.DeniPerson;

public interface DeniPersonRepo extends JpaRepository<DeniPerson, Integer> {
    @Query("SELECT p FROM Person p WHERE age=?1")
    List<DeniPerson> findByAge(int age);
}
