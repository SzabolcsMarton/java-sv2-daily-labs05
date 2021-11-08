package day01;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Cinema {

    private List<Movie> movies = new ArrayList<>();

    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    public List<String> findMovieByTime(LocalDateTime time) {
        List<String> result = new ArrayList<>();

        for (Movie actual : movies) {
            if (checkIfPlayingtime(actual, time)) {
                result.add(actual.getTitle());
            }

        }
        return result;
    }


    public boolean checkIfPlayingtime(Movie movie, LocalDateTime timeTocheck) {

        for (LocalDateTime actual : movie.getPlayingTime()) {
            if (actual.equals(timeTocheck)){
                return true;
            }
        }
        return false;
    }
}
