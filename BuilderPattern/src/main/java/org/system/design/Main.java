package org.system.design;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Car audiCar = Car.builder().setColor("Green").setNoOfGears(5).setModelName("Audi").build();
        System.out.println(audiCar);

        Car benzCar = Car.builder().setColor("Black").setNoOfGears(6).setModelName("Benz").build();
        System.out.println(benzCar);
    }
}