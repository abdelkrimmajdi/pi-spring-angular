package com.example.vitanova.Entities;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Data
@Entity
@Table(name = "user")
public class User implements UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;

    @Enumerated(EnumType.STRING)

    private Role role;


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(new SimpleGrantedAuthority(role.name()));
    }

    @Override
    public String getUsername() {
        return email;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }





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
