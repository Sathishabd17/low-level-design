package org.system.design.uber_ola.model;

import org.system.design.uber_ola.strategy.DriverMatchingStrategy;
import org.system.design.uber_ola.strategy.PricingStrategy;

public class Trip {

    private Location source;

    private Location destination;

    private double price;

    private TripStatus tripStatus;

    private Integer tripId;

    private Rider rider;

    private Driver driver;

    private DriverMatchingStrategy driverMatchingStrategy;

    private PricingStrategy pricingStrategy;

    private Integer tripIdCounter = 1;

    public Trip(Location source, Location destination, double price, TripStatus tripStatus, Rider rider, Driver driver, DriverMatchingStrategy driverMatchingStrategy, PricingStrategy pricingStrategy) {
        this.source = source;
        this.destination = destination;
        this.price = price;
        this.tripStatus = tripStatus;
        this.rider = rider;
        this.driver = driver;
        this.driverMatchingStrategy = driverMatchingStrategy;
        this.pricingStrategy = pricingStrategy;

        this.tripId = tripIdCounter;
        tripIdCounter++;
    }

    public Integer getTripId() {
        return tripId;
    }

    public String getTripDetails() {
        return "Trip{" +
                "source=" + source +
                ", destination=" + destination +
                ", price=" + price +
                ", tripStatus=" + tripStatus +
                ", tripId='" + tripId + '\'' +
                ", rider=" + rider +
                ", driver=" + driver +
                '}';
    }
}
