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
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdRest;
    private String name;
    @OneToMany(cascade = CascadeType.ALL)
    private Set<Meal> Meals;

}
