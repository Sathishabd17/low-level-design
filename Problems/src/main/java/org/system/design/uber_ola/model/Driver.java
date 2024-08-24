package org.system.design.uber_ola.model;

public class Driver {

    private String name;

    private boolean isAvailable;

    private Rating rating;

    public Driver(String name, Rating rating) {
        this.name = name;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public Rating getRating() {
        return rating;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
