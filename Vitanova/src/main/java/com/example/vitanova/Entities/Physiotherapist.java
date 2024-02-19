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
public class Physiotherapist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdPhy;
    private String Phyname;
    @ManyToOne
    User user;
    @OneToMany(cascade = CascadeType.ALL, mappedBy="physiotherapist")
    private Set<SessionPhysiotherapist> SessionPhysiotherapists;
}
