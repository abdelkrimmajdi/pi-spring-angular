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
public class Delivery {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdDelivery;
    private String EtatDelivery;
    @ManyToOne
    User user;
    @OneToOne
    private Cart cart;
    @OneToMany(cascade = CascadeType.ALL, mappedBy="delivery")
    private Set<ArticleDelivery> ArticleDeliverys;

}
