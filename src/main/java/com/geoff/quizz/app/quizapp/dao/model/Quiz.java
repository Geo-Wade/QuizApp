package com.geoff.quizz.app.quizapp.dao.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Quiz {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer key;
    String Title;
    @ManyToMany
    List<Question> questions;
}
