package com.examly.Denicw1.Denirepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examly.Denicw1.Denimodel.DeniPerson;

/**
 * PersonRepo
 */
@Repository
public interface DeniPersonRepo extends JpaRepository<DeniPerson, Integer> {

     List<DeniPerson> findByAge(int byAge);
}