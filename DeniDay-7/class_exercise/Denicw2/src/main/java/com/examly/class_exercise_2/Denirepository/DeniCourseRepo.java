package com.examly.Denicw2.Denirepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examly.Denicw2.Denimodel.DeniCourse;

@Repository
public interface DeniCourseRepo extends JpaRepository<DeniCourse, Integer> {

     List<DeniCourse> findByCourseName(String courseName);

}