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
public class ArticleCart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdArticle;
    private int quantity;
    @ManyToOne(cascade = CascadeType.ALL)
    Cart cart;
    @OneToMany(cascade = CascadeType.ALL)
    private Set<Product> Products;




}
