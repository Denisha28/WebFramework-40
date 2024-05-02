package com.example.cw4.denirepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.cw4.denimodel.deniCompany;

@Repository
public interface deniCompanyRepository extends JpaRepository<deniCompany, Integer> {
}