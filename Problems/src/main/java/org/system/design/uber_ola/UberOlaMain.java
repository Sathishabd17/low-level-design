package org.system.design.uber_ola;

import org.system.design.Main;
import org.system.design.uber_ola.model.Driver;
import org.system.design.uber_ola.model.Location;
import org.system.design.uber_ola.model.Rating;
import org.system.design.uber_ola.model.Rider;
import org.system.design.uber_ola.model.Trip;
import org.system.design.uber_ola.service.DriverService;
import org.system.design.uber_ola.service.RiderService;
import org.system.design.uber_ola.service.TripService;

import java.util.Map;

public class UberOlaMain {

    public static void main(String[] args) {
        //---------------Creating Riders and Drivers--------------------------------
        Rider rider = new Rider("Rider", Rating.FIVE_STARS);
        Rider rider1 = new Rider("Rider 1", Rating.THREE_STARS);
        RiderService riderService = RiderService.getRiderServiceInstance();
        riderService.addRider(rider);
        riderService.addRider(rider1);

        Driver driver = new Driver("Driver", Rating.THREE_STARS);
        driver.setAvailable(true);
        Driver driver1 = new Driver("Driver 1", Rating.FOUR_STARS);
        driver1.setAvailable(true);
        DriverService driverService = DriverService.getDriverService();
        driverService.addDriver(driver);
        driverService.addDriver(driver1);

        //These details in turn will be stored in database
        //-------------------------------------------------------------------------

        TripService tripService = TripService.getTripServiceInstance();

        System.out.println("Creating Trip for Rider from location (10,10) to (30,30)");
        tripService.createTrip(rider, new Location(10, 10), new Location(30, 30));

        System.out.println("Creating Trip for Gaurav from location (200,200) to (500,500)");
        tripService.createTrip(rider1, new Location(200, 200), new Location(500, 500));

        //-------------------Display all the trips created--------------------------
        Map<Integer, Trip> tripsMap = tripService.getTripMap();
        for (Trip trip : tripsMap.values()) {
            trip.getTripDetails();
        }

    }
}
