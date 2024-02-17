package com.example.vitanova.Entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
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

}
