package ra.ss11.service;


import ra.ss11.model.Movie;

public interface MovieService {
    Movie findByTitle(String title);
}