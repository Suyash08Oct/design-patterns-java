package com.pattern.facade;

public class PenDrive {
    private String movie;

    public PenDrive(String movie) {
        this.movie = movie;
    }

    public String getMovieName() {
        return movie;
    }
}
