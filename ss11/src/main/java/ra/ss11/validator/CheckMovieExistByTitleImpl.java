package ra.ss11.validator;


import org.springframework.beans.factory.annotation.Autowired;
import ra.ss11.model.Movie;
import ra.ss11.service.MovieService;


import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CheckMovieExistByTitleImpl implements
        ConstraintValidator<CheckMovieExistByTitle, String> {

    @Autowired
    private MovieService movieService;

    @Override
    public boolean isValid(String title, ConstraintValidatorContext context) {
        Movie movie = movieService.findByTitle(title);
        // movie: null => thêm movie vào db
        // movie: not null => gửi message ra ngoài title
        if (movie == null) {
            return true;
        }
        return false;
    }
}