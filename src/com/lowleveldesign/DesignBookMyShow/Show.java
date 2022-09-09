package com.lowleveldesign.DesignBookMyShow;

import org.joda.time.DateTime;

import java.util.ArrayList;
import java.util.List;

public class Show {
    private DateTime startTime;
    private Long showId;
    private Movie movie;
    private Screen screen;
    private List<Long> bookedSeatId=new ArrayList<>();

    public DateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(DateTime startTime) {
        this.startTime = startTime;
    }

    public Long getShowId() {
        return showId;
    }

    public void setShowId(Long showId) {
        this.showId = showId;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Screen getScreen() {
        return screen;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public List<Long> getBookedSeatId() {
        return bookedSeatId;
    }

    public void setBookedSeatId(List<Long> bookedSeatId) {
        this.bookedSeatId = bookedSeatId;
    }
}
