package com.example.springapp.Denirepositorymport org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.springapp.Denimodel.DeniPerson;
import java.util.List;


@Repository
public interface DeniPersonRepo extends JpaRepository<DeniPerson,Integer>{

    List<DeniPerson> findByNameStartingWith(String name);
    List<DeniPerson> findByNameEndingWith(String name);
    
}
