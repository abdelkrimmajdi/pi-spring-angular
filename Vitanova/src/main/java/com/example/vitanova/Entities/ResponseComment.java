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
public class ResponseComment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long IdResponseComment;
    private  String DescriptionResponseComment;
    private Date DateResponseComment;
    @ManyToOne
    Comment comment;

}
