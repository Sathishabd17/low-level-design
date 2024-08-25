package org.system.design.parkinglot.model;

public class Location {

    private String streetAddress;

    private String city;

    private String state;

    private String country;

    private String pinCode;

    public Location(String streetAddress, String city, String state, String country, String pinCode) {
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.country = country;
        this.pinCode = pinCode;
    }
}
