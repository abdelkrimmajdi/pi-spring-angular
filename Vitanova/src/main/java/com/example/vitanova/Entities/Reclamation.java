package com.example.vitanova.Entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Reclamation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdReclam;
    private TypeReclam ReclamType;
    private Date  ReclamDate;
    private String DescriptionReclam;
    @Enumerated(EnumType.STRING)
    private StateReclam stateReclam;
    @ManyToOne
    User user;
    @OneToMany(cascade = CascadeType.ALL, mappedBy="reclamation")
    private Set<Response> Responses;

}
