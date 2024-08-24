package org.system.design.uber_ola.strategy;

import org.system.design.uber_ola.model.Driver;
import org.system.design.uber_ola.model.TripMetaData;
import org.system.design.uber_ola.service.DriverService;

import java.util.Optional;

public class DefaultDriverMatchingStrategy implements DriverMatchingStrategy {


    @Override
    public Driver matchDriver(TripMetaData tripMetaData) {
        DriverService driverService = DriverService.getDriverService();

        if (driverService.getDriversMap().isEmpty()) {
            System.out.println("There is no drivers!");
        }

        System.out.println("DefaultDriverMatchingStrategy: Setting first available driver");
        Optional<Driver> driver = driverService.getDriversMap().values().stream().filter(Driver::isAvailable).findFirst();
        if (driver.isPresent()) {
            tripMetaData.setDriverRating(driver.get().getRating());
        } else {
            System.out.println("No drivers available");
        }
        return driver.orElse(null);
    }
}
