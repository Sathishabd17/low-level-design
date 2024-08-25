package org.system.design.parkinglot.model;

import org.system.design.parkinglot.ParkingFloor;
import org.system.design.parkinglot.model.parking_spot.ParkingSpot;
import org.system.design.parkinglot.model.vehicle_type.Vehicle;

import java.util.Date;

public class ParkingTicket {

    private String ticketNumber;

    private double parkingFee;

    private ParkingFloor parkingFloor;

    private ParkingSpot parkingSpot;

    private Vehicle vehicle;

    private ParkingTicketStatus status;

    private Date issuedAt;

    private Date paidAt;

    private Customer customer;

    public ParkingTicket(String ticketNumber, double parkingFee, ParkingFloor parkingFloor, ParkingSpot parkingSpot, Vehicle vehicle, ParkingTicketStatus status, Date issuedAt, Date paidAt, Customer customer) {
        this.ticketNumber = ticketNumber;
        this.parkingFee = parkingFee;
        this.parkingFloor = parkingFloor;
        this.parkingSpot = parkingSpot;
        this.vehicle = vehicle;
        this.status = status;
        this.issuedAt = issuedAt;
        this.paidAt = paidAt;
        this.customer = customer;
    }

    public void setStatus(ParkingTicketStatus status) {
        this.status = status;
    }

    public ParkingTicketStatus getStatus() {
        return status;
    }
}
