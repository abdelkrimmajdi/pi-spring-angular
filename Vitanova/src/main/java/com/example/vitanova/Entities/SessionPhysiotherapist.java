package com.example.vitanova.Entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class SessionPhysiotherapist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdsessionPhy;
    @ManyToOne
    Physiotherapist physiotherapist;
}