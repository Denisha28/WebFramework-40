<<<<<<< HEAD
package com.example.cw3.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    private int productId;
    private String productName, description;
    private double price;
    private int quantity;
=======
package com.example.cw3.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    private int productId;
    private String productName, description;
    private double price;
    private int quantity;
>>>>>>> 31af81c26196f8455dee2e81a03742efec086004
}