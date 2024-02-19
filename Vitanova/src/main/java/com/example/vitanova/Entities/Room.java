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
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdRoom;
    private String userName1;
    private String userName2;
    @OneToMany(cascade = CascadeType.ALL)
    private Set<Message> Messages;
    @ManyToMany(mappedBy="rooms", cascade = CascadeType.ALL)
    private Set<User> users;

}
