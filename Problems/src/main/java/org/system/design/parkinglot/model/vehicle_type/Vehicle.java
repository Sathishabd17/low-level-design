package org.system.design.parkinglot.model.vehicle_type;

import org.system.design.parkinglot.model.ParkingTicket;

public class Vehicle {

    private VehicleType vehicleType;

    private String vehicleNumber;

    private ParkingTicket parkingTicket;

    public Vehicle(VehicleType vehicleType, String vehicleNumber, ParkingTicket parkingTicket) {
        this.vehicleType = vehicleType;
        this.vehicleNumber = vehicleNumber;
        this.parkingTicket = parkingTicket;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }
}
