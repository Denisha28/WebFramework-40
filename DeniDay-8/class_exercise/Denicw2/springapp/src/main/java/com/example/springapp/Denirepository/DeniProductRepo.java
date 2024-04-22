package com.example.springapp.Denirepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.springapp.Denimodel.DeniProduct;
import java.util.List;


@Repository
public interface DeniProductRepo extends JpaRepository<DeniProduct,Integer>{

    List<DeniProduct> findByProductNameStartingWith(String name);
    List<DeniProduct> findByProductNameEndingWith(String name);
    
}
