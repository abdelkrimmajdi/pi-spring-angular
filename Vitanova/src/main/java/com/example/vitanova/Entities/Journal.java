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
public class Journal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdJo;
    private String reflexion;
    @OneToMany(cascade = CascadeType.ALL)
    private Set<PersonalObjectif> PersonalObjectifs;
    @ManyToOne
    User user;

}
