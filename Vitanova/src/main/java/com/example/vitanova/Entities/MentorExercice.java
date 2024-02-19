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
public class MentorExercice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdExercice;
    private String nama;
    private String Description;
    private int priority;
    private String picture;


}
