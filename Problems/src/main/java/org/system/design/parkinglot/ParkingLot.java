package org.system.design.parkinglot;

import org.system.design.parkinglot.model.Location;

import java.util.Map;

public class ParkingLot {

    private int id;

    private Location location;

    private Long maxCapacity;

    private Long capacityCount = 0L;

    private Map<Integer, ParkingFloor> parkingFloors;

    private ParkingLot parkingLotInstance =  null;

    private ParkingLot() {
    }

    public synchronized ParkingLot getParkingLotInstance() {
        if (parkingLotInstance == null) {
            parkingLotInstance = new ParkingLot();
        }
        return parkingLotInstance;
    }

    public boolean isSpotAvailable() {
        return capacityCount <= maxCapacity;
    }
}
