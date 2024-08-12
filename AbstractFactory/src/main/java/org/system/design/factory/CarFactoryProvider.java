package org.system.design.factory;

public class CarFactoryProvider {

    public static CarFactory getCarFactory(String factoryType) {
        if (factoryType == "Audi") {
            return new AudiCarFactory();
        }
        return new BMWCarFactory();
    }
}
