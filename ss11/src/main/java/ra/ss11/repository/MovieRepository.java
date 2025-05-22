package ra.ss11.repository;


import ra.ss11.model.Movie;

public interface MovieRepository {
    Movie findByTitle(String title);
}