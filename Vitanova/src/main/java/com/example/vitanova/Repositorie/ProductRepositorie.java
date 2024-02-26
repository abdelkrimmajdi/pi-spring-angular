package com.example.vitanova.Repositorie;

import com.example.vitanova.Entities.Categorie;
import com.example.vitanova.Entities.Product;
import com.example.vitanova.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepositorie extends JpaRepository<Product,Long> {

    List<Product> findAllByCategorie(Categorie categorie);
    List<Product> findAll();
    Product findByName(String nameProd);
    Product findById(Long IdProduct);
    Product save(Product product);
    void delete(Long IdProduct);

}
