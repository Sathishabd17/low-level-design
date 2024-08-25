package org.system.design.parkinglot.model.vehicle_type;

import org.system.design.parkinglot.model.ParkingTicket;

public class Car extends Vehicle {

    public Car(VehicleType vehicleType, String vehicleNumber, ParkingTicket parkingTicket) {
        super(vehicleType, vehicleNumber, parkingTicket);
    }
}
