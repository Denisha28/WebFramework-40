package com.example.springapp.Denirepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.example.springapp.Denimodel.DeniRecipe;
import java.util.List;


@Repository
public interface DeniRecipeRepo extends JpaRepository<DeniRecipe,Integer>{

    @Query("select r from Recipe r where recipeName=?1")
    List<DeniRecipe> findByProduct(String name);
    
}
