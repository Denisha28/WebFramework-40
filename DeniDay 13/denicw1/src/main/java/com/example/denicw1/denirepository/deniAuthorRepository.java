package com.example.denicw1.denirepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.denicw1.denimodel.deniAuthor;
@Repository
public interface deniAuthorRepository extends JpaRepository<deniAuthor, Long> {
}
