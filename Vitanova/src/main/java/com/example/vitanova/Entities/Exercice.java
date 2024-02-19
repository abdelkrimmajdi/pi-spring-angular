package com.example.vitanova.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Exercice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdExer;
    private String NameExer;
    private String DescriptionExe;
    private int DurationExer;
    private Intensity intensity;
    private String Muscle;
    private String picture;

}
