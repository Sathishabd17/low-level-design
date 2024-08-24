package org.system.design.uber_ola.model;

public class TripMetaData {

    private Location source;

    private Location destination;

    private Rating riderRating;

    private Rating driverRating;

    public TripMetaData(Location source, Location destination, Rating riderRating) {
        this.source = source;
        this.destination = destination;
        this.riderRating = riderRating;
    }

    public Location getSource() {
        return source;
    }

    public Location getDestination() {
        return destination;
    }

    public Rating getRiderRating() {
        return riderRating;
    }

    public Rating getDriverRating() {
        return driverRating;
    }

    public void setDriverRating(Rating driverRating) {
        this.driverRating = driverRating;
    }
}
