package com.example.denicw1.denirepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.denicw1.denimodel.deniBook;
@Repository
public interface deniBookRepository extends JpaRepository<deniBook, Long> {
}
