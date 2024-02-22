package org.system.design;

import org.system.design.products.Vehicle;
import org.system.design.products.VehicleType;
import org.system.design.products.factory.AutoFactory;
import org.system.design.products.factory.CarFactory;
import org.system.design.products.factory.ProductFactory;
import org.system.design.products.factory.TwoWheelerFactory;

import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // without any specification
        Vehicle auto = ProductFactory.createVehicle(VehicleType.AUTO);
        System.out.println(auto);

        // With specification
        Vehicle tw = new TwoWheelerFactory().createVehicle();
        System.out.println(tw);

        Vehicle auto1 = new AutoFactory().createVehicle();
        System.out.println(auto1);
        
        Vehicle car = new CarFactory().createVehicle();
        System.out.println(car);
    }
}