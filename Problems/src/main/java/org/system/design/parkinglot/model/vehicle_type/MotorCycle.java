package org.system.design.parkinglot.model.vehicle_type;

import org.system.design.parkinglot.model.ParkingTicket;

public class MotorCycle extends Vehicle {

    public MotorCycle(VehicleType vehicleType, String vehicleNumber, ParkingTicket parkingTicket) {
        super(vehicleType, vehicleNumber, parkingTicket);
    }
}
