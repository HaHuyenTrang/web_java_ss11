package ra.ss11.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ra.ss11.model.Movie;
import ra.ss11.repository.MovieRepository;

@Service
public class MovieServiceImpl implements MovieService {
    @Autowired
    private MovieRepository movieRepo;

    @Override
    public Movie findByTitle(String title) {
        return movieRepo.findByTitle(title);
    }
}