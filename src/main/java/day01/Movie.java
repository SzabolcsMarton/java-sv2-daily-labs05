package day01;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Movie {
    private String title;
    private List<LocalDateTime> playingTime = new ArrayList<>();

    public Movie(String name, List<LocalDateTime> onScreen) {
        this.title = name;
        this.playingTime = onScreen;
    }

    public String getTitle() {
        return title;
    }

    public List<LocalDateTime> getPlayingTime() {
        return playingTime;
    }
}
