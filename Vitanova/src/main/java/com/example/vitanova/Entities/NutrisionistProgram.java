package com.example.vitanova.Entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class NutrisionistProgram {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdNutrisionistProgram;
    private String NomNutrisionistProgram;
    private int DurationNutrisionistProgram;
    @ManyToOne
    User user;
}
