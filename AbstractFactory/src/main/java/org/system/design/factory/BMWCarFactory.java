package org.system.design.factory;

import org.system.design.products.BMWNormal;
import org.system.design.products.BMWSports;
import org.system.design.products.Car;

public class BMWCarFactory implements CarFactory {

    @Override
    public Car createCar(String modelName) {
        if (modelName == "Normal") {
            return new BMWNormal();
        }
        return new BMWSports();
    }
}
