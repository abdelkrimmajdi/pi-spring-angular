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
@Table(name="user")
public class User {
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="iduser")
    private Long Id;
    @Column(name="name")
    private String name;
    @Column(name="lastname")
    private String lastname;
    @Column(name="email")
    private String email;
    @Column(name="Number")
    private String ContactNumber;
    @Column(name="BirthDate")
    private Date BirthDate;
    @Column(name="password")
    private String password;
    @Column(name="Role")
    @Enumerated(EnumType.STRING)
    private RoleUser roleUser;




    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    private Set<Delivery> Deliverys;
    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Room> rooms;
    @OneToMany(cascade = CascadeType.ALL)
    private Set<WorkoutSession> WorkoutSessions;
    @ManyToOne(cascade = CascadeType.ALL)
    Restaurant restaurant;
    @OneToMany(cascade = CascadeType.ALL)
    private Set<Subscription> Subscriptons;
    @ManyToMany(cascade = CascadeType.ALL)
    private Set<MentorProgram> mentorprograms;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    private Set<Journal> Journals;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    private Set<Post> Posts;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    private Set<Physiotherapist> Physiotherapists;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    private Set<NutrisionistProgram> NutrisionistPrograms;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    private Set<Reclamation> Reclamations;
}
