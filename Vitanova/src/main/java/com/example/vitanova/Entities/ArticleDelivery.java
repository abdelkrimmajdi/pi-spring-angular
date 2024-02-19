package com.example.vitanova.Entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ArticleDelivery {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdArticleDel;
    private int quantityArtcom;
    @ManyToOne
    Delivery delivery;
    @OneToMany(cascade = CascadeType.ALL)
    private Set<Product> Products;
}
