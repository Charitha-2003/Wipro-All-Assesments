package com.movie.movieticketbooking.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.movie.movieticketbooking.model.Movie;
import com.movie.movieticketbooking.repository.MovieRepository;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    // Add a new movie
    public Movie addMovie(Movie movie) {
        return movieRepository.save(movie);
    }

    // Get all movies
    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    // Get a movie by ID
    public Movie getMovieById(Long id) {
        return movieRepository.findById(id).orElse(null);
    }

    // Delete a movie by ID
    public void deleteMovie(Long id) {
        movieRepository.deleteById(id);
    }

    // Update an existing movie by ID
    public Movie updateMovie(Long id, Movie updatedMovie) {
        Movie existingMovie = movieRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Movie not found with id: " + id));

        existingMovie.setName(updatedMovie.getName());
        existingMovie.setGenre(updatedMovie.getGenre());
        existingMovie.setDuration(updatedMovie.getDuration());

        return movieRepository.save(existingMovie);
    }
}
