package com.example.springapp.Denirepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.example.springapp.Denimodel.DeniVillage;
import java.util.List;

@Repository
public interface DeniVillageRepo extends JpaRepository<DeniVillage, Integer> {

    @Query("select v from Village as v where v.villageName=?1")
    DeniVillage findByName(String villageName);

    @Query("select v from Village as v where v.villageId=?1")
    DeniVillage findById(int id);

    @Query("select v from Village as v where v.villagePopulation=?1")
    List<DeniVillage> findByPopulation(int population);

}
