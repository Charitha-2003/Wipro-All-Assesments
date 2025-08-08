package com.example.moviebooking.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Theater {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String location;

    @ManyToMany(mappedBy = "theaters")
    private List<Movie> movies;

    // Getters and Setters
}