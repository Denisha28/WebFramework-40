package com.example.denicw1.denirepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.denicw1.denimodel.deniEmployee;

public interface deniEmployeeRepo extends JpaRepository<deniEmployee,Integer> {
 
    @Query(value = "SELECT e.* FROM employee e INNER JOIN address a ON e.id = a.employee_id",nativeQuery = true)
    List<deniEmployee> getByInnerEmployees();

    @Query(value = "SELECT e.* FROM employee e LEFT JOIN address a ON e.id = a.employee_id",nativeQuery = true)
    List<deniEmployee> getByLeftOuterEmployees();
}