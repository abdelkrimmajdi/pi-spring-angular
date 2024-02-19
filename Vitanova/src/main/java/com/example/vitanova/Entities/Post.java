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

public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdPost;
    private String DescriptionPost;
     private Date DatePost;
    @ManyToOne
    User user;
    @OneToMany(cascade = CascadeType.ALL, mappedBy="post")
    private Set<Like> Likes;
    @OneToMany(cascade = CascadeType.ALL, mappedBy="post")
    private Set<Comment> Comments;
}
