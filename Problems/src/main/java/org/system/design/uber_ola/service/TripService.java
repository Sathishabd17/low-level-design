package org.system.design.uber_ola.service;

import org.system.design.uber_ola.model.Driver;
import org.system.design.uber_ola.model.Location;
import org.system.design.uber_ola.model.Rider;
import org.system.design.uber_ola.model.Trip;
import org.system.design.uber_ola.model.TripMetaData;
import org.system.design.uber_ola.model.TripStatus;
import org.system.design.uber_ola.strategy.DriverMatchingStrategy;
import org.system.design.uber_ola.strategy.PricingStrategy;

import java.util.HashMap;
import java.util.Map;

public class TripService {

    private static TripService tripServiceInstance = null;

    private final Map<Integer, TripMetaData> tripMetaDataMap = new HashMap<>();

    private final Map<Integer, Trip> tripMap = new HashMap<>();

    private TripService() {
    }

    public static synchronized TripService getTripServiceInstance() {
        if (tripServiceInstance == null) {
            tripServiceInstance = new TripService();
        }
        return tripServiceInstance;
    }

    public Map<Integer, TripMetaData> getTripMetaDataMap() {
        return tripMetaDataMap;
    }

    public Map<Integer, Trip> getTripMap() {
        return tripMap;
    }

    public void createTrip(Rider rider, Location source, Location destination) {

        TripMetaData tripMetaData = new TripMetaData(source, destination, rider.getRating());
        StrategyService strategyService = StrategyService.getStrategyServiceInstance();
        PricingStrategy pricingStrategy = strategyService.determinePricingStrategy(tripMetaData);
        DriverMatchingStrategy driverMatchingStrategy = strategyService.determineDriverMatchingStrategy(tripMetaData);

        Driver driver = driverMatchingStrategy.matchDriver(tripMetaData);
        double price = pricingStrategy.calculatePrice(tripMetaData);

        Trip trip = new Trip(source, destination, price, TripStatus.DRIVER_ON_THE_WAY, rider, driver,
                driverMatchingStrategy, pricingStrategy);
        int tripId = trip.getTripId();
        tripMetaDataMap.put(tripId, tripMetaData);
        tripMap.put(tripId, trip);
    }
}
