package org.system.design.uber_ola.model;

public class Rider {

    private String name;

    private Rating rating;

    public Rider(String name, Rating rating) {
        this.name = name;
        this.rating = rating;
    }

    public Rating getRating() {
        return rating;
    }

    public String getName() {
        return name;
    }
}
