package org.system.design.products.factory;

import org.system.design.products.Auto;
import org.system.design.products.Car;
import org.system.design.products.VehicleType;
import org.system.design.products.TwoWheeler;
import org.system.design.products.Vehicle;

public abstract class ProductFactory {

    // useful to create generic product without any specification
    public static Vehicle createVehicle(VehicleType vehicleType) {
        return switch (vehicleType) {
            case TWO_WHEELER -> new TwoWheeler();
            case AUTO -> new Auto();
            case CAR -> new Car();
            default -> null;
        };
    }

    // useful to create product with any specification
    public abstract Vehicle createVehicle();
}
