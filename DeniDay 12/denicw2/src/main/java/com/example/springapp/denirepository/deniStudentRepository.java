package com.example.springapp.denirepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.springapp.denimodel.deniStudent;
@Repository
public interface deniStudentRepository extends JpaRepository<deniStudent,Integer>{
  
    @Query(value="select s.* from student s inner join student_detail st on s.id=st.student_id",nativeQuery = true)
    List<deniStudent>getStudentInner();

    @Query(value="select s.* from student s left outer join student_detail st on s.id=st.student_id",nativeQuery = true)
    List<deniStudent> getStudentsLeftOuter();

    

    
}
