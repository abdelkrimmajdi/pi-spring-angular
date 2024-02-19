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
public class MentorProgram {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdMentorProg;
    private String name;
    private String Description;
    private String Type;
    private String Objectf;
    private int Duree;
    private String picture;

    @ManyToMany(cascade = CascadeType.ALL)
    private Set<MentorExercice> mentorexercices;


}
