package com.examly.springapp.Denirepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.examly.springapp.Denimodel.DeniStudent;
import java.util.List;

@Repository
public interface DeniStudentRepo extends JpaRepository<DeniStudent, Long> {

    List<DeniStudent> findByMarksGreaterThan(int mark);

    List<DeniStudent> findByMarksLessThan(int mark);

}
