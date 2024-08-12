package org.system.design.factory;

import org.system.design.products.AudiNormal;
import org.system.design.products.AudiSports;
import org.system.design.products.Car;

public class AudiCarFactory implements CarFactory {

    @Override
    public Car createCar(String modelName) {
        if (modelName == "Normal") {
            return new AudiNormal();
        }
        return new AudiSports();
    }
}
