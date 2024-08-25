package org.system.design.parkinglot.model.parking_spot;

import org.system.design.parkinglot.model.vehicle_type.Vehicle;

public class ParkingSpot {

    private String id;

    private boolean isAvailable;

    private ParkingSpotType parkingSpotType;

    private Vehicle vehicle;

    public ParkingSpot(String id, boolean isAvailable, ParkingSpotType parkingSpotType, Vehicle vehicle) {
        this.id = id;
        this.isAvailable = isAvailable;
        this.parkingSpotType = parkingSpotType;
        this.vehicle = vehicle;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public ParkingSpotType getParkingSpotType() {
        return parkingSpotType;
    }

    public void assignVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void removeVehicle() {
        this.vehicle = null;
    }

    public String getId() {
        return id;
    }
}
