package com.example.vitanova.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PersonalObjectif {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdPerOb;
    private String Title;
    private String Description;
    private int priorite;
    private Date EndDate;
    private State statut;
}
