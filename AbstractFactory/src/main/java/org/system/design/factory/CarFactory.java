package org.system.design.factory;

import org.system.design.products.Car;

public interface CarFactory {

    Car createCar(String modelName);
}
