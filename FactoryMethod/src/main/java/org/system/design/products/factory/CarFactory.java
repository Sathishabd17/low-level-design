package org.system.design.products.factory;

import org.system.design.products.Car;
import org.system.design.products.Vehicle;

public class CarFactory extends ProductFactory {

    @Override
    public Vehicle createVehicle() {
        Car car = new Car();
        car.setGears(6);
        return car;
    }
}
