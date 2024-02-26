package com.example.vitanova.Service;

import com.example.vitanova.Entities.Categorie;
import com.example.vitanova.Entities.Product;

import java.util.List;

public interface ProductService {
    Product save(Product product);
    Product findById(Long IdProduct);
    Product findByName(String nameProd);
    List<Product> findAll();
    List<Product> findAllByCategorie(Categorie categorie);

    static void delete(Long IdProduct) {

    }

}
