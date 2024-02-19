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

public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdComment;
    private  String DescriptionComment;
    private Date DateComment;
    @ManyToOne
    Post post;
    @OneToMany(cascade = CascadeType.ALL, mappedBy="comment")
    private Set<ResponseComment> ResponseComments;}
