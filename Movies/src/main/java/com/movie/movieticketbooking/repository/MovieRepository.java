package com.movie.movieticketbooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.movie.movieticketbooking.model.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {
    // no need to write any code, JPA provides built-in methods
}
