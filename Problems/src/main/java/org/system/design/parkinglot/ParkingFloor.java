package org.system.design.parkinglot;

import org.system.design.parkinglot.model.parking_spot.ParkingSpot;
import org.system.design.parkinglot.model.vehicle_type.Vehicle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ParkingFloor {

    private int floorNumber;

    private Map<String, ParkingSpot> parkingSpots = new HashMap();

    public ParkingFloor(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public List<ParkingSpot> getAvailableParkingSpots() {
        return parkingSpots.values().stream().filter(ParkingSpot::isAvailable).collect(Collectors.toList());
    }

    public void addParkingSpot(ParkingSpot parkingSpot) {
        this.parkingSpots.put(parkingSpot.getId(), parkingSpot);
    }

    public void removeParkingSpot(String number) {
        this.parkingSpots.remove(number);
    }
}
