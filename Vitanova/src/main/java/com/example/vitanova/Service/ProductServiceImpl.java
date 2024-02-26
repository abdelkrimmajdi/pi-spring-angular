package com.example.vitanova.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.example.vitanova.Entities.Categorie;
import com.example.vitanova.Entities.Product;
import com.example.vitanova.Repositorie.ProductRepositorie;


import com.example.vitanova.exception.EntityNotFoundException;
import com.example.vitanova.exception.ErrorCode;
import com.example.vitanova.exception.InvalidEntityException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ProductServiceImpl {
    private static final Logger log = LoggerFactory.getLogger(ProductServiceImpl.class);

    private ProductRepositorie productRepository;

    // Assuming you have a constructor to inject the repository
    public ProductServiceImpl(ProductRepositorie productRepository) {
        this.productRepository = productRepository;
    }

    public Product save(Product product) {
        List<String> errors = ProductValidator.validate(product);
        if (!errors.isEmpty()) {
            log.error("Le produit n'est pas valide");
            throw new InvalidEntityException("Le produit n'est pas valide", ErrorCode.PRODUCT_NOT_VALID, errors);
        }

        return Product.fromEntity(productRepository.save(Product.toEntity(product)));
    }

    public Product findById(Long IdProduct) {
        if (IdProduct == null) {
            log.error("Product ID est null");
            return null;
        }

        Product productOptional = productRepository.findById(IdProduct);
        Product product = productOptional.hashCode(() -> new EntityNotFoundException(
                "Aucun produit avec l'id = " + IdProduct + " n'est trouvé dans la BDD", ErrorCode.PRODUCT_NOT_FOUND));

        return Product.fromEntity(product);
    }

    public Product findByName(String nameProd) {
        if (nameProd == null) {
            log.error("Le nom du produit est null");
            return null;
        }

        Product product = productRepository.findByName(nameProd);
        return Optional.ofNullable(product)
                .orElseThrow(() -> new EntityNotFoundException(
                        "Aucun produit avec le nom " + nameProd + " n'est trouvé dans la BDD", ErrorCode.PRODUCT_NOT_FOUND));
    }

    public List<Product> findAll() {
        return productRepository.findAll().stream().map(Product::fromEntity).collect(Collectors.toList());
    }

    public List<Product> findAllByCategorie(Categorie categorie) {
        return productRepository.findAllByCategorie(categorie).stream().map(Product::fromEntity)
                .collect(Collectors.toList());
    }

    public void deleteById(Long IdProduct) {
        if (IdProduct == null) {
            log.error("Impossible de supprimer l'artile, l'id est null");
            return;
        }
        ProductRepositorie.delete(IdProduct);
    }
}