package com.examly.springapp.Denirepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.examly.springapp.Denimodel.DeniDoor;

// import jakarta.transaction.Transactiona

@Repository
public interface DeniDoorRepo extends JpaRepository<DeniDoor, Integer> {

    @Query(value = "DELETE FROM Door WHERE Door_id = ?1", nativeQuery = true)
    void deleteDoor(int DoorId);

    public List<DeniDoor> findByColor(String color);

    public List<DeniDoor> findByDoorType(String doortype);
}
