package com.example.springapp.Denirepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.springapp.Denimodel.DeniDoor;
import java.util.List;

@Repository
public interface DeniDoorRepo extends JpaRepository<DeniDoor,Integer>{

    List<DeniDoor> findByDoorId(int doorId);
    List<DeniDoor> findByAccessType(String accessType);
    
}
