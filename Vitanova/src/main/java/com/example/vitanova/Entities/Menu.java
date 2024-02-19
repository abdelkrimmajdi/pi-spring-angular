package com.example.vitanova.Entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdMenu;
    private int Calories;
    private String Meal;
    @ManyToOne
    NutrisionistProgram nutrisionistprogram;
}
