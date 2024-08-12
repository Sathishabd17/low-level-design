package org.system.design;

import org.system.design.factory.CarFactory;
import org.system.design.factory.CarFactoryProvider;
import org.system.design.products.Car;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");

        CarFactory audiFactory = CarFactoryProvider.getCarFactory("Audi");
        Car normalAudi = audiFactory.createCar("Normal");
        System.out.println(normalAudi.toString());
        
        CarFactory bmwFactory = CarFactoryProvider.getCarFactory("BMW");
        Car sportsBMW =  bmwFactory.createCar("Sports");
        System.out.println(sportsBMW);
    }
}