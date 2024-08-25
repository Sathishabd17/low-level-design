package org.system.design.parkinglot.model.parking_spot;

import org.system.design.parkinglot.model.vehicle_type.Vehicle;

public class MotorCycleSpot extends ParkingSpot {

    public MotorCycleSpot(String id, boolean isAvailable, ParkingSpotType parkingSpotType, Vehicle vehicle) {
        super(id, isAvailable, parkingSpotType, vehicle);
    }
}
